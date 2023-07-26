package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User Launch the URL")
	public void user_launch_the_url() {
	    browser("chrome");
	    getUrl("https://www.google.com/");
	}

	@When("User click the search box")
	public void user_click_the_search_box() {
	      driver.findElement(By.id("input")).click();
	}

	@When("User enters {string}")
	public void user_enters(String string) {
		driver.findElement(By.id("input")).sendKeys(string);
	}

	@When("User enter the enter button")
	public void user_enter_the_enter_button() throws AWTException {
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("User Validates the page")
	public void user_validates_the_page() {
		
		String actual = driver.getTitle();
		
		System.out.println(actual);
	   
	}


}
