package com.alipay.config;

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
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102100730919";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCv1PQbVp9a5sHCEuBUtJJmrdHne2yvaCCvSckUZzsBMCFR0101BhzIIRLyRjMG2wp+tq3Mss2LJmlchDW7N8HFOwd3sa8i9wFGPPUBJ5gvGJl3pCL6stEXngtOiepkVZlGcU7PCWm98tj7vpHDirwInXDRST68FO9+927HdKDjq25hbcEiDxbFZp0JwqpVTS2zgF4oq4QzayGPT88lz2D6lt/14g/qDg6oQC7QPDcIz0ElOZvTqBy0UOrS0dz7beGrn4HLedrT902HTEADp2rOxAlajqJ1D9Budkh6G+7VALJr50SghJAx8MUthOFlI8r77my/WJkuWyolkHQxzTOJAgMBAAECggEAYw6Mqy4kvnhL5gLuYKoN5Ey+eTN+al82MqpV3um9QxETZF64HtwfsNt5KgZETvNtuS8/QJfm1iLArr9I6f0ia/OyZEs0yHTxQdmriYf942JvawiMMEI3K5/87LUj2Hykyhuhc1/xM3KxrTmSMuBgyFWyLiWecyU0O4o33aQl07xbzNP0rnMg8Nkv0zQ4V8Fln5v5+i0Ba/Thj/tgWWHf1jd4GAhszpQYYLExep/VP7EccM/MIs6XIkldCj2lYYOtOkvxx2hfS+f2QoK/hPBRqvM3SNTL5nwQzz9y0GhzLZ/d4XSWekYzUnenQDb1BkPgtXBoJpPI2HGSe91UO49n9QKBgQDkq/KSX4cQL84cY6ipJVvTSqsVj6lD+jfhBPxsaHlUm1a9rmDg5eLIsTmw7mMX04brgM3gPgpm5MYN9qq4A+QEGrGT7Foo1owPlykHFyQ9V61H+/hj35tjwkk1KgNGQwjHw/+6Ty6ID5y1zbKpP1SOcbV9NNLLTWG+na2lpHrO7wKBgQDE2Gh1RB+7nfpKhX+39BX0IxUo7+/fUy3DkV7tlQdiO1Mk3nnVw++KIcEB+I3NP3Vxxd4R+XTmEf3l2xLL6oCzbhmhxYJ0UAE0D6a77MUkDeQoiTjHnO++4/aIyrz6Cnnp2zQt4Nawl1lWrLi+QFTpc2/4tSUMUL42prUpVgclBwKBgEZIbyr7/3hDKTdijiFG4T1E8uaSnDTPgENCFA+B4ODXScbNBOu63IRQrGmsK3rUQeC6Wwy0JOBRKmp6SSh70aZNSg0sFN3+a1gTXsHWJAZSn2jDkimoPYtg2L1lZ1I+IkG8BSqPUb7yBXl/eo04cNXDL0QHa06fPw6mSgviTPizAoGAUfSgGSLR63VsvhYzBM3VTh5FMxQi1OJ2zVP7KAPCXT3B8jnGlB/N3b8L8twfffML3OC7AtTPvPKEuWyquMfb6djPRzFKjU66EYjqrJd5xPcbpVzsjP9kOiADhxSR9bDi7WDcqrVP7Zo2EgY7rMpwD/qGBhC1ahk7+NkT2C//LYUCgYALMS//RxwPjKAhiEb2R9mE5He/gkboL4E0N2F7UEIvjHF5y5yVYtu6lzSnfB/KS5jTcWqus9gR9soXkpolIdFzGpNF4u5S9qmm/bvrQtq/f1auFsGc0x33+8+nrcsUF7wW6ei51ztc7bOKILPSg5D4BzHltRD9cEpo0uzyW4f1VQ==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgRc9fAeVVxZhEDR0eyUbmDV/vZpqCru1dW3fVABRy9gp6HvWqWrRY+iKFqxM4AIHcQ9NK6XsuxcYPkrgvlpZGbAjKql3NX7za2afUeKifCT1f5SfyYKdYHJq2ppoJmsMsTVyiVjo0SCdGKxZeT4t1Ne+i/KaouG5LB28RHEZWZ2DTR9Sdub+NQR+0elqsfFb7IuNZ1vuOMvROsSBj1BpgAZFjtkR1aVCxQWxkDKQkoL6gTT+YFPDeZs2w0lsKsIsa/PWcLh+mTtmmYoxDoK8+dgjsIATynY6BtjQpbd8sChtAjjb6eZty1uVTxKcPGn5eh9MsqIBLCVc1rBQijodNwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://admin.luchengxz.cn:8099/return_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://admin.luchengxz.cn:8099/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
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

