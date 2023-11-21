package runner.com;


import base.com.BaseClass_MostlyUsed;
import pomclass.com.Book_Itinerary_Page;
import pomclass.com.Change_Password;
import pomclass.com.Change_Password_Page;
import pomclass.com.LogInPage;
import pomclass.com.Search_Hotel_Page;

public class Runner_Adactin extends BaseClass_MostlyUsed{
	public static void main(String[] args) {
		webpage();
		get("https://adactinhotelapp.com/");
		LogInPage lp = new LogInPage(driver);
		sendkey(lp.getUser(), "Ghouthiya");
		sendkey(lp.getPass(), "9087349822");
		click(lp.getLogin());
		Search_Hotel_Page s = new Search_Hotel_Page(driver);
		selectbyvalue(s.getLocation(), 2);
		selectbyvalue(s.getHotels(), 3);
		selectbyvalue(s.getRoom(), 2);
		selectbyvalue(s.getTotalRoom(), 1);
		sendkey(s.getDPickIn(), "19/09/2023");
		sendkey(s.getDPickOut(), "21/09/2023");
		selectbyvalue(s.getAdult(), 2);
		selectbyvalue(s.getChild(), 1);
		click(s.getSearch());
		Book_Itinerary_Page B = new Book_Itinerary_Page(driver);
		click(B.getRadio_Button());
		click(B.getContinue());
		Change_Password_Page P =new Change_Password_Page(driver);
		sendkey(P.getFirst_name(), "Ghouthiya");
		sendkey(P.getLast_name(), "Vijesh");
		sendkey(P.getAddress(), "3/4, AnnaSelai MainRoad, Pazhayar(p.o), Sirkali(T.k), Mailai(D.s)");
		sendkey(P.getCredit_card_No(), "1234567890123456");
		selectbyvalue(P.getCredit_card_type(), 2);
		selectbyvalue(P.getCredit_card_month(), 3);
		selectbyvalue(P.getCredit_card_year(), 10);
		sendkey(P.getCCV_No(), "9876");
		click(P.getBook_Now());
		Change_Password C = new Change_Password(driver);
		click(C.getMy_Itinerary());
		
		
	}
}
