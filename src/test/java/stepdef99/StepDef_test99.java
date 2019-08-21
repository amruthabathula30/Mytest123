package stepdef99;

import org.junit.Assert;

import cucumber.api.java.en.Given;

public class StepDef_test99 {
	@Given("I have access to jenkins")
	public void i_have_access_to_jenkins() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for jenkins");
	    
	}

	@Given("I verify my creds")
	public void i_verify_my_creds() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		String S= "jenkins";
		String S1= "Git";
		System.out.println("my test 132");
		Assert.assertEquals(S, S1);
	}

}
