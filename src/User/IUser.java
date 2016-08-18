package User;

import Offer.ICategory;
import Offer.Offer;

public interface IUser {
	
	void addOffer(Offer o,ICategory c);
	void logIn(String name , String password);
	void addToFavourite(Offer o);
	void viewOffer(Offer o);
	void callUser(User u);
	void sendMsg(User u,String title,String msg);
	void searchByCategory(ICategory c);
	void searchByName(String name);
	void search(ICategory c , String name);
	void deleteOffer(Offer o);
	void archiveOffer(Offer o);
	void changePassword(String oldPw,String newPw);
	void changeMail(String oldMail,String newMail);
	void getMyOffer();
	void showReceivedMessages();
	void showSendMessages();
	
}
