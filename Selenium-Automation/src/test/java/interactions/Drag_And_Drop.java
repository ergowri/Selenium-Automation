package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//script to automate dragAndDrop using dragAndDrop() of actions class
public class Drag_And_Drop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable/");

		WebElement drag_source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drag_target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		Actions a = new Actions(driver);
		// first method
		a.dragAndDrop(drag_source, drag_target).build().perform();
		System.out.println(driver.findElement(By.id("droppable")).getText());
		Thread.sleep(4000);

		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("*//iframe[@class='demo-frame lazyloaded']")));
		WebElement drag_source_gallery = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement drag_target_trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));

		Actions ac = new Actions(driver);
		// second method
		ac.clickAndHold(drag_source_gallery).moveToElement(drag_target_trash).build().perform();
		Thread.sleep(4000);
		ac.release();
		
		Thread.sleep(4000);
		driver.quit();

	}
}
