package com.adanac.tool.superutility.thirdparty.json;

import org.junit.Test;

public class JsonToolsTest {

	@Test
	public void testObjectToJson() {

	}

	@Test
	public void testGetValueFromJson() {
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
		Object object = JsonTools.getValueFromJson(jsonStr);
		System.out.println(object.toString());
	}

}
