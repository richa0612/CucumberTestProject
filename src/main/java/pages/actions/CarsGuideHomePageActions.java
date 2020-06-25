package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumWebDriver;

public class CarsGuideHomePageActions {
	
	
	pages.locators.CarsGuideHomePageLocators carsGuideHomePageLocators = null;
	
	
	public CarsGuideHomePageActions () {
		
		this.carsGuideHomePageLocators = new pages.locators.CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumWebDriver.getDriver(), carsGuideHomePageLocators);
		
	}
	
	
	public void moveToBuySellMenu() {
		
		Actions action = new Actions(SeleniumWebDriver.getDriver());
		
		action.moveToElement(carsGuideHomePageLocators.BuySellLink).perform();
		
		
	}
	
	public void clickOnNewCarSearchMenu() {
		
		
		carsGuideHomePageLocators.NewCarsLink.click();
		
	}
	
	public void clickOnUsedCarSearchMenu() {
		
		carsGuideHomePageLocators.UsedCarsLink.click();
		
				
		
	}
	
	public void moveToReviewsMenu() {
		
		Actions action = new Actions(SeleniumWebDriver.getDriver());
		
		action.moveToElement(carsGuideHomePageLocators.ReviewsLink).perform();
		
		
	}

}
