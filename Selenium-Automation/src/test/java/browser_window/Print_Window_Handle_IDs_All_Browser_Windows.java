package browser_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//script to print window handle IDs of all browser windows
public class Print_Window_Handle_IDs_All_Browser_Windows {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(4000);

		Set<String> all_windows_IDs = driver.getWindowHandles();

		// Return the window handle IDs of all the browser windows
		System.out.println(all_windows_IDs);

		// To retrieve id's we use iterator method
		Iterator<String> it = all_windows_IDs.iterator();
		String parent_window_id = it.next();
		String child_window_id = it.next();
		System.out.println("Parent Window ID: " + parent_window_id);
		System.out.println("Child Window ID: " + child_window_id);

		driver.quit();
	}

}
