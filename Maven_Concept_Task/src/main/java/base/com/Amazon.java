package base.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.amazon.in/");
		dri.manage().window().maximize();
		WebElement SearchText = dri.findElement(By.id("twotabsearchtextbox"));
		SearchText.sendKeys("Electronics Things");
		WebElement Searchbutton = dri.findElement(By.id("nav-search-submit-button"));
		Searchbutton.click();
		
		
	}

}
