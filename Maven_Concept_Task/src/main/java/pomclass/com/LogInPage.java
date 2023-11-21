package pomclass.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogInPage {
	public static WebDriver driver;

	@FindBy(id="username")
	private WebElement User;
	
	@FindBy(id="password")
	private WebElement Pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	
	public LogInPage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return User;
	}
	
	public WebElement getPass() {
		return Pass;
	}
	
	public WebElement getLogin() {
		return login;
	}
}