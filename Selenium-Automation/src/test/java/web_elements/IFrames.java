package web_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		List<WebElement> number_of_iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of Iframes in webpage: " + number_of_iframes.size());

		driver.switchTo().frame("packageListFrame");// frame1
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");// frame2
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");// frame3
		driver.findElement(By.xpath("//html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		Thread.sleep(3000);

		driver.close();

	}
}
