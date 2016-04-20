package com.adanac.tool.superutility.thirdparty.json;

import net.sf.json.JSONObject;

public class JsonTools {

	/**
	 * 将java对象转换为json字符串
	 * @param obj
	 * @return
	 */
	public static String objectToJson(Object obj) {
		JSONObject json = JSONObject.fromObject(obj);// 将java对象转换为json对象
		String str = json.toString();// 将json对象转换为字符串
		return str;
	}

	public static Object getValueFromJson(String jsonStr) {
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);
		return jsonObj.getJSONObject("states").getJSONObject("rect1").get("type");
	}

}
