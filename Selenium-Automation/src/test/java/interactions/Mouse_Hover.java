package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @see script to automate mouse hover using moveToElement() method
 *      of actions class.
 * @see Scenario Steps :
 * @see 1. Got to http://www.istqb.in
 * @see 2. Mouse hover on Desktop tab
 * @see 5. click on Show All Desktops
 * 
 */
public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");

		WebElement desktops = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement showall_desktops = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/a"));

		Actions a = new Actions(driver);
		a.moveToElement(desktops).moveToElement(showall_desktops).click().build().perform();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		driver.quit();
	}

}
