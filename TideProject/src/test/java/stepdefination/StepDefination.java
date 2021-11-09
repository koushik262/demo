package stepdefination;


import java.io.IOException;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.And;
import org.junit.runner.RunWith;

import com.tide.reusablecomponents.base;
import com.tide.uistore.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class StepDefination extends base {
	
	
	
	@Given("Initialize browser with chrome")
	public void initialize_browser_with_chrome() throws IOException {
	    driver = initializeDriver();
	}

	@And("Navigate to {string} site")
	public void navigate_to_site(String string) {
	    driver.get("https://tide.com/en-us");
	}

	@And("click on search tab")
	public void click_on_search_tab() {
		homepage hp=new homepage(driver);
		hp.getsearch().click();
	}

	@When("User enters searchtext")
	public void user_enters_searchtext(String search) {
		homepage hp=new homepage(driver);
		hp.getsearch().sendKeys(search);
		hp.getsubmit().click();
	}

	@And("close the driver")
	public void close_the_driver() {
	    //driver.close();
		System.out.println("closed");
	}

}