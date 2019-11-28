package com.jzhl.power.util;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.*;

/**
 * 微信工具类
 * @author 陈龙
 */
public class WXUtils {

    public static final String WXPAYSDK_VERSION = "WXPaySDK/3.0.9";
    public static final String USER_AGENT = WXPAYSDK_VERSION +
            " (" + System.getProperty("os.arch") + " " + System.getProperty("os.name") + " " + System.getProperty("os.version") +
            ") Java/" + System.getProperty("java.version") + " HttpClient/" + HttpClient.class.getPackage().getImplementationVersion();

    public static String getUUIDString() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * String JSON数据 转换 map
     * @param jsonStr
     * @return
     * @throws Exception
     */
    public static Map<String, Object> processJSONStrToMap(String jsonStr) throws Exception{
        if(MyUtils.checkStrNotEmpty(jsonStr)) {
            Map<String, Object> map = (Map<String, Object>) JSONObject.fromObject(jsonStr);
            return map;
        }
        return null;
    }


    /**
     * 方法名: getRemotePortData
     * 描述: 发送远程请求 获得代码示例
     * 参数：  @param urls 访问路径
     * 参数：  @param param 访问参数-字符串拼接格式, 例：port_d=10002&port_g=10007&country_a=
     * 创建人: 陈龙
     * 创建时间: 2017年3月6日 下午3:20:32
     * 版本号: v1.0
     * 返回类型: String
     */
    public static String getRemotePortData(String url,String mch_id, String param) throws Exception{
        try {

            BasicHttpClientConnectionManager connManager;

            connManager = new BasicHttpClientConnectionManager(
                    RegistryBuilder.<ConnectionSocketFactory>create()
                            .register("http", PlainConnectionSocketFactory.getSocketFactory())
                            .register("https", SSLConnectionSocketFactory.getSocketFactory())
                            .build(),
                    null,
                    null,
                    null
            );

            HttpClient httpClient = HttpClientBuilder.create()
                    .setConnectionManager(connManager)
                    .build();

            HttpPost httpPost = new HttpPost(url);

            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build();
            httpPost.setConfig(requestConfig);

            if(MyUtils.checkStrNotEmpty(mch_id)) {
                httpPost.addHeader("User-Agent", USER_AGENT + " " + mch_id);
            }
            if(MyUtils.checkStrNotEmpty(param)) {
                httpPost.addHeader("Content-Type", "text/xml");
                StringEntity postEntity = new StringEntity(param,"UTF-8");
                httpPost.setEntity(postEntity);
            }

            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            return EntityUtils.toString(httpEntity, "UTF-8");

        } catch (Exception e) {
            throw e;
        }
    }

}
