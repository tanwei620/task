package com.peaceful.task.container.console;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author WangJun <wangjuntytl@163.com>
 * @version 1.0 15/9/15
 * @since 1.6
 */

public class Http {


    public static void responseString(HttpServletResponse response, String str) {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter e = response.getWriter();
            e.write(str);
            e.flush();
            e.close();
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
    }

    public static void responseJson(HttpServletResponse response, Object str) {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter e = response.getWriter();
            SerializerFeature feature = SerializerFeature.DisableCircularReferenceDetect;
            e.write(JSON.toJSONString(str,feature));
            e.flush();
            e.close();
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
    }
}
