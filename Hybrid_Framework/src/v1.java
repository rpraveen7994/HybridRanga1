import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class v1 {

	@Test
	public void t10() {

		System.setProperty("webdriver.firefox.marionette","E:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.indiatoday.in/");
		driver.get("https://www.google.com/search?client=firefox-b-d&q=Salaar");
		
//		System.out.println("ff");
	}

	
	@Test
	public void t11() {
		Assert.assertTrue(true);
	}
}
