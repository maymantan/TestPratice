package demo;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void demoA() {
		System.out.println("Hello 3");
	}
	@Test
	public void demoB() {
		System.out.println("Hello 4");
	}
	@Test
	public void demoC() {
		System.out.println("Hello 5");
	}
	@Test(groups={"Smoke"})
	public void demoD() {
		System.out.println("Smoke group");
	}
	@Test(dependsOnMethods= {"demoB"})
	public void demoE() {
		System.out.println("This method is depend on demo5 and demo4");
	}
	@Test(enabled=false)
	public void demoF() {
		System.out.println("This method is disable");
	}
	@Test(timeOut=30)
	public void demoI() {
		System.out.println("Time out of 4 sec");
	}

}
