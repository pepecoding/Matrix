package org.itstep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverManager {

	public static WebDriver getWebDriver() {
		String fSep = System.getProperty("file.separator");
		System.setProperty("webdriver.chrome.driver", "D:" + fSep + "Selenium" + fSep + "chromedriver.exe");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		chrome.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
		Timer.waitSomeSec(3);
		return driver;

	}
	
	
}


