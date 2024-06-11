package com.fmg.flume.interceptor;

import com.alibaba.fastjson.JSONException;
import org.mortbay.util.ajax.JSON;

public class JSONUtils {
    public static boolean isJSONValidate(String log){
        try {
            JSON.parse(log);
            return true;
        } catch (JSONException e) {
            return false;
        }
    }
}
