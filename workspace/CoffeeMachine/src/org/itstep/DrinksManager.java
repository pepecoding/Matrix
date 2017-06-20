package org.itstep;

import java.util.ArrayList;

public class DrinksManager {

	public void setDrinks(){
		Drink drink1 = new Drink("esspresso", 600);
		Drink drink2 = new Drink("americano", 700);
		Drink drink3 = new Drink("americano with milk", 800);
		Drink drink4 = new Drink("capuchino", 800);
		Drink drink5 = new Drink("latte", 900);
		
		Drinks.addDrink(drink1);
		Drinks.addDrink(drink2);
		Drinks.addDrink(drink3);
		Drinks.addDrink(drink4);
		Drinks.addDrink(drink5);
	}
	
	public ArrayList<Drink> getPossibleDrinks(int inputMoney){
		ArrayList<Drink> possibleDrinks = new ArrayList<>();
		for(Drink oneDrink : Drinks.getAllDrinks()){
			if(inputMoney >= oneDrink.getPrice()){
				possibleDrinks.add(oneDrink);
			}
		}
		return possibleDrinks;
	}
}


