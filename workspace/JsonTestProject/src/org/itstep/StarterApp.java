package org.itstep;

import org.itstep.jsonService.JsonFileWriter;
import org.itstep.pojo.Good;
import org.itstep.pojo.Order;
import org.itstep.pojo.User;

public class StarterApp {

	public static void main(String[] args) {
		
	     Good good = new Good("Keds", 50000);
	     User user = new User("Alexander Ignatenko", "ignatenko2207@gmail.com", "123456789");
	
         Order order = new Order(user, good, 1);
         JsonFileWriter.WriteDataToJsonFile(order);
    
	}

}
