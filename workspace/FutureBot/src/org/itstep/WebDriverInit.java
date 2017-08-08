package org.itstep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;

public class WebDriverInit {

	public static WebDriver getWebDriver() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		chrome.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		waitSomeSec(3);
		return driver;

	}

	public static void waitSomeSec(int sec) {
		Thread thread = new Thread();
		try {
			Thread.sleep(sec * 1000);

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

	public static Account getRegisteredAccount(Account account) {
		WebDriver driver = getWebDriver();
		driver.get("https://www.amazon.com");
		WebElement loginElement = driver.findElement(By.id("nav-flyout-ya-signin"));
		WebElement hrefLogin = loginElement.findElement(By.tagName("a"));
		String loginLink = hrefLogin.getAttribute("href");
		if (loginLink.contains("https://www.amazon.com")) {
			loginLink = "https://www.amazon.com" + loginLink;

		}
		driver.get(loginLink);
		waitSomeSec(5);
		WebElement emailInput = driver.findElement(By.id("app_email"));
		WebElement passInput = driver.findElement(By.id("app_password"));
		WebElement submitBtn = driver.findElement(By.id("signInSubmit"));
		emailInput.sendKeys(account.getEmail());
		passInput.sendKeys(account.getPass());
		waitSomeSec(15);
		passInput.submit();
		String currentUrl = driver.getCurrentUrl();
		waitSomeSec(5);
		driver.get(currentUrl);
		waitSomeSec(5);
		String currentPage = driver.getPageSource();
		driver.close();
		if (currentPage.contains(account.getFullName())) {
			return account;

		}

		return new Account();
	}

}
