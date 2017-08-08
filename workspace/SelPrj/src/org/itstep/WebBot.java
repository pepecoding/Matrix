package org.itstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebBot {

	public void registerUser(User user) {
		WebDriver driver = WebDriverManager.getWebDriver();
		driver.get("https://www.amazon.com");
		Timer.waitSomeSec(5);

		WebElement regLinkBtn = driver.findElement(By.id("nav-flyout-ya-newCust"));
		WebElement aLinkElement = regLinkBtn.findElement(By.tagName("a"));

		String regLink = aLinkElement.getAttribute("href");
		if (!regLink.contains("www.amazon.com")) {
			regLink = "https://www.amazon.com" + regLink;

		}

		driver.get(regLink);
		Timer.waitSomeSec(5);

		WebElement inputName = driver.findElement(By.id("ap_customer_name"));
		inputName.sendKeys(user.getName());

		WebElement inputEmail = driver.findElement(By.id("ap_email"));
		inputEmail.sendKeys(user.getEmail());

		WebElement inputPass = driver.findElement(By.id("ap_password"));
		inputPass.sendKeys(user.getPass());

		WebElement inputChPass = driver.findElement(By.id("ap_password_check"));
		inputChPass.sendKeys(user.getPass());

		Timer.waitSomeSec(5);

		WebElement submitBtn = driver.findElement(By.id("continue"));
		submitBtn.submit();

		Timer.waitSomeSec(5);

		driver.quit();

	}

	public void loginUser(User user) {
		WebDriver driver = WebDriverManager.getWebDriver();
		driver.get("https://www.amazon.com");
		Timer.waitSomeSec(5);

		WebElement logLinkBtn = driver.findElement(By.id("nav-flyout-ya-sigin"));
		WebElement aLinkElement = logLinkBtn.findElement(By.tagName("a"));

		String loginLink = aLinkElement.getAttribute("href");
		if (!loginLink.contains("www.amazon.com")) {
			loginLink = "https://www.amazon.com" + loginLink;

		}

		driver.get(loginLink);
		
		WebElement inputEmail = driver.findElement(By.id("ap_email"));
		inputEmail.sendKeys(user.getEmail());

		WebElement inputPass = driver.findElement(By.id("ap_password"));
		inputPass.sendKeys(user.getPass());
		
		WebElement submitBtn = driver.findElement(By.id("signInSubmit"));
		submitBtn.submit();

		Timer.waitSomeSec(5);

		driver.quit();

	}

	public User getUser(String name, String email, String pass) {
		return new User(name, email, pass);

	}

}