package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.actions.UsedCarsSearchActions;

public class UsedCarsSearchSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchActions usedcarsSearchPageActions = new UsedCarsSearchActions();	
	
	
	@And("^click on submenu \"([^\"]*)\" link$")
	public void click_on_submenu_link(String arg1) throws Throwable {
		
		carsGuideHomePageActions.clickOnUsedCarSearchMenu();

	}
	
	@And("^select carbrand as \"([^\"]*)\" from Any Make dropdown on Used Car Search page$")
	public void select_carbrand_as_from_Any_Make_dropdown_on_Used_Car_Search_page(String carBrand) throws Throwable {
		
		usedcarsSearchPageActions.selectCarMake(carBrand);

	}

	@And("^select car model on Used Car Search page$")
	public void select_car_model_on_Used_Car_Search_page(List <String> list) throws Throwable {
		String menu = list.get(1);
		System.out.println("The menu selected is:" +menu);
		usedcarsSearchPageActions.selectCarModel(menu);
	}

	@And("^select location as \"([^\"]*)\" from Any Location dropdown on Used Car Search page$")
	public void select_location_as_from_Any_Location_dropdown_on_Used_Car_Search_page(String Location) throws Throwable {
		
		usedcarsSearchPageActions.selectLocation(Location);

	}

	@And("^select the price as \"([^\"]*)\" from Price dropdown on Used Car Search page$")
	public void select_the_price_as_from_Price_dropdown_on_Used_Car_Search_page(String Price) throws Throwable {
		
		usedcarsSearchPageActions.selectPrice(Price);

	}

	@And("^click on Find_My_Next_Car button on Used Car Search page$")
	public void click_on_Find_My_Next_Car_button_on_Used_Car_Search_page() throws Throwable {
		
		usedcarsSearchPageActions.clickCarSearchBtn();

	}

	@And("^I should see list of used searched cars$")
	public void i_should_see_list_of_used_searched_cars() throws Throwable {

	}
	

}
