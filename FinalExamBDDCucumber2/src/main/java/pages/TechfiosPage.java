package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosPage extends BasePage {
	WebDriver driver;
	public TechfiosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element library
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SetSkyBlueBackgroundButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement SetWhiteBackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement SkyBlueBackgroundColor;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteBackgroundColor;
	
	//click on Set sky blue background button
	public void clickSetSkyBlueBackgroundButton() {
		SetSkyBlueBackgroundButton.click();
	}
	
	//validating if the button is enabled
	public boolean isSetSkyBlueBackgroundButtonEnabled() {
		return SetSkyBlueBackgroundButton.isEnabled();
	}
	
	//click on Set white background button
	public void clickSetWhiteBackgroundButton() {
		SetWhiteBackgroundButton.click();
	}
	
	//validating if the button is enabled
		public boolean isSetWhiteBackgroundButtonEnabled() {
			return SetWhiteBackgroundButton.isEnabled();
	}
		
	public String getSkyBluePageColor() {
		return SkyBlueBackgroundColor.getAttribute("style");
	}
	
	public String getWhitePageColor() {
		return WhiteBackgroundColor.getAttribute("style");
	}
	
	public void closeAndQuit() {
		driver.close();
		driver.quit();
	}
}
