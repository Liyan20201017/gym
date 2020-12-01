package com.gym.SpringBoot.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *������AlipayConfig
 *���ܣ�����������
 *��ϸ�������ʻ��й���Ϣ������·��
 *�޸����ڣ�2017-04-05
 *˵����
 *���´���ֻ��Ϊ�˷����̻����Զ��ṩ���������룬�̻����Ը����Լ���վ����Ҫ�����ռ����ĵ���д,����һ��Ҫʹ�øô��롣
 *�ô������ѧϰ���о�֧�����ӿ�ʹ�ã�ֻ���ṩһ���ο���
 */

public class AlipayConfig {

	// �����������������������������������Ļ�����Ϣ������������������������������

	// Ӧ��ID,����APPID���տ��˺ż�������APPID��Ӧ֧�����˺�
	public static String app_id = "2016101600702389";

	// �̻�˽Կ������PKCS8��ʽRSA2˽Կ
	public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDJ7h89aBp4K8zffw/p01dxGQYAonteQYjJ+Rh9y9I/iMobRZbT1znoys6rE/2gwv4ql7E4he07lq6kbnxYeEPk0uqNIjw2OkRwGCnk/49imUTMnUxLnUC6ZIRx9sj4Sslr/7jrfRZeO001+laGp+hRjr0r5gbQGdWWKibtiNen+yK+IPxcseXbkygNMMqjAnLE8gBph5K8VdhDV92qcO8VLIq5yvw357Rfq4IX0iCD/KUrn7WpQzNhyKpw+6BBRaQEDmJLNI87hw4G+Vj9b7QB3f6wWUxRReEH0DduxvHIsJe2ukSRb6mkoKF9PDLFXt+O1xq2Xm7i2zavwv+kAoNXAgMBAAECggEBAIypRzGrVuTm/euhwyAKjBrIZ5oBlRZvaC3pSto2JNsFGmQs8YfXoQs8WwJpBn/51Lsut9C72ilsKXN5Uzz9aa34DlMJyg+sPwgmjOhr7SGtynMOD5uMiw5L/sa0NgJfdje5BsNjezVg8cPsAmICjJ5jY/s0XQKRPGtCKaPFcxQbayfZz+reddO+JoNUo6M2SI4fswt6LSldm6x2qoJpGZTZf2vMVGsFNOcVdEqkCTDVIo5nBYyFJOHJ54KrSaJhl6wIexLueauN6TIWC1C9SwdgpTBpgOFx7YEBYhBjmXH6Ew61b4L5ANv1bEnP9t/bPurep+yP73IhYxBDr9rKlmECgYEA8QHvUPLqQTq/qVQCquvwlIGrSrvb3fYIB7LmdSTcYI39HKKtn9yV6d2sHTxhRvOEkJtEy13UStoHjtx61uOwDdFYPpzqcg7WZxej2loBDuNl0QlRDWx79FYOQaiIqxYEy+MYqEJRib1AVkY0Q53avFEsFa3X7dpMl07357YPYZ0CgYEA1n3gYe1G40Ox0Gg7p8He3Me0bvWfAcJF+wk9qq+YTX2uDI4Quyyh5Bl1P2XKaoF476VRoRV4/oSqbFOvfD1sWQsTaSEO2VsIsBYqYBKHAYG5/IYLT7j3VHbQ/mZ0l7sQE9MLmt8Hfj3JzkfxNUu1CwyDjHNz4vniA0CLkcfk0IMCgYEAkpyWtSvRDbVretq8dLXrOKxZQ7FcY36UC/rs7z5pQeOeopjj/mf2WrqbRX3Bv6PMdRu/keeWiaJxDptZrvf71awQfqZ+iLw1+akL6HzwP9pdyfhc8kmYbl8bdR3NZiaS7GVOTq1pZN1YEiPLD4cr1Xub0eRbgzpVdYZ4kODUIpECgYAYA0WgkPjTrpt0kobDNDAoFW980KC5iK9e+FzgBAKQAlb+7tSur8N8DuGSdGnh3JbWdXKbDxVZoS6XLBNEXHgJy/SjW2EXMlrZo9GgqdJVd9mDjNotVa7S1O523K+G4RlerszozLlBB9fU8Tbu2YfuMbt0eORrb8A+zvYRHwjd0wKBgQDH8h4QQxb95KGiOrOcGq4GrdV3mxOy9bSbZbWWBpQQOsDljbA1yRITDWqJZz108yIu8d8HJ6MaPf78y4kImWLOb32DuMDzB16D9mrcKYAcF8e+qNJxhTE/wt/PBjY4Ae0gWqsgd9FsiosMLSqghJkZRYr3vPajcuyL0mCKEdUtBg==";

	// ֧������Կ,�鿴��ַ��https://openhome.alipay.com/platform/keyManage.htm
	// ��ӦAPPID�µ�֧������Կ��
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAteBWx5/gF7Be8D5NfppeLz17JZTvbpqTsq3UI1wXxMybkxOvPDOWv327RKSlvp6LHvy5bIo7Y1K+SLchRkZTA+l1GIBMgZKykOpWH+JS7QQQpE/SLY/coSKaDQCPhraTOLP/w1dKsiPlzndyfmx5oEZU69btPA57Bc2+19JdNTNjl2I2ZHMnMz+Fo8NGi14bR1GTkEyFbATztfraNf/P+JGdAtGp+nZye7/yBIiZ3Uzm53+5C5N3ZG7ku3kIyBl0EhDs36v2k1xj5iLrgy5D9JqGB2GwBJ5Bxm2JGWDJ7KCluOzQtNEUu4q4C9mZgJQ6eP8j/LLe8s6ksu+dvuhdsQIDAQAB";

	// �������첽֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String notify_url = "http://���̹������ʵ�ַ/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// ֧�����֮���ҳ����ת ���������� �޸Ķ���״̬
	// ҳ����תͬ��֪ͨҳ��·�� ��http://��ʽ������·������������������������
	public static String return_url = "http://localhost:8001/pay";

	// ǩ����ʽ
	public static String sign_type = "RSA2";

	// �ַ������ʽ
	public static String charset = "utf-8";

	// ֧��������
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// ֧�������� ����ɲ�Ҫ
	public static String log_path = "C:\\";

	// �����������������������������������Ļ�����Ϣ������������������������������

	/**
	 * д��־��������ԣ�����վ����Ҳ���ԸĳɰѼ�¼�������ݿ⣩
	 * 
	 * @param sWord
	 *            Ҫд����־����ı�����
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
