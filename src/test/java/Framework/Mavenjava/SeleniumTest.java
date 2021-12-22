package Framework.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test(groups= {"Smoke"})
	public void webtest() {
		System.out.println("Browser");
	}
	
	@Test
	public void screentest() {
		System.out.println("Hower Test");
	}
}
