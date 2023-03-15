package browser_actions_browser_windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//script to print window handle ID of current browser window
public class Print_Window_Handle_ID_Current_Browser {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		// Return window handle ID of current browser window
		System.out.println("Window handle ID of current browser window is: " + driver.getWindowHandle());

		driver.quit();
	}

}
