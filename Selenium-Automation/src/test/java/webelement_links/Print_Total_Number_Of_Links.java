package webelement_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//Script to find the total number of links present on google page?
public class Print_Total_Number_Of_Links {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		// List<WebElement> links = driver.findElements(By.xpath("//a"));

		int number_of_links = links.size();
		System.out.println("Total number of links present on webpage: " + number_of_links);

		driver.quit();

	}

}
