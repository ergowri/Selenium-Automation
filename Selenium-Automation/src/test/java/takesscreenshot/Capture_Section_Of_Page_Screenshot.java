package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//script to capture section of page screenshot using getScreenshotAs() method
public class Capture_Section_Of_Page_Screenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		WebElement register = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div"));
		File source = register.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\register.png");
		FileUtils.copyFile(source, target);
		
		driver.quit();

	}

}
