package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	private WebDriver driver;
	By genderMaleLocator = By.xpath("//*[@id=\"gender-male\"]");
	By genderFemaleLocator = By.xpath("//*[@id=\"gender-female\"]");
	By firstNameLocator = By.id("FirstName");
	By lastNameLocator = By.id("LastName");
	By emailLocator = By.xpath("//*[@id=\"Email\"]");
	By passwordLocator = By.xpath("//*[@id=\"Password\"]");
	By confirmPasswordLocator = By.xpath("//*[@id=\"ConfirmPassword\"]");
	By registerButtonLocator = By.xpath("//*[@id=\"register-button\"]");
	By continueButtonLocator = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input");
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillRegistrationDetails(String gender, String firstname, String lastname, String email, String password, String confirmPassword) throws InterruptedException {
	
		if(gender.equalsIgnoreCase("male"))
			driver.findElement(genderMaleLocator).click();
		else
			driver.findElement(genderFemaleLocator).click();
		
		driver.findElement(firstNameLocator).sendKeys(firstname);
		driver.findElement(lastNameLocator).sendKeys(lastname);
		driver.findElement(emailLocator).sendKeys(email);
		driver.findElement(passwordLocator).sendKeys(password);
		driver.findElement(confirmPasswordLocator).sendKeys(confirmPassword);
		driver.findElement(registerButtonLocator).click();
		
		Thread.sleep(4000);
	}
	
	public boolean chkRegistrationStatus() {
		if(driver.findElement(continueButtonLocator).isDisplayed())
			return true;
		else
			return false;
	}

}
