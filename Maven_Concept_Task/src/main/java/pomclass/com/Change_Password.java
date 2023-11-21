package pomclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Password {
	public static WebDriver driver;
	public Change_Password(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_hotel")
	private WebElement Search_Hotel;
	public WebElement getSearch_Hotel() {
		return Search_Hotel;
	}
	@FindBy(id="my_itinerary")
	private WebElement My_Itinerary;
	public WebElement getMy_Itinerary() {
		return My_Itinerary;
	}
	@FindBy(id="logout")
	private WebElement LogOut;
	public WebElement getLogOut() {
		return LogOut;
	}
}