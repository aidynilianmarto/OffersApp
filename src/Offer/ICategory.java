package Offer;

import java.util.ArrayList;

public interface ICategory {
	
	public void addOffer(Offer offer);
	public static ICategory getInstance() {
		return null;
	}
	public ArrayList<Offer> getListOfOffers();
	public String getCategoryName();
	
	public static void showListOfOffers(ICategory c){
		for (int i = 0; i < c.getListOfOffers().size(); i++) {
			System.out.println("Name: " + c.getListOfOffers().get(i).getName());
			System.out.println("User: " + c.getListOfOffers().get(i).getUser().getName() );
			System.out.println("Category: " +c.getCategoryName());
			System.out.println("Description: " + c.getListOfOffers().get(i).getDescription());
			System.out.println("Price: " + c.getListOfOffers().get(i).getPrice());
		}
	}
	public void deleteOffer(Offer o);

}
