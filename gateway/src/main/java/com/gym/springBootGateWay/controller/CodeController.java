package com.gym.springBootGateWay.controller;

import com.gym.entity.Staff;
import com.gym.springBootGateWay.service.IStaffService;
import com.gym.springBootGateWay.util.ReturnInfo;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

@Controller
public class CodeController {

    @Resource
    private IStaffService iStaffService;

    //每天的凌晨11点执行一次  检查员工请假日期是否到达截止日期 并修改状态
    @Scheduled(cron="0 0 23 * * ?")
    //@Scheduled(cron="*/5 * * * * ?")
    @RequestMapping("ckdAndUpdStaffState")
    public int updExpireUser(){
        System.out.println("每天检查员工请假日期是否到达截止日期 并修改状态");
        return iStaffService.ckdAndUpdStaffState();
    }

    @RequestMapping("getCode")
    @CrossOrigin
    @ResponseBody
    public ReturnInfo s(Staff staff){
        Staff staf = iStaffService.showStaffPhone(staff);
        if(staf==null){
            return new ReturnInfo(404,staf);
        }
        int code=sendPhoneAuthCode(staff.getStaff_phone());
        System.out.println(code);
        return new ReturnInfo(code,staf);
    }

    @RequestMapping("callPhone")
    @CrossOrigin
    @ResponseBody
    public void callPhone(){
        System.out.println("提交申请成功  发送短信");
        sendPhoneAuthCode("13603771440");
    }

    @RequestMapping("callPhoneBossPass")
    @CrossOrigin
    @ResponseBody
    public int callPhoneBossPass(String leave_id,String staff_id,String leave_time,String leave_deadline){
        System.out.println("联系上级");

        int res=iStaffService.updStaffLeave(leave_id);
        if(res>0){
            System.out.println("审核通过（修改完成）");
        }
        System.out.println("修改课程状态==========");
        int i=iStaffService.updCourseState(staff_id,leave_time,leave_deadline);
        if(i>0){
            System.out.println("修改课程  success");
        }
        int ii=iStaffService.updateStaffLeaveById(staff_id);
        if(ii>0){
            System.out.println("员工请假状态 success");
        }
        return res;
    }

    @RequestMapping("callPhoneBossFail")
    @CrossOrigin
    @ResponseBody
    public int callPhoneBossFail(String leave_id,String staff_id){
        System.out.println("被老板驳回了");
        //sendPhoneAuthCode("13603771440");
        int res=iStaffService.updStaffLeaveFail(leave_id,staff_id);
        if(res>0){
            System.out.println("员工请求驳回成功");
        }
        return res;
    }

    private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";

    public int sendPhoneAuthCode(String Phone) {
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(Url);

        client.getParams().setContentCharset("GBK");
        method.setRequestHeader("ContentType",
                "application/x-www-form-urlencoded;charset=GBK");

        int mobile_code = (int) ((Math.random() * 9 + 1) * 100000);

        String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

        NameValuePair[] data = {// 提交短信
				new NameValuePair("account", "C30342863"), // 查看用户名是登录用户中心->验证码短信->产品总览->APIID
				new NameValuePair("password",
						"dd271e2c81d39f38cffd31698c9c5e1d "), // 查看密码请登录用户中心->验证码短信->产品总览->APIKEY
                //C22530129
                // acc65f2b178d84152cac2eec26d8aa15
                // new NameValuePair("password",
                // util.StringUtil.MD5Encode("密码")),
                new NameValuePair("mobile", Phone),
                new NameValuePair("content", content), };
        method.setRequestBody(data);

        try {
            client.executeMethod(method);

            String SubmitResult = method.getResponseBodyAsString();

            // System.out.println(SubmitResult);

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            String code = root.elementText("code");
            String msg = root.elementText("msg");
            String smsid = root.elementText("smsid");

            System.out.println(code);
            System.out.println(msg);
            System.out.println(smsid);

            if ("2".equals(code)) {
                System.out.println("短信提交成功");
            }

        } catch (HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // Release connection
            method.releaseConnection();
            // client.getConnectionManager().shutdown();
        }
        return mobile_code;
    }

}
