package test.java.scenarios;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

/*
 * Notes: 
 * Method can be renamed
 * Parameters can be renamed
 * DO NOT change the defined entries with @
 *  
 * */
public class TestUserStory1 extends TestCase{
	String buttonName;
	
	@Given("^admin has entered task name as \"([^\"]*)\", start date as \"([^\"]*)\", end date as \"([^\"]*)\", efforts as (\\d+)$")
	public void admin_has_entered_task_name_as_start_date_as_end_date_as_efforts_as(String arg1, String arg2, String arg3, int arg4) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//Setup DTO with input values (from feature file or hardcode here
	    throw new PendingException();
	}

	@When("^click on button \"([^\"]*)\"$")
	public void click_on_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		buttonName = arg1;
		throw new PendingException();
	}

	@Then("^system displays success message as \"([^\"]*)\"$")
	public void system_displays_success_message_as(String arg1) throws Throwable{
	    // Express the Regexp above with the code you wish you had
		
		//define the implementation login in the impl class and invoke the method here
		//assertEquals(expected, actual)
	    throw new PendingException();
	}

	@Then("^system validate date range against efforts$")
	public void system_validate_date_range_against_efforts() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^system validates start date and end date and shows failure message as \"([^\"]*)\"$")
	public void system_validates_start_date_and_end_date_and_shows_failure_message_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	@Given("^user enters start date as \"([^\"]*)\" and end date as \"([^\"]*)\"$")
	public void user_enters_start_date_as_and_end_date_as(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_validate_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^system checks start date is earlier than end date and displays success message$")
	public void system_checks_start_date_is_earlier_than_end_date_and_displays_success_message() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	@Then("^system clear all the data shows message as \"([^\"]*)\"$")
	public void system_clear_all_the_data_shows_message_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	
	@Given("^webuser enters \"([^\"]*)\" in \"([^\"]*)\"$")
	public void webuser_enters_in(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^opens \"([^\"]*)\" and click on \"([^\"]*)\"$")
	public void opens_and_click_on(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^system displays websearch results$")
	public void system_displays_websearch_results() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
