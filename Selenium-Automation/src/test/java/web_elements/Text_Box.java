package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Box {

	public static WebDriver driver;
	public static WebElement email;
	public static WebElement password;
	public static WebElement login;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		login = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		Text_Box.capture_text_from_textbox();
		Text_Box.clear_text_from_textbox_using_clear_method();
		// Text_Box.clear_text__without_using_clear_method();
		Text_Box.enter_text_into_textbox();
		Text_Box.clear_text_pressing_back_space();
		Text_Box.copy_paste_text_into_textbox();
		Text_Box.textbox_alignment();
		Text_Box.width_height_textbox();
		Text_Box.getText_vs_getAttribute();

	}

	public static void capture_text_from_textbox() {
		System.out.println(email.getAttribute("value"));
	}

	public static void clear_text_from_textbox_using_clear_method() {
		email.clear();
	}

	public static void clear_text__without_using_clear_method() {
		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.CONTROL.DELETE);
	}

	public static void enter_text_into_textbox() {
		email.sendKeys("admin@yourstore.com");

	}

	public static void clear_text_pressing_back_space() {
		String email_value = email.getAttribute("value");
		System.out.println(email_value);
		int count = email_value.length();
		for (int i = 1; i <= count; i++) {
			email.sendKeys(Keys.BACK_SPACE);
		}
	}

	public static void copy_paste_text_into_textbox() {

		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.CONTROL + "c");
		email.clear();
		email.sendKeys(Keys.CONTROL + "v");

	}

	public static void textbox_alignment() {

		Point p1 = email.getLocation();
		int x1 = p1.getX();
		System.out.println(x1);
		Point p2 = password.getLocation();
		int x2 = p2.getX();
		System.out.println(x2);
		Point p3 = login.getLocation();
		int x3 = p3.getX();
		System.out.println(x2);

		if (x3 - x1 <= 0) {
			System.out.println("Email textbox and password button aligned horizontally");
		} else {
			System.out.println("Email textbox and login button not aligned horizontally");
		}

	}

	public static void width_height_textbox() {

		Dimension d = email.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());

	}

	public static void getText_vs_getAttribute() {

		System.out.println(login.getAttribute("type"));
		System.out.println(login.getText());
	}

}
