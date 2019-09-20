package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.TechfiosPage;
import util.BrowserFactory;

public class TechfiosSteps {
	WebDriver driver;
	TechfiosPage techfiosPage;
	
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		techfiosPage = PageFactory.initElements(driver, TechfiosPage.class);
		
	}

//	WebDriver driver = BrowserFactory.startBrowser();
//	TechfiosPage techfiosPage = PageFactory.initElements(driver, TechfiosPage.class);
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists()  {
		//techfiosPage.isSetSkyBlueBackgroundButtonEnabled();
		assertTrue("SkyBlueBackgroundButton doesn't exist!!", techfiosPage.isSetSkyBlueBackgroundButtonEnabled());
	    
	}

	@When("^I click on the SkyBluebutton$")
	public void i_click_on_the_SkyBluebutton() {
		techfiosPage.clickSetSkyBlueBackgroundButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		
	System.out.print("Background color is changed to " + techfiosPage.getSkyBluePageColor());	
	    
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists(){
		assertTrue("SkyBlueBackgroundButton doesn't exist!!", techfiosPage.isSetWhiteBackgroundButtonEnabled());
	}

	@When("^I click on the Whitebutton$")
	public void i_click_on_the_Whitebutton() {
		techfiosPage.clickSetWhiteBackgroundButton();
	    
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		
		System.out.print("Background color is changed to " + techfiosPage.getWhitePageColor());
	}
	
	@After
	public void afterRun() {
		techfiosPage.closeAndQuit();;
	}


}
