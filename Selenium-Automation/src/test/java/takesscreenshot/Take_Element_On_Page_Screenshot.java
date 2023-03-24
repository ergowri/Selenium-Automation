package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//script to capture element on page screenshot using getScreenshotAs() method
public class Take_Element_On_Page_Screenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(source, target);

		driver.quit();

	}
}
