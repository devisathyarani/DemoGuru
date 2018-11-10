package org.demo.test.DemoGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyCucumber {
	static WebDriver driver;
	@Given("The user is in gurulogin page")
	public void the_user_is_in_gurulogin_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\selenium\\DemoGuru\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
	   	}

	@When("The user enters valid username and  passwword and click submit")
	public void the_user_enters_valid_username_and_passwword_and_click_submit() {
	    WebElement txtUser = driver.findElement(By.name("uid"));
	    txtUser.sendKeys("mngr162602");
	    WebElement txtPass = driver.findElement(By.name("password"));
	    txtPass.sendKeys("yzudyvy");
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	   
		WebElement btn=driver.findElement(By.name("btnLogin"));
		btn.click();
	}

	@Then("The user should  be in managers home page")
	public void the_user_should_be_in_managers_home_page() {
	
		
		  
	}


}
