package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	
	@Given("USer wants to select  a car type {string} from uber app")
	public void u_ser_wants_to_select_a_car_type_from_uber_app(String string) {
		
		System.out.println("Car type is "+string);
	    
	}

	@When("user select car {string} and pick up point {string} and drop location {string}")
	public void user_select_car_and_pick_up_point_and_drop_location(String string, String string2, String string3) {
		
		System.out.println("Car type is "+string);
	  
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	   
		System.out.println("Driver started the journey");
	}

	@And("Driver ends the jounery")
	public void driver_ends_the_jounery() {
		
		System.out.println("Driver ends the journey");
		
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer int1) {
		
		System.out.println("User pays"+ int1 + "for the jouney");
	   
	}


}
