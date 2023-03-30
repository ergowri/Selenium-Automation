package web_elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		Alerts.simple_Alert();
		Alerts.confirm_Alert();
		Alerts.prompt_Alert();

		driver.close();
	}

	public static void simple_Alert() {
		WebElement simple_alert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		simple_alert.click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
	}

	public static void confirm_Alert() {
		WebElement confirm_alert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		confirm_alert.click();

		Alert a = driver.switchTo().alert();
		a.accept();

		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());

		confirm_alert.click();
		a.dismiss();
		System.out.println(result.getText());
	}

	public static void prompt_Alert() {

		WebElement prompt_alert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		prompt_alert.click();

		Alert a = driver.switchTo().alert();
		a.sendKeys("Prompt_Alert");
		a.accept();

		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());

		prompt_alert.click();
		a.dismiss();
		System.out.println(result.getText());

	}

}
