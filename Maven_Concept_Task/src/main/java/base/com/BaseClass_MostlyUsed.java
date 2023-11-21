package base.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClass_MostlyUsed{
	public static WebDriver driver;
	public  static WebDriver webpage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void get(String URL) {
		driver.get(URL);
	}
	public static void exit() {
		driver.quit();

	}
	
	public static void getText(WebElement s) {
		String text = s.getText();
		System.out.println(text);
	}
	public static void sendkey(WebElement s, String data) {
		s.sendKeys(data);
	}
	public static void click(WebElement s) {
		s.click();
	}
	public static void selectbyvalue(WebElement s, int v) {
		Select S1=new Select(s);
		S1.selectByIndex(v);
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Dell\\eclipse-workspace\\Maven_Concept_Task\\Screen\\" +name+ ".png");
		FileUtils.copyFile(screenshotAs, f);
	}
	public static void simple_alert() {
		Alert S_alert = driver.switchTo().alert();
		S_alert.accept();
	}
	public static void confirm_alert(String msg) {
		Alert C_alert = driver.switchTo().alert();
		if (msg.equalsIgnoreCase("ok")) {
			C_alert.accept();
		} else {
			C_alert.dismiss();
		}
	}
	public static void prompt_alert(String msg) {
		Alert P_alert = driver.switchTo().alert();
		if (msg.equalsIgnoreCase("ok")) {
			P_alert.accept();
		} else {
			P_alert.dismiss();
		}
	}
	
//	public static void main(String[] args) throws IOException {
//		webpage();
//		get("https://adactinhotelapp.com/");
//		sendkey(driver.findElement(By.id("username")), "Ghouthiya");
//		sendkey(driver.findElement(By.id("password")), "9087349822");
//		click(driver.findElement(By.id("login")));
//		selectbyvalue(driver.findElement(By.id("location")), 3);
//		selectbyvalue(driver.findElement(By.id("hotels")), 1);
//		selectbyvalue(driver.findElement(By.id("room_type")), 3);
//		selectbyvalue(driver.findElement(By.id("room_nos")), 2);
//		sendkey(driver.findElement(By.id("datepick_in")), "09/09/2023");
//		sendkey(driver.findElement(By.id("datepick_out")), "11/09/2023");
//		selectbyvalue(driver.findElement(By.id("adult_room")), 2);
//		selectbyvalue(driver.findElement(By.id("child_room")), 3);
//		click(driver.findElement(By.id("Submit")));
//		click(driver.findElement(By.id("radiobutton_0")));
//		click(driver.findElement(By.id("continue")));
//		sendkey(driver.findElement(By.id("first_name")), "Ghouthiya");
//		sendkey(driver.findElement(By.id("last_name")), "Vijesh");
//		sendkey(driver.findElement(By.id("address")), "\"3/4, AnnaSelai, Pazhayar(Po), Sirkali(Tk), Mailai. 609101\"");
//		sendkey(driver.findElement(By.id("cc_num")), "9876543210123654");
//		selectbyvalue(driver.findElement(By.id("cc_type")), 2);
//		selectbyvalue(driver.findElement(By.id("cc_exp_month")), 10);
//		selectbyvalue(driver.findElement(By.id("cc_exp_year")), 15);
//		sendkey(driver.findElement(By.id("cc_cvv")), "KM97865843210");
//		click(driver.findElement(By.id("book_now")));
//		click(driver.findElement(By.id("my_itinerary")));
//		screenshot("Adactin");
//	}
}