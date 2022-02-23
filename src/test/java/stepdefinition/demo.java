package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class demo {
	WebDriver driver;
	//"C:\Users\Owner\Desktop\drivers\chromedriver.exe"
	public static void main(String[] args) {
		TODO Auto-generated method stub
	
@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Desktop\\drivers\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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