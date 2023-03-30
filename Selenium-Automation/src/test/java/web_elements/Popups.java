package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Popups {

	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable--notifications--");
		
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		Popups.permission_Popup();
		Popups.authentication_Popup();

	}

	public static void authentication_Popup() {
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText());
	}

	public static void permission_Popup() {
		driver.get("https://www.redbus.in/");
	}

}
