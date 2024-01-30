package stepdefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationPage {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		
		System.out.println("User Registration page...");
	    
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e:userList)
		{
			System.out.println(e);
		}
	   
	}

	@Then("USer registration should be successful")
	public void u_ser_registration_should_be_successful() {
		
		System.out.println("Registration is Successful..");
	    
	}




}
