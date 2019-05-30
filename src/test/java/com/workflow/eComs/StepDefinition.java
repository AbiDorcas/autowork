package com.workflow.eComs;

import base.testBase;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SigninPage;

import java.io.IOException;


public class StepDefinition extends testBase {


@Before
public void setup() throws  IOException {
	initialize();
}

	@Given("^I go to the Home Page$")
	public void i_go_to_the_Home_Page() throws Throwable {
	driver.get( CONFIG.getProperty( "URL=http://carguruji.com/shop/" ));

		//System.setProperty("webdriver.chrome.driver", "/Users/abisolaogunleye/Documents/chromedriver");
		//driver = new ChromeDriver() ;
		//driver.navigate().to("http://carguruji.com/shop/");

	}

	@Given("^I click the login link$")
	public void i_click_the_login_link() throws Throwable {

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.click_sign_in();

		//driver.findElement(By.linkText("Sign in")).click();

	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		//driver.findElement(By.id("email")).sendKeys("abisola@yahoo.com");
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.click_login_button();

	}

	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys("abisola");

	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		driver.findElement(By.id("SubmitLogin")).click();

	}

//	@Then("^I verify that I am logged in sucessfully$")
//	public void i_verify_that_I_am_logged_in_sucessfully() throws Throwable {


	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		driver.findElement(By.linkText("Sign out")).click();
	}

	@Given("^I enter my email \"([^\"]*)\" address$")
	public void i_enter_my_email_address(String email) throws Throwable {
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.enter_email_address(email);
		//driver.findElement(By.id("email")).sendKeys(email);
	}

	@Given("^I enter my password \"([^\"]*)\"$")
	public void i_enter_my_password(String password) throws Throwable {
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.enter_password(password);
		//driver.findElement(By.id("password")).sendKeys(password);

	}

	@Given("^I enter my my \"([^\"]*)\" email adress$")
	public void i_enter_my_my_email_adress(String email) throws Throwable {
		driver.findElement(By.id("email_create")).sendKeys(email);

	}

	@Given("^I click on thencreate account button$")
	public void i_click_on_thencreate_account_button() throws Throwable {
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		Thread.sleep(3000);

	}

	@Given("^I click on the female radio button$")
	public void i_click_on_the_female_radio_button() throws Throwable {
		driver.findElement(By.id("id_gender2")).click();
	}

	@Given("^I enter firstname \"([^\"]*)\"$")
	public void i_enter_firstname(String firstname) throws Throwable {
		driver.findElement(By.id("customer_firstname")).sendKeys(firstname);

	}

	@Given("^I enter my lastname \"([^\"]*)\"$")
	public void i_enter_my_lastname(String lastname) throws Throwable {
		driver.findElement(By.id("customer_lastname")).sendKeys(lastname);

	}

	@Given("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(password);


	}

	@Given("^I click on the Contact Us link text$")
	public void i_click_on_the_Contact_Us_link_text() throws Throwable {
		driver.findElement(By.linkText("Contact us")).click();
	}

	@Given("^I choose \"([^\"]*)\" subject heading$")
	public void i_choose_subject_heading(String subject) throws Throwable {
		new Select(driver.findElement(By.id("id_contact"))).selectByValue(subject);
	}

	@Given("^I enter my existing \"([^\"]*)\" email address$")
	public void i_enter_my_existing_email_address(String email) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@Given("^I enter my \"([^\"]*)\" reference number$")
	public void i_enter_my_reference_number(String refernce) throws Throwable {
		driver.findElement(By.id("id_order")).sendKeys(refernce);
	}

	@Given("^I enter my \"([^\"]*)\" message$")
	public void i_enter_my_message(String message) throws Throwable {
		driver.findElement(By.id("message")).sendKeys(message);
	}

	@Given("^I click on the send button$")
	public void i_click_on_the_send_button() throws Throwable {
		driver.findElement(By.id("submitMessage")).click();


	}

	@Given("^I click on the create account button$")
	public void i_click_on_the_create_account_button() throws Throwable {
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		Thread.sleep(3000);

	}

	@Given("^I enter date of birth$")
	public void i_enter_date_of_birth() throws Throwable {
		new Select(driver.findElement(By.id("days"))).selectByValue("1");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("months"))).selectByValue("3");
		new Select(driver.findElement(By.id("years"))).selectByValue(("1996"));
		Thread.sleep(3000);

	}

	@Given("^I verify that email address is prepopulated$")
	public void i_verify_that_email_address_is_prepopulated() throws Throwable {
		String expectedEmail = "of@yahoo.com";
		String actualEmail = driver.findElement(By.id("email")).getText();
		Assert.assertEquals(expectedEmail, actualEmail);


	}

	@Then("^I verify that I am logged in successfully$")
	public void iVerifyThatIAmLoggedInSuccessfully() {
		String expectedUser = "Abisola Ogunleye";
		String actualUser = driver.findElement(By.cssSelector("span")).getText();
	}

	//@Given("^I enter my new email address$")
	public void i_enter_my_new_email_address() throws Throwable {
	//	random = 100 + (int)(Math.random()*((1000-1) +1));
		//driver.findElement(By.id("email_create")).sendKeys("Mary"+random+"@yahoo.com");

	}
	@Given("^I click register$")
	public void i_click_register() throws Throwable {
		driver.findElement(By.id("submitAccount")).click();

	}
	@Then("^I verify that i am registered as a new user$")
	public void i_verify_that_i_am_registered_as_a_new_user() throws Throwable {
		driver.findElement(By.cssSelector("span")).getText();

	}

	@And("^I verify that \"([^\"]*)\" is logged in successfully$")
	public void iVerifyThatIsLoggedInSuccessfully(String user) throws Throwable {
		MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.i_verify_my_account(user);
	//Assert.assertEquals(user,driver.findElement(By.cssSelector("span")).getText());
	}

	@Given("^I sign out successfully$")
	public void i_sign_out_successfully() throws Throwable {
		//driver.findElement(By.linkText("Sign out")).click();
		MyAccountPage myAccountPage = PageFactory.initElements(MyaccountPage.class );
		myAccountPage.click_sign_out();
	}

	@Then("^I see an error \"([^\"]*)\" message details$")
	public void iSeeAnErrorMessageDetails(String arg0) throws Throwable {
	//Assert.assertEquals( errormessage,driver.findElement(By.cssSelector( "ol > li")).getText());
		SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
		signinPage.i_see_login_error_message(errormessage);
	}
}
