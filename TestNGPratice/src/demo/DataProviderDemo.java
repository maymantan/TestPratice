package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider="dataset")
	public void login(String username ,String password) {
		
		System.out.println(username);
		System.out.println(password);
		System.out.println("##################################");
		
	}
	
	
	@DataProvider
	public Object[][] dataset() {
		Object[][] ob = new Object[3][2];
		
		ob[0][0]="Manish";
		ob[0][1]="Manish123";
		
		ob[1][0]="Tanu";
		ob[1][1]="Tanu123";
		
		ob[2][0]="Mayank";
		ob[2][1]="Mayank123";
		
		return ob;
	}
	
	
}
