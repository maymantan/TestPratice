package demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void demo1() {
		System.out.println("Hello 1");
	}
	@Test(groups={"Smoke"})
	public void pratice() {
		System.out.println("Smoke group oin Day1");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute first");
	}
	
	@Parameters("job")
	@Test
	public void demo2(String name) {
		System.out.println(name);
	}

}
