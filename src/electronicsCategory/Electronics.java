package electronicsCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Electronics implements ICategory{

private static ArrayList<Offer> electronicOffers;
	
	protected Electronics(){
		electronicOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		electronicOffers.remove(o);
	}
	public static void showFashionOffer(){
		if(electronicOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < electronicOffers.size(); i++) {
			System.out.println("Name: " + electronicOffers.get(i).getName());
			System.out.println("User: " + electronicOffers.get(i).getUser().getName());
			System.out.println("Category: Fashion");
			System.out.println("Description: " + electronicOffers.get(i).getDescription());
			System.out.println("Price: " + electronicOffers.get(i).getPrice());
		}
	}
	
	protected void addToList(Offer offer){
			electronicOffers.add(offer);
	}
	
}
