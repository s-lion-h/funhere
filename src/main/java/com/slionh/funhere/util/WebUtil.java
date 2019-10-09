package com.slionh.funhere.util;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

/*
 * Create by s lion h on 2019-09-30
 */
@Service
public class WebUtil {
    /**
     * 发送 get请求
     * cookie可能会刷新，如果失败，换成浏览器里的请求头的完整cookie，更新上面
     */
    public String getContent(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String content="";
        content = getString(url, httpclient, content);
        return content;
    }

    private String getString(String url, CloseableHttpClient httpclient, String content) {
        try {
            // 创建httpget.
            HttpGet httpget = new HttpGet(url);
//            CookieUtil cookieUtil=new CookieUtil();
//            System.out.println(cookieUtil.getCookie());
//            for (org.apache.http.cookie.Cookie c:cookieUtil.getCookie3()){
//                httpget.setHeader(c.getName(),c.getValue());
//            }
            httpget.setHeader("Cookie","");
//            httpget.setHeader("Cookie",COOKIES);
            System.out.println("executing request " + httpget.getURI());
            // 执行get请求.
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                System.out.println("--------------------------------------");
                // 打印响应状态
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    // 打印响应内容长度
                    System.out.println("Response content length: " + entity.getContentLength());
                    content=EntityUtils.toString(entity);
                }
                System.out.println("------------------------------------");
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content;
    }
}
