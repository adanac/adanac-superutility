package com.adanac.tool.superutility.thirdparty.json;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.adanac.tool.superutility.entity.Person;

public class ParseJsonTest {

	// 将字符串转换为json对象，然后根据建得到相应的值
	@Test
	public void testParse() {
		ParseJson pj = new ParseJson("{\"name\":\"adanac\",\"num\":123456,\"sex\":\"male\",\"age\":24}");
		pj.parse();
	}

	// 将一个java对象转换为Json字符串
	@Test
	public void testObject2JSON() {
		Person p1 = new Person("adanac1", 123, "male", 23);
		ParseJson parseJson = new ParseJson();
		String str1 = parseJson.Object2Json(p1);
		System.out.println(str1);

	}

	// 将一个java对象數組转换为Json字符串
	@Test
	public void testObjects2Json() {
		List<Person> pList = new ArrayList<Person>();
		for (int i = 0; i < 3; i++) {
			Person p = new Person("adanac" + i, i, "male", 27);
			pList.add(p);
		}
		ParseJson parseJson = new ParseJson();
		String str1 = parseJson.Objects2Json(pList);
		System.out.println(str1);
	}

	// 将json字符串转换为java对象
	@Test
	public void testJSON2Object() {
		ParseJson pj = new ParseJson("{\"name\":\"adanac2\",\"num\":123456,\"sex\":\"male\",\"age\":25}");
		Person p = pj.JSON2Object();
		System.out.println(p.toString());
	}

}
