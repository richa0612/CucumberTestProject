package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="buy + sell")
	public WebElement BuySellLink; 
	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="reviews")
	public WebElement ReviewsLink; 
	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="news")
	public WebElement NewsLink; 
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="advice")
	public WebElement AdviceLink; 

	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="pricing + specs")
	public WebElement PricingSpecsLink; 
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="New")
	public WebElement NewCarsLink; 
	
	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Used")
	public WebElement UsedCarsLink; 
	


}
