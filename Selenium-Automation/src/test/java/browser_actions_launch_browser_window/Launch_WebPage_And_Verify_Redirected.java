package browser_actions_launch_browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @see script to open google.com & verify that it is redirected to google.co.in
 *
 */
public class Launch_WebPage_And_Verify_Redirected {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		// Launch google.com webpage
		driver.get("https://www.google.com/");

		// verify that it is redirected to google.co.in
		String expected_url = "https://www.google.co.in/";
		String actual_url = driver.getCurrentUrl();
		if (actual_url.contains(expected_url)) {
			System.out.println("Pass: URL contains .co.in");
		} else {
			System.out.println("Fail: URL doesn't contains .co.in");
		}

		driver.quit();
	}

}
