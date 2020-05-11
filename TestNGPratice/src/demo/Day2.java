package demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void demo2() {
		System.out.println("Hello 2");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This will execute at last");
		Assert.assertTrue(false);
	}

}
