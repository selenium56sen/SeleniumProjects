package com.cts.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cts.base.LaunchBrowser;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.RegistrationPage;
import com.cts.utils.ExcelRead;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	RegistrationPage registrationPage;
	String[][] data;
	boolean logoutFlag;
	
	
	@Given("user launches DemoWebShop website")
	public void user_launches_DemoWebShop_Website() {
		LaunchBrowser.launchBrowser("ch");
		this.driver = LaunchBrowser.driver;
	}
	
	@When("user enters gender as {string} and firstname as {string} and lastname as {string} and email as {string} and password as {string} and confirmpassword as {string}")
	public void user_enters_gender_as_and_firstname_as_and_lastname_as_and_email_as_and_password_as_and_confirmpassword_as(String gender, String firstname, String lastname, String email, String password, String confirmPassword) throws InterruptedException{
		loginPage = new LoginPage(driver);
		loginPage.clickRegisterLink();
		
		registrationPage = new RegistrationPage(driver);
		registrationPage.fillRegistrationDetails(gender, firstname, lastname, email, password, confirmPassword);
	}
	
	@Then("account must be registered successfully")
	public void account_must_be_registered_successfully() {
		boolean condition = registrationPage.chkRegistrationStatus();
		Assert.assertTrue("Registration NOT successfull", condition);
	}
	
	@Then("user logout")
	public void user_logout() {
		homePage = new HomePage(driver);
		
		homePage.logout();
	}
	
	@Then("user close the browser")
	public void user_close_the_browser() {
		LaunchBrowser.closeBrowser();
	}
	
	@When("user enter login details from excel {string} from sheetname {string} and click on login button")
	public void user_enter_login_details_from_excel_from_sheetname_and_click_on_login_button(String workbook, String sheet) throws IOException {
	loginPage = new LoginPage(driver);
	loginPage.clickLoginLink();
	
	data = ExcelRead.getData(workbook, sheet);
	loginPage.enterUsernameAndPassword(data[0][0],data[0][1]);
	}
	
	@Then("user should be taken to home page")
	public void user_should_be_taken_to_home_page() {
		homePage = new HomePage(driver);
		logoutFlag = homePage.chkLoginStatus(data[0][0]);
		Assert.assertTrue("Login is NOT successful", logoutFlag);
		homePage.logout();
	}

	
}
