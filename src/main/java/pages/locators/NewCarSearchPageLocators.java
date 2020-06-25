package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewCarSearchPageLocators {
	
	
	@FindBy(how=How.XPATH,using="//select[@id='makes']")
	public WebElement AnyMakeDropdown; 
	
	@FindBy(how=How.XPATH,using="//select[@id='models']")
	public WebElement AnyModelDropdown; 
	
	@FindBy(how=How.XPATH,using="//select[@id='locations']")
	public WebElement AnyLocationDropdown; 
	
	@FindBy(how=How.XPATH,using="//select[@id='priceTo']")
	public WebElement PriceDropdown; 
	
	@FindBy(how=How.XPATH,using="//input[@id='search-submit']")
	public WebElement FindMyNextCarBtn; 

}
