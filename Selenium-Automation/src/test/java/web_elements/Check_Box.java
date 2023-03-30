package web_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Check_Box {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		// Check_Box.select_single_check_box();
		// Check_Box.select_all_check_box();
		// Check_Box.select_multiple_check_box_choices();
		Check_Box.select_lasttwo_check_box();
		// Check_Box.select_firsttwo_check_box();
		// Check_Box.number_of_checkboxes_page();

		driver.close();
	}

	public static void select_single_check_box() throws InterruptedException {

		driver.findElement(By.id("monday")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("monday")).click();
	}

	public static void select_all_check_box() throws InterruptedException {
		List<WebElement> check_boxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for (int i = 0; i <= check_boxes.size(); i++) {
			check_boxes.get(i).click();
			Thread.sleep(2000);
		}
	}

	public static void select_multiple_check_box_choices() throws InterruptedException {
		List<WebElement> check_boxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for (WebElement checkboxes : check_boxes) {
			String checkbox_name = checkboxes.getAttribute("id");
			if (checkbox_name.equals("wednesday") | checkbox_name.equals("saturday")) {
				checkboxes.click();
				Thread.sleep(2000);
			}
		}
	}

	public static void select_lasttwo_check_box() throws InterruptedException {
		List<WebElement> check_boxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int total_checkboxes = check_boxes.size();
		for (int i = total_checkboxes - 2; i < total_checkboxes; i++) {
			check_boxes.get(i).click();
			Thread.sleep(2000);
		}
	}

	public static void select_firsttwo_check_box() throws InterruptedException {
		List<WebElement> check_boxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for (int i = 0; i < check_boxes.size(); i++)
			if (i < 2) {
				check_boxes.get(i).click();
				Thread.sleep(2000);
			}
	}

	public static void number_of_checkboxes_page() {
		List<WebElement> number_of_checkboxes_page = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println(number_of_checkboxes_page.size());
	}

}
