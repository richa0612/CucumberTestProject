package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utilities.SeleniumWebDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();	
	
	@Given("I am on the home page \"([^\"]*)\" cars guide website$")
	public void I_am_on_the_home_page_of_cars_guide_website (String webSiteURL) throws Throwable{
		
		SeleniumWebDriver.openPage(webSiteURL);

	}

	@When("I move to menu$")
	public void I_move_to_menu (List <String> list) throws Throwable{
		
		String menu = list.get(1);
		System.out.println("The menu selected is:" +menu);
		
		carsGuideHomePageActions.moveToBuySellMenu();


	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchcars)  {
	    //SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.clickOnNewCarSearchMenu();;
	}
	
	
	@And("select carbrand as \"([^\"]*)\" from Any Make dropdown$")
	public void select_carbrand_as_from_Any_Make_dropdown(String carBrand)  throws Throwable{
		
		carsSearchPageActions.selectCarMake(carBrand);
		

	}

	
	@And("select carmodel as \"([^\"]*)\" from Any Model dropdown$")
	public void select_carmodel_as_from_Any_Model_dropdown (String carModel)  throws Throwable{
		
		carsSearchPageActions.selectCarModel(carModel);

	}

	@And("^select location as \"([^\"]*)\" from Any Location dropdown$")
	public void select_location_as_from_Any_Location_dropdown(String Location) throws Throwable{
		
		carsSearchPageActions.selectLocation(Location);

	}

	@And("select the price as \"([^\"]*)\" from Price dropdown$") 
	public void select_the_price_as_from_Price_dropdown(String Price) throws Throwable{
		
		carsSearchPageActions.selectPrice(Price);

	}

	@And("click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button()  throws Throwable{
		
		carsSearchPageActions.clickCarSearchBtn();

	}

	@Then("^I validate the title of the page as \"([^\"]*)\"$")
	public void I_validate_the_title_of_the_page_as (String expected_Title)  throws Throwable{
		
		String actual_Title = SeleniumWebDriver.getDriver().getTitle();
		Assert.assertEquals(actual_Title,expected_Title);

	}


	@And("I should see list of searched cars")
	public void I_should_see_list_of_searched_cars() throws Throwable {
		
		System.out.println("List of searched cars");

	}



}
