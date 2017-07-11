package org.itstep.jsonService;

import java.io.File;
import java.io.IOException;

import org.itstep.pojo.Order;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileWriter {
	
	public static void WriteDataToJsonFile(Order order){
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(new File("D:\\test\\order.json"), order);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}
	
		
}

