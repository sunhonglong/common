package com.upyoo.cloud.common.json.netsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import net.sf.json.JSONArray;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;

public class JsonUtil {

	private boolean JSONObject2String = true;

	public boolean isJSONObject2String() {
		return JSONObject2String;
	}
	public void setJSONObject2String(boolean jSONObject2String) {
		JSONObject2String = jSONObject2String;
	}

	public static List<Map<String, Object>> JSONArray2list(JSONArray jsonArray) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject object = jsonArray.getJSONObject(i);
			Map<String, Object> map = JSONObject2Map(object);
			list.add(map);
		}
		return list;

	}
	 
	public static Map<String, Object> JSONObject2Map(JSONObject jsonObject) {
		Map<String, Object> map = new HashMap<String, Object>();
		Iterator<String> keys = jsonObject.keys();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			Object value = jsonObject.get(key);
			if (value == null || value instanceof JSONNull) {
				map.put(key, null);
			} else if (value instanceof JSONObject) {
				map.put(key, value.toString());
			} else {
				map.put(key, value);
			}

		}
		return map;
	}
	public static Map<String, String> JSONObject2StringMap(JSONObject jsonObject) {
		Map<String, String> map = new HashMap<String, String>();
		Iterator<String> keys = jsonObject.keys();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			Object value = jsonObject.get(key);
			if (value == null || value instanceof JSONNull) {
				map.put(key, null);
			} else if (value instanceof JSONObject) {
				map.put(key, value.toString());
			} else {
				map.put(key, value.toString());
			}

		}
		return map;
	}
}
