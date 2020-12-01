<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>付款</title>
</head>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.alipay.api.*"%>
<%@ page import="com.alipay.api.request.*"%>
<%@ page import="com.ly.SpringBoot.config.AlipayConfig"%>
<%
//获得初始化的AlipayClient
	AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	//设置请求参数
	AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	alipayRequest.setReturnUrl(AlipayConfig.return_url);
	alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
	
	//商户订单号，商户网站订单系统中唯一订单号，必填 request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8"
	String out_trade_no = new String(request.getParameter("orderid").getBytes("ISO-8859-1"),"UTF-8");
	//付款金额，必填 request.getParameter("total").getBytes("ISO-8859-1"),"UTF-8"
	String total_amount = new String(request.getParameter("memberprice").getBytes("ISO-8859-1"),"UTF-8");
	//订单名称，必填
	String subject = new String(request.getParameter("membername").getBytes("ISO-8859-1"),"GBK");
	//商品描述，可空 request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8"
	String body = new String();
	
	alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
			+ "\"total_amount\":\""+ total_amount +"\"," 
			+ "\"subject\":\""+ subject +"\"," 
			+ "\"body\":\""+ body +"\"," 
			+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
	//请求
	String result = alipayClient.pageExecute(alipayRequest).getBody();
	
	//输出
	out.println(result);
%>
<body>
</body>
</html>