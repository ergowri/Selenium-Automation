package webelement_radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/radio-button");

		WebElement yes = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]"));
		WebElement impressive = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
		WebElement no = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]"));
	
		System.out.println("Yes radio button is enabled: " + yes.isEnabled());
		Thread.sleep(2000);
		yes.click();
		System.out.println(yes.getText());
		System.out.println("Yes radio button is selected: " + yes.isSelected());
		Thread.sleep(2000);

		if (yes.isSelected()) {
			Thread.sleep(2000);
			impressive.click();

			System.out.println(impressive.getText());
			System.out.println("Impressive radio button is selected: " + impressive.isSelected());
		}

		if (no.isEnabled()) {
			System.out.println("Radio button is enabled and it cannot be seleceted");
		} else {
			System.out.println("No radio button is not enabled and it cannot be seleceted");
		}
		driver.quit();

	}

}
