package com.cts.pages;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	By chkEmail = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By logoutLink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean chkLoginStatus(String expEmail) {
		String actEmail = driver.findElement(chkEmail).getText();
		boolean loginStatus = expEmail.equals(actEmail);
		
		return loginStatus;
		
//		if(!expEmail.equals(actEmail)) {
//			Date date = new Date();
//			String datestr = date.toString().replace(":", "-");
//			File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			screenShot.renameTo(new File("src/test/resources/screenshots/image" + datestr + ".png"));
//		}
		
		//Assert.assertTrue("Login is not successful", expResult.equals(actResult));
		//Assert.assertEquals("senthil.natarajan1979@gmail.com", actResult);
	}

	public void logout() {
		driver.findElement(logoutLink).click();
		driver.close();
	}
}
