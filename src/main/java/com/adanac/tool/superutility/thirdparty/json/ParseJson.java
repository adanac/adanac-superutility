package com.adanac.tool.superutility.thirdparty.json;

import java.util.List;

import com.adanac.tool.superutility.entity.Person;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ParseJson {
	private String jsonStr;

	public ParseJson() {

	}

	public ParseJson(String str) {
		this.jsonStr = str;
	}

	/** 
	 * 解析json字符串 
	 */
	public void parse() {
		JSONObject jsonObject = JSONObject.fromObject(jsonStr);
		String name = jsonObject.getString("name");
		int num = jsonObject.getInt("num");
		String sex = jsonObject.getString("sex");
		int age = jsonObject.getInt("age");
		System.out.println(name + " " + num + " " + sex + " " + age);
	}

	// 将java对象转换为json字符串
	public String Object2Json(Object obj) {
		JSONObject json = JSONObject.fromObject(obj);// 将java对象转换为json对象
		String str = json.toString();// 将json对象转换为字符串
		return str;
	}

	// 將java對象數組轉換為字符串
	public String Objects2Json(List<Person> objList) {
		JSONArray json = JSONArray.fromObject(objList);// 将java对象转换为json对象
		String str = json.toString();// 将json对象转换为字符串
		return str;
	}

	// 将json字符串转换为java对象
	public Person JSON2Object() {
		// 接收{}对象，此处接收数组对象会有异常
		if (jsonStr.indexOf("[") != -1) {
			jsonStr = jsonStr.replace("[", "");
		}
		if (jsonStr.indexOf("]") != -1) {
			jsonStr = jsonStr.replace("]", "");
		}
		JSONObject obj = new JSONObject().fromObject(jsonStr);// 将json字符串转换为json对象
		Person jb = (Person) JSONObject.toBean(obj, Person.class);// 将建json对象转换为Person对象
		return jb;// 返回一个Person对象
	}

	// 将json字符串转换为java數組对象

	// 从json中取值
	public static void testGetFromJson() {
		String jsonStr = "{states:{rect1:{type:'start',text:{text:'开始'}, "
				+ "attr:{ x:448, y:105, width:50, height:50}, " + "props:{text:{value:'开始'},temp1:{value:''},"
				+ "temp2:{value:''}}},rect2:{type:'state',text:{text:'camel_element'}, "
				+ "attr:{ x:431, y:224, width:100, height:50}, props:{text:{value:'camel_element'},"
				+ "temp1:{value:'http://www/baidu.com'}}},rect3:{type:'end',text:{text:'结束'}, "
				+ "attr:{ x:454, y:365, width:50, height:50}, props:{text:{value:'结束'},"
				+ "temp1:{value:''},temp2:{value:''}}}},paths:{path4:{from:'rect1',to:'rect2', dots:[],"
				+ "text:{text:'TO camel_element'},textPos:{x:0,y:-10}, props:{text:{value:''}}},"
				+ "path5:{from:'rect2',to:'rect3', dots:[],text:{text:'TO 结束'},textPos:{x:0,y:-10}, "
				+ "props:{text:{value:''}}}},props:{props:{name:{value:'新建流程'},key:{value:''}," + "desc:{value:''}}}}";
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);
		System.out.println(jsonObj.getJSONObject("states").getJSONObject("rect1").get("type"));
	}

	public static void main(String[] args) {
		testGetFromJson();
	}

}
