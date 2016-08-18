package User;

import Offer.ICategory;
import Offer.Offer;

public interface IUser {
	
	void addOffer(Offer o,ICategory c);
	void logIn(String name , String password);
	void logOut();
	void addToFavourite(Offer o);
	void callUser(User u);
	void sendMsg(User u,String title,String msg);
	void searchByCategory(ICategory c);
	void searchByName(String name);
	void search(ICategory c , String name);
	void deleteOffer(Offer o);
	void archiveOffer(Offer o);
	void changePassword(String oldPw,String newPw);
	void changeMail(String oldMail,String newMail);
	void changeOffersName(Offer o, String newName);
	void showMyOffer();
	void showMyFavouriteOffer();
	void showArchivedOffer();
	void showReceivedMessages();
	void showSendMessages();
	static void viewOffer(Offer o) {
		System.out.println("Name: " + o.getName() );
		System.out.println("Description: " + o.getDescription() );
		System.out.println("Price: " + o.getPrice() );
		System.out.println("Location: " + o.getLocation() );
		System.out.println("Dead Line: " + o.getDeadLine() );
	}
	
}
