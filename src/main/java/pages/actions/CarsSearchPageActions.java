package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.NewCarSearchPageLocators;
import utilities.SeleniumWebDriver;

public class CarsSearchPageActions {
	
	NewCarSearchPageLocators newCarSearchPageLocators = null;
	
	public CarsSearchPageActions() {
	
	this.newCarSearchPageLocators = new NewCarSearchPageLocators();
	PageFactory.initElements(SeleniumWebDriver.getDriver(), newCarSearchPageLocators);
	
	}
	
	public void selectCarMake(String carBrand) {
		
		Select select = new Select(newCarSearchPageLocators.AnyMakeDropdown);
		select.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel) {
		
		Select select = new Select(newCarSearchPageLocators.AnyModelDropdown);
		select.selectByVisibleText(carModel);
		
	}
	
	public void selectLocation(String Location) {
		
		Select select = new Select(newCarSearchPageLocators.AnyLocationDropdown);
		select.selectByVisibleText(Location);
		
	}
	
	public void selectPrice(String Price) {
		
		Select select = new Select(newCarSearchPageLocators.PriceDropdown);
		select.selectByVisibleText(Price);
		
	}
	
	public void clickCarSearchBtn() {
		
		newCarSearchPageLocators.FindMyNextCarBtn.click();
		
		
	}

}
