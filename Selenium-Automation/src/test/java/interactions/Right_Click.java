package interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//script to rightclick "OrangeHRMInc"link on OHRM page&open in new window
public class Right_Click {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement orangehrm_inc_link = driver
				.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a"));

		Actions actions = new Actions(driver);
		actions.contextClick(orangehrm_inc_link).build().perform();
		Thread.sleep(2000);

		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_W);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.quit();

	}

}
