package pomclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Password_Page {
	public static WebDriver driver;
	public Change_Password_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement First_name;
	public WebElement getFirst_name() {
		return First_name;
	}
	@FindBy(id="last_name")
	private WebElement Last_name;
	public WebElement getLast_name() {
		return Last_name;
	}
	@FindBy(id="address")
	private WebElement Address;
	public WebElement getAddress() {
		return Address;
	}
	@FindBy(id="cc_num")
	private WebElement Credit_card_No;
	public WebElement getCredit_card_No() {
		return Credit_card_No;
	}
	@FindBy(id="cc_type")
	private WebElement Credit_card_type;
	public WebElement getCredit_card_type() {
		return Credit_card_type;
	}
	@FindBy(id="cc_exp_month")
	private WebElement Credit_card_month;
	public WebElement getCredit_card_month() {
		return Credit_card_month;
	}
	@FindBy(id="cc_exp_year")
	private WebElement Credit_card_year;
	public WebElement getCredit_card_year() {
		return Credit_card_year;
	}
	@FindBy(id="cc_cvv")
	private WebElement CCV_No;
	public WebElement getCCV_No() {
		return CCV_No;
	}
	@FindBy(id="book_now")
	private WebElement Book_Now;
	public WebElement getBook_Now() {
		return Book_Now;
	}
	@FindBy(id="cancel")
	private WebElement Cancel;
	public WebElement getCancel() {
		return Cancel;
	}
}