package org.itstep;

import java.util.ArrayList;

public  class Drinks {

	private static  ArrayList<Drink> drinks = new ArrayList<>();
	
	public static void addDrink(Drink drink) {
		drinks.add(drink);

	}

	public static void removeDrink(Drink drink) {

	}

	public static ArrayList<Drink> getAllDrinks() {
		return drinks;

		
	}



}
