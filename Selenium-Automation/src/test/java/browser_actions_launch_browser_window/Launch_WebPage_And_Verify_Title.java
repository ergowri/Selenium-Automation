package browser_actions_launch_browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @see script to open google.com and verify that title is Google
 *
 */
public class Launch_WebPage_And_Verify_Title {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		// Launch google.com webpage
		driver.get("https://www.google.com/");

		// verify that title is Google
		String expected_title = "Google";
		String actual_title = driver.getTitle();
		if (actual_title.equals(expected_title)) {
			System.out.println("Pass: Title is Google");
		} else {
			System.out.println("Fail: Title is not Google");
		}
		// System.out.println(driver.getPageSource());

		driver.quit();
	}

}
