package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//script to capture full page screenshot using getScreenshotAs() method
public class Capture_Full_Page_Screenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\loginpage.png");
		FileUtils.copyFile(source, target);

		driver.quit();

	}
}
