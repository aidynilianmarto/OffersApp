package Offer;

import java.util.ArrayList;

public interface ICategory {
	
	public void addOffer(Offer offer);
	public String getCategoryName();
	public static void showListOfOffers(ArrayList<Offer> o){
		if(o.size() == 0){
			System.out.println("No offers in this Category!");
			return;
		}
		for (int i = 0; i < o.size(); i++) {
			System.out.println("Name: " + o.get(i).getName());
			System.out.println("User: " + o.get(i).getUser().getName() );
			System.out.println("Category: " + o.get(i).getCategory().getCategoryName());
			System.out.println("Description: " + o.get(i).getDescription());
			System.out.println("Price: " + o.get(i).getPrice());
		}
	}
	public void deleteOffer(Offer o);

}
