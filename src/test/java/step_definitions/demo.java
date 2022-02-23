package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class demo extends MainClass {
	WebDriver driver;
	
	
		
	
@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
	
   }

@When("I complete action")
public void i_complete_action() {
    System.out.println("action");
    }

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
	System.out.println("stop");
     }

@And("check more outcomes")
public void check_more_outcomes() {
	
	System.out.println("give");
	
	
}
}