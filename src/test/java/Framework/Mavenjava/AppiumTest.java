package Framework.Mavenjava;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void AndroidTest() {
		System.out.println("Android Test");
	}
	
	@Test(groups= {"Smoke"})
	
	public void IOSTest() {
		System.out.println("IOS Test");
	}
}
