package pomclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public static WebDriver driver;
	public Search_Hotel_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Location;
	public WebElement getLocation() {
		return Location;
	}
	@FindBy(id="hotels")
	private WebElement Hotels;
	public WebElement getHotels() {
		return Hotels;
	}
	@FindBy(id="room_type")
	private WebElement Room;
	public WebElement getRoom() {
		return Room;
	}
	@FindBy(id="room_nos")
	private WebElement TotalRoom;
	
	public WebElement getTotalRoom() {
		return TotalRoom;
	}

	@FindBy(id="datepick_in")
	private WebElement DPickIn;
	public WebElement getDPickIn() {
		return DPickIn;
	}
	@FindBy(id="datepick_out")
	private WebElement DPickOut;
	public WebElement getDPickOut() {
		return DPickOut;
	}
	@FindBy(id="adult_room")
	private WebElement Adult;
	public WebElement getAdult() {
		return Adult;
	}
	@FindBy(id="child_room")
	private WebElement Child;
	public WebElement getChild() {
		return Child;
	}
	@FindBy(id="Submit")
	private WebElement Search;
	public WebElement getSearch() {
		return Search;
	}
	@FindBy(id="Reset")
	private WebElement Reset;
	public WebElement getReset() {
		return Reset;
	}
}