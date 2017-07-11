package org.itstep.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter 

public class Good {

	private String name;
	private int price;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Good(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Good()  {
	
		
		
	}
	
	
	
}
