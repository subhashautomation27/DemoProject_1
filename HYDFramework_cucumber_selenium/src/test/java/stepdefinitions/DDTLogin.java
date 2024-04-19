
  package stepdefinitions;
  
  import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
  
  public class DDTLogin {
	  @BeforeStep
	  public void beforestepHook()
	  {
		  System.out.println(">>>> before every stepp hook");
	  }
	  
	  @AfterStep
	  public void afterStepHook()
	  {
		  System.out.println(">>>> After every stepp hook");
	  }
	  
	  @And("^user has to enter the valid email address(.*)$")
	  public void user_has_to_enter_the_valid_email_address_email(String emailAddress ) {
		  System.out.println(">> user is enter valid email" + emailAddress);
	  }
	  @And("^user has to enter the valid password(.*)$")
	  public void user_has_to_enter_the_valid_password_password(String password) {
		  System.out.println(">> user enter the password" + password); 
	   
	  }


  
		
  
  
  }
 