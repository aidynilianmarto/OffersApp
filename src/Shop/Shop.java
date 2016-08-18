package Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import Offer.Offer;
import Offer.ICategory;
import User.User;

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
}
