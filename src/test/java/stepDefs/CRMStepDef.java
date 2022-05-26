package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	//multiple methods in before
	@Before(value="@RegressionTest", order=1)
	public void readFromWinProp() {
		System.out.println("Read From Win Prop File");
	}

	@Before(value="@RegressionTest", order=2)
	public void initializeDB() {
		System.out.println("Initialize Win  DB");
	}
	
	@Before(value="@SmokeTest", order=1)
	public void readFromMacProp() {
		System.out.println("Read From Mac Prop File");
	}

	@Before(value="@SmokeTest",order=2)
	public void initializeMacDB() {
		System.out.println("Initialize Mac DB");
	}
	//@Before("@RegressionTest")
	//public void initializeDB1() {
	//	System.out.println("Initialize for Regression Test");
	//}

	//@Before("@SmokeTest or @RegressionTest")
	//public void initializeDB2() {
	//	System.out.println("Initialize for Smoke Test");
	//}
	
	@After
	public void teardown() {
		System.out.println("--------------------");
	}
	
//	@BeforeAll
//	public void initializeDD() {
//		System.out.println("Before All scenario");
//	}
	
	@Given("User must be logged in")
	public void user_must_be_logged_in() {
	 System.out.println("User must be logged in");
	}
	
	@When("User create a contact")
	public void user_create_a_contact() {
		System.out.println("User create a contact");
	}

	
	@When("User edit a contact")
	public void user_edit_a_contact() {
		System.out.println("User edit a contact"); 
	}
	
	
	@When("User view a contact")
	public void user_view_a_contact() {
		System.out.println("User view a contact"); 
	}

	
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact"); 
	}

	@When("User create a deal")
	public void user_create_a_deal() {
		System.out.println("User create a deal");
	}

	
	@When("User edit a deal")
	public void user_edit_a_deal() {
		System.out.println("User edit a deal"); 
	}
	
	
	@When("User view a deal")
	public void user_view_a_deal() {
		System.out.println("User view a deal"); 
	}

	
	@When("User delete a deal")
	public void user_delete_a_deal() {
		System.out.println("User delete a deal"); 
	}

	@When("User create a task")
	public void user_create_a_task() {
		System.out.println("User create a task");
	}

	
	@When("User edit a task")
	public void user_edit_a_task() {
		System.out.println("User edit a task"); 
	}
	
	
	@When("User view a task")
	public void user_view_a_task() {
		System.out.println("User view a task"); 
	}

	
	@When("User delete a task")
	public void user_delete_a_task() {
		System.out.println("User delete a task"); 
	}



}
