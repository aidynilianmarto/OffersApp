package Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import Offer.Offer;
import Offer.ICategory;
import User.User;

public class Shop {
	
	
	private static HashMap<ICategory,ArrayList<Offer>> offersByCategory = new HashMap<>();
	private static HashMap<User,ArrayList<Offer>> userAndOffer = new HashMap<>();
	private static HashSet<User> users = new HashSet<>();
	
	
	public static HashSet<User> getUsers() {
		return users;
	}
	
	public static HashMap<ICategory, ArrayList<Offer>> getOffersByCategory() {
		return offersByCategory;
	}
	
	public static HashMap<User, ArrayList<Offer>> getUserAndOffer() {
		return userAndOffer;
	}
	
	public static boolean checkUser(String userName){
		for (User u : users) {
			if(u.getUserName().equals(userName)){
				return true;
			}
		}
		return false;
	}
	
	public static void showUsersAndOffers(){
		for (User u : userAndOffer.keySet()  ) {
			System.out.println("---------------");
			System.out.println(u.getUserName());
			u.getMyOffer();
		}
	}
}
