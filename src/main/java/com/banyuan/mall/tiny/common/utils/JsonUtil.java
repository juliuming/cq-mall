package com.banyuan.mall.tiny.common.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

public class JsonUtil{
    public Object requestToJson(HttpServletRequest request){

        InputStream is = null;
        try {
            is = request.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder jsonString = new StringBuilder();
        String line = null;
        while (true){
            try {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            jsonString.append(line);
        }
        return JSON.parse(String.valueOf(jsonString));
    }
}
