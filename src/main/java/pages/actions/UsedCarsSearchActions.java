package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.NewCarSearchPageLocators;
import pages.locators.UsedCarsSearchPageLocators;
import utilities.SeleniumWebDriver;

public class UsedCarsSearchActions {
	
	UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;
	
	
	public UsedCarsSearchActions() {
		
		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumWebDriver.getDriver(), usedCarsSearchPageLocators);
		
		
	}
	

	public void click_on_submenu_link(String arg1) throws Throwable {

	}
	
	public void selectCarMake(String carBrand) {
		
		Select select = new Select(usedCarsSearchPageLocators.AnyMakeDropdown);
		select.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel) {
		
		Select select = new Select(usedCarsSearchPageLocators.AnyModelDropdown);
		select.selectByVisibleText(carModel);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectLocation(String Location) {
		
		Select select = new Select(usedCarsSearchPageLocators.AnyLocationDropdown);
		select.selectByVisibleText(Location);
		
	}
	
	public void selectPrice(String Price) {
		
		Select select = new Select(usedCarsSearchPageLocators.PriceDropdown);
		select.selectByVisibleText(Price);
		
	}
	
	public void clickCarSearchBtn() {
		
		usedCarsSearchPageLocators.FindMyNextCarBtn.click();
		
		
	}
	

	

}
