package StepDefinations;



import java.io.IOException;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.And;
import org.junit.runner.RunWith;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.details;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
public class StepDefination extends ReadPropertyFile {
	
/*@Given("Initialize browser with chrome")
	public void initialize_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 driver=DriverInitialisation();
	}
	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(string);
	}
	@Given("click on login link in home page to land on secure sign in page")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		details d = new details(driver);
		
		d.getLogin().click();
	}
	@When("User enters saikrishna and {int} and logs in")
	public void user_enters_saikrishna_and_and_logs_in(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		details d = new details(driver);
		d.getpassword().sendKeys("int1");
	}
	@When("close the driver")
	public void close_the_driver() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}
	*/
	
	

	 @Given("^Initialize browser with chrome$")
	    public void initialize_browser_with_chrome() throws Throwable {
	       driver=DriverInitialisation();
	    }

	    @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }


	    @And("^click on login link in home page to land on secure sign in page$")
	    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	    	details d = new details(driver);
			
			d.getLogin().click();
	    }
	    
	    @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	    	
	    	
	     	details d = new details(driver);
	    	d.getEmail().sendKeys(username);
			Thread.sleep(5000L);
			d.getpassword().sendKeys(password);	
			Thread.sleep(5000L);
			d.getSubmit().click();
	    }




	    @And("^close the driver$")
	    public void close_the_driver() throws Throwable {
	       driver.close();
	    }

	}