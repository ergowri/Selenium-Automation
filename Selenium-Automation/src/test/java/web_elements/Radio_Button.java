package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement male = driver.findElement(By.id("gender-male"));
		WebElement female = driver.findElement(By.name("Gender"));

		System.out.println("Male radio button is displayed: " + male.isDisplayed());
		System.out.println("Male radio button is enabled: " + male.isEnabled());
		male.click();
		System.out.println("Male radio button is selected: " + male.isSelected());

		if (male.isSelected()) {
			female.click();
			System.out.println("Female radio button is selected: " + female.isSelected());
		}

		driver.close();

	}

}
