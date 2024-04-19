package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	  @Before()  public void setup(Scenario sc)  { 
	  System.out.println("Execution started:"+"_"+sc.getName()); 
	  System.out.println("browser opend"); 
	  System.out.println("Application URL got opend");
	  System.out.println("subhash");}
	 	
	@After()
	public void teardown(Scenario sc)
	{    
		System.out.println("Execution got completed"+"_"+sc.getName());
		System.out.println("Logged out the applications");
		System.out.println("browser closed");
		
	}


}
