package org.itstep;

import java.util.ArrayList;

public class ShowPossibleDrinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputMoney = 800;
		DrinksManager dm = new DrinksManager();
		dm.setDrinks();
		ArrayList<Drink> possibleDrinks = dm.getPossibleDrinks(inputMoney);
		if (possibleDrinks.isEmpty()) {
			System.out.println("You 	input " + inputMoney);
			System.out.println("=============");
			for (Drink drink : possibleDrinks) {
				System.out.println("You can choose drink" + drink.getName() + " and " + "Your back is "
						+ (inputMoney - drink.getPrice()));
			}

		} else {
			int minCost = Integer.MAX_VALUE;
			String minDrink = "";
			for (Drink drink : Drinks.getAllDrinks()) {
				if (minCost > drink.getPrice()) {
					minCost = drink.getPrice();
					minDrink = drink.getName();
				}
			}

			System.out.println("You input " + inputMoney);
			System.out.println("================");
			System.out.println("if You want coffee, you must input " + (minCost - inputMoney) + "more!");
			System.out.println("You must buy at least " + minDrink + " than...");

		}

	}
}