package browser_actions_browser_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//script to navigate b/w multiple tabs & perform some action on each tabs
public class Navigate_Mulitple_Tabs_Perform_Actions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();
		Thread.sleep(7000);

		Set<String> all_window_IDs = driver.getWindowHandles();

		for (String window_handle_ID : all_window_IDs) {
			driver.switchTo().window(window_handle_ID);
			System.out.println(driver.getTitle());
			Thread.sleep(7000);
			driver.close();
		}
		Thread.sleep(8000);
		driver.quit();
	}

}
