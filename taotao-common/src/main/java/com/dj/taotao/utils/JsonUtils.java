package com.dj.taotao.utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
* @ClassName: JsonUtils 
* @Description: Json工具 
* @author Steven 
* @date 2019年3月3日
 */
public class JsonUtils {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	/** 
	* @Title: objectToJson 
	* @Description: 将对象转换成json字符串
	* @param data
	* @param 设定文件  
	* @return String  返回类型  
	*/
	public static String objectToJson(Object data) {
		try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/** 
	* @Title: jsonToPojo 
	* @Description:  将json结果集转化为对象
	* @param jsonData
	* @param beanType
	* @return T  返回类型  
	*/
	public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
		try {
			T t = MAPPER.readValue(jsonData, beanType);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/** 
	* @Title: jsonToList 
	* @Description: 将json数据转换成pojo对象list
	* @param jsonData
	* @param beanType
	* @return List<T>  返回类型  
	*/
	public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
		JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
		try {
			List<T> list = MAPPER.readValue(jsonData, javaType);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
