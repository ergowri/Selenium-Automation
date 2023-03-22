package browser_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//script to close all the child browser windows except the main browser
public class Close_All_Child_Browser_Windows_Only {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		String parent_window_ID = driver.getWindowHandle();
		System.out.println("Parent Window Handle ID: " + parent_window_ID);

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();
		Thread.sleep(4000);

		Set<String> all_window_IDs = driver.getWindowHandles();
		System.out.println("All Window Handle IDs: " + all_window_IDs);

		for (String window_handle_ID : all_window_IDs) {
			driver.switchTo().window(window_handle_ID);
			if (window_handle_ID.equals(parent_window_ID)) {
			} else {
				Thread.sleep(6000);
				driver.close();
			}
		}
		Thread.sleep(8000);
		driver.quit();
	}
}
