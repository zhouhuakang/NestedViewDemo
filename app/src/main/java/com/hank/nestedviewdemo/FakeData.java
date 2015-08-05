package com.hank.nestedviewdemo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhouhuakang on 15/8/5.
 */
public class FakeData {

    public static JSONArray getData() {
        JSONArray data = new JSONArray();
        for (int i = 0; i < 40; i++) {
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("name", "hank--" + i);
                jsonObject.put("age", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            data.put(jsonObject);
        }
        return data;
    }
}
