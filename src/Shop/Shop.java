package Shop;

import java.util.*;

import Offer.*;
import User.*;

public class Shop {
	public static ArrayList<Offer> allOffers = new ArrayList<>();
	public static HashMap<ICategory,ArrayList<Offer>> offersByCategory = new HashMap<>();
	public static HashMap<User,ArrayList<Offer>> userAndOffer = new HashMap<>();
	public static HashSet<User> users = new HashSet<>();
	
	
	public static boolean checkUser(String userName){
		for (User u : users) {
			if(u.getUserName().equals(userName)){
				return true;
			}
		}
		return false;
	}
	
	public static void showUsersAndOffers(){
		if(userAndOffer.isEmpty()){
			System.out.println("Empty List!");
			return;
		}
		for (User u : userAndOffer.keySet()  ) {
			System.out.println("---------------");
			System.out.println("User: "+u.getUserName());
			u.showMyOffer();
		}
	}
	
	public static void showUsers(){
		for (User u : userAndOffer.keySet()  ) {
			System.out.println("---------------");
			System.out.println("User Name: " + u.getUserName());
			System.out.println("Address: " + u.getAddress());
			System.out.println("Phone Number:" + u.getPhoneNumber());
			System.out.println("Age:" + u.getAge());
		}
	}
	
	public static void showAllOfers(){
		for (User u : userAndOffer.keySet()  ) {
			u.showMyOffer();
		}
	}
	
	public static void showOffersByCategory(ICategory c){
		for (ICategory cat : offersByCategory.keySet()) {
			if(c.equals(cat)){
				int i = 0;
				for (Offer o : offersByCategory.get(c)) {
					System.out.println("-----Offer " + (++i) + "-----" );
					System.out.println("Name: " + o.getName() );
					System.out.println("Category: " + o.getCategory().getCategoryName() );
					System.out.println("User: " + o.getUser().getName());
					System.out.println("Description: " + o.getDescription() );
					System.out.println("Price: " + o.getPrice() );
					System.out.println("Location: " + o.getLocation() );
					System.out.println("Dead Line: " + o.getDeadLine() );
				}
			}
		}
	}
}
