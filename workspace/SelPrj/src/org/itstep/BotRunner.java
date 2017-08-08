package org.itstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BotRunner {

	public static void main(String[] args) {
		WebBot bot = new WebBot();
		User user = bot.getUser("Pupkin DDima", "pupkin.dima.123444456@gmail.com", "asd987689");
		bot.registerUser(user);
	}
}