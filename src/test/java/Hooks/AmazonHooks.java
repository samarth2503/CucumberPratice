package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

/*
 * @Before --> will be executed after each scenario
 * @After --> will be executed after each scenario
 * 
 * We can have multiple Before statement
 * We can order the before method execution
 * 
 * Annotaions tags with hook
 * 
 * 
 */
public class AmazonHooks {
	
	@Before(order = 1)
	public void setUp_browser(Scenario sc)
	{
		System.out.println("launch amazon application");
		System.out.println(sc.getName());
	}
	
	@Before(order = 2)
	public void setup_url()
	{
		System.out.println("Setup the url..");
	}
	
	@After(order=2)
	public void tearDown_close()
	{
		System.out.println("Close the browser");
	}
	
	@After(order = 1)
	public void tearDown_logout()
	{
		System.out.println("Logout from application");
	}
	
	@BeforeStep("@Smoke")
	public void takescreenshot()
	{
		System.out.println("Take the screen shot");
	}
	
	@AfterStep
	public void refreshPage()
	{
		System.out.println("Refresh Page");
	}
	

}
