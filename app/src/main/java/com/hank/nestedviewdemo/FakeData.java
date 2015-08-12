package com.hank.nestedviewdemo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhouhuakang on 15/8/5.
 */
public class FakeData {

    public static JSONArray getListViewData() {
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
   public static String expandlistData = "{\n" +
           "  \"pay_category\": [\n" +
           "    {\n" +
           "      \"pay_items\": [\n" +
           "        {\n" +
           "          \"item_name\": \"一次性真空采血器\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"常规心电图检查\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"氯化钠针\\u0000.9%:10ml*1\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        }\n" +
           "      ],\n" +
           "      \"pay_total\": 150,\n" +
           "      \"pay_name\": \"门诊西药处方单1\"\n" +
           "    },\n" +
           "    {\n" +
           "      \"pay_items\": [\n" +
           "        {\n" +
           "          \"item_name\": \"常规心电图检查\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"氯化钠针\\u0000.9%:10ml*1\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"一次性真空采血器\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        }\n" +
           "      ],\n" +
           "      \"pay_total\": 150,\n" +
           "      \"pay_name\": \"门诊西药处方单2\"\n" +
           "    },\n" +
           "    {\n" +
           "      \"pay_items\": [\n" +
           "        {\n" +
           "          \"item_name\": \"常规心电图检查\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"氯化钠针\\u0000.9%:10ml*1\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"一次性真空采血器\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        }\n" +
           "      ],\n" +
           "      \"pay_total\": 150,\n" +
           "      \"pay_name\": \"门诊西药处方单3\"\n" +
           "    },\n" +
           "    {\n" +
           "      \"pay_items\": [\n" +
           "        {\n" +
           "          \"item_name\": \"常规心电图检查\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"氯化钠针\\u0000.9%:10ml*1\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"一次性真空采血器\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        }\n" +
           "      ],\n" +
           "      \"pay_total\": 150,\n" +
           "      \"pay_name\": \"门诊西药处方单4\"\n" +
           "    },\n" +
           "    {\n" +
           "      \"pay_items\": [\n" +
           "        {\n" +
           "          \"item_name\": \"常规心电图检查\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"氯化钠针\\u0000.9%:10ml*1\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        },\n" +
           "        {\n" +
           "          \"item_name\": \"一次性真空采血器\",\n" +
           "          \"item_total_price\": 50,\n" +
           "          \"item_count\": 10,\n" +
           "          \"item_unit_price\": 5\n" +
           "        }\n" +
           "      ],\n" +
           "      \"pay_total\": 150,\n" +
           "      \"pay_name\": \"门诊西药处方单5\"\n" +
           "    }\n" +
           "  ]\n" +
           "}";

    public static JSONObject getExpandableListViewData() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(expandlistData);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

}
