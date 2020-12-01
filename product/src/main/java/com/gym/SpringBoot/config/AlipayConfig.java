package com.gym.SpringBoot.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

	// ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101600702389";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDJ7h89aBp4K8zffw/p01dxGQYAonteQYjJ+Rh9y9I/iMobRZbT1znoys6rE/2gwv4ql7E4he07lq6kbnxYeEPk0uqNIjw2OkRwGCnk/49imUTMnUxLnUC6ZIRx9sj4Sslr/7jrfRZeO001+laGp+hRjr0r5gbQGdWWKibtiNen+yK+IPxcseXbkygNMMqjAnLE8gBph5K8VdhDV92qcO8VLIq5yvw357Rfq4IX0iCD/KUrn7WpQzNhyKpw+6BBRaQEDmJLNI87hw4G+Vj9b7QB3f6wWUxRReEH0DduxvHIsJe2ukSRb6mkoKF9PDLFXt+O1xq2Xm7i2zavwv+kAoNXAgMBAAECggEBAIypRzGrVuTm/euhwyAKjBrIZ5oBlRZvaC3pSto2JNsFGmQs8YfXoQs8WwJpBn/51Lsut9C72ilsKXN5Uzz9aa34DlMJyg+sPwgmjOhr7SGtynMOD5uMiw5L/sa0NgJfdje5BsNjezVg8cPsAmICjJ5jY/s0XQKRPGtCKaPFcxQbayfZz+reddO+JoNUo6M2SI4fswt6LSldm6x2qoJpGZTZf2vMVGsFNOcVdEqkCTDVIo5nBYyFJOHJ54KrSaJhl6wIexLueauN6TIWC1C9SwdgpTBpgOFx7YEBYhBjmXH6Ew61b4L5ANv1bEnP9t/bPurep+yP73IhYxBDr9rKlmECgYEA8QHvUPLqQTq/qVQCquvwlIGrSrvb3fYIB7LmdSTcYI39HKKtn9yV6d2sHTxhRvOEkJtEy13UStoHjtx61uOwDdFYPpzqcg7WZxej2loBDuNl0QlRDWx79FYOQaiIqxYEy+MYqEJRib1AVkY0Q53avFEsFa3X7dpMl07357YPYZ0CgYEA1n3gYe1G40Ox0Gg7p8He3Me0bvWfAcJF+wk9qq+YTX2uDI4Quyyh5Bl1P2XKaoF476VRoRV4/oSqbFOvfD1sWQsTaSEO2VsIsBYqYBKHAYG5/IYLT7j3VHbQ/mZ0l7sQE9MLmt8Hfj3JzkfxNUu1CwyDjHNz4vniA0CLkcfk0IMCgYEAkpyWtSvRDbVretq8dLXrOKxZQ7FcY36UC/rs7z5pQeOeopjj/mf2WrqbRX3Bv6PMdRu/keeWiaJxDptZrvf71awQfqZ+iLw1+akL6HzwP9pdyfhc8kmYbl8bdR3NZiaS7GVOTq1pZN1YEiPLD4cr1Xub0eRbgzpVdYZ4kODUIpECgYAYA0WgkPjTrpt0kobDNDAoFW980KC5iK9e+FzgBAKQAlb+7tSur8N8DuGSdGnh3JbWdXKbDxVZoS6XLBNEXHgJy/SjW2EXMlrZo9GgqdJVd9mDjNotVa7S1O523K+G4RlerszozLlBB9fU8Tbu2YfuMbt0eORrb8A+zvYRHwjd0wKBgQDH8h4QQxb95KGiOrOcGq4GrdV3mxOy9bSbZbWWBpQQOsDljbA1yRITDWqJZz108yIu8d8HJ6MaPf78y4kImWLOb32DuMDzB16D9mrcKYAcF8e+qNJxhTE/wt/PBjY4Ae0gWqsgd9FsiosMLSqghJkZRYr3vPajcuyL0mCKEdUtBg==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAteBWx5/gF7Be8D5NfppeLz17JZTvbpqTsq3UI1wXxMybkxOvPDOWv327RKSlvp6LHvy5bIo7Y1K+SLchRkZTA+l1GIBMgZKykOpWH+JS7QQQpE/SLY/coSKaDQCPhraTOLP/w1dKsiPlzndyfmx5oEZU69btPA57Bc2+19JdNTNjl2I2ZHMnMz+Fo8NGi14bR1GTkEyFbATztfraNf/P+JGdAtGp+nZye7/yBIiZ3Uzm53+5C5N3ZG7ku3kIyBl0EhDs36v2k1xj5iLrgy5D9JqGB2GwBJ5Bxm2JGWDJ7KCluOzQtNEUu4q4C9mZgJQ6eP8j/LLe8s6ksu+dvuhdsQIDAQAB";

	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 支付完成之后的页面跳转 到个人中心 修改订单状态
	// 页面跳转同步通知页面路径 需http://格式的完整路径，必须外网可以正常访问
	public static String return_url = "http://localhost:8001/pay";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关 这个可不要
	public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_"
					+ System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
