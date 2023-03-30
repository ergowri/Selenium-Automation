package web_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.linkText("Gift Cards")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Today's")).click();
		System.out.println(driver.getTitle());

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement amazonlinks : links) {
			System.out.println(amazonlinks.getText());
			System.out.println(amazonlinks.getAttribute("href"));

		}

		driver.close();

	}
}
