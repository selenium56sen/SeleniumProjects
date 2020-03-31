package com.cts.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

public static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		if(browser.equals("ch")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "drivers//IEDriverServer.exe");
			driver = new FirefoxDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
