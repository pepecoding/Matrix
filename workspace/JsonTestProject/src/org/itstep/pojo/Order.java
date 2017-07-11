package org.itstep.pojo;

//import lombok.Getter;
//import lombok.Setter;

//@Setter
//@Getter  


public class Order {
	
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Good getGood() {
		return good;
	}


	public void setGood(Good good) {
		this.good = good;
	}


	public int getAmmount() {
		return ammount;
	}


	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}


	private User user;
	private Good good;
	private int ammount;
	
	
	public Order(User user, Good good, int ammount) {
		this.user = user;
		this.good = good;
		this.ammount = ammount;
	}


	public Order() {
		
	}
		
}
