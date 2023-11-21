package pomclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Book_Itinerary_Page {
	public static WebDriver driver;
	public Book_Itinerary_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement Radio_Button;
	public WebElement getRadio_Button() {
		return Radio_Button;
	}
	@FindBy(id="continue")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
	@FindBy(id="cancel")
	private WebElement Cancel;
	public WebElement getCancel() {
		return Cancel;
	}
}
