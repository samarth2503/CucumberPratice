package stepdefinations;

import AmazonImpl.Product;
import AmazonImpl.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SerachSteps {
	
	Product p;
	Search s;
	
	@Given("I have a search feild on Amazon page")
	public void i_have_a_serach_feild_on_amazon_page()
	{
		System.out.println("Step 1");
	}
	
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String string, Integer int1) {
	    
		System.out.println("Step 2: serach the product with name :"+ string+ "and price as : "+int1);
		
		p = new Product(string, int1);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
		System.out.println("Step 3");
		
		s = new Search();
		
		String productname = s.displayProduct(p);
		System.out.println(productname);
		
		Assert.assertEquals(string, productname);
	}

}
