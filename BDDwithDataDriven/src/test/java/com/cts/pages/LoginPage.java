package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	By loginLink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By emailLocator = By.xpath("//*[@id=\"Email\"]");
	By pwdLocator = By.xpath("//*[@id=\"Password\"]");
	By loginButton = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By registrationLink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLoginLink() {
		// TODO Auto-generated method stub
		// clicking on the Log in hyperlink
		driver.findElement(loginLink).click();
		}
	
	public void enterUsernameAndPassword(String email, String pwd) {
		//Enter email id, pwd and clicking on login button
		driver.findElement(emailLocator).sendKeys(email);
		driver.findElement(pwdLocator).sendKeys(pwd);
		driver.findElement(loginButton).click();
		}
	
	public void clickRegisterLink() {
		driver.findElement(registrationLink).click();
	}

}
