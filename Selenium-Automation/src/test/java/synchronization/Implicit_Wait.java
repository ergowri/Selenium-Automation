package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Implicit_Wait {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		By elementlocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");

		Implicit_Wait.implicit_Wait(10);

	}

	public static void implicit_Wait(int time) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}
}
