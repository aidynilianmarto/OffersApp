package fashionCattegory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Fashion implements ICategory{
	
	private static ArrayList<Offer> fashionOffers;
	
	protected Fashion(){
		fashionOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		fashionOffers.remove(o);
	}
	public static void showFashionOffer(){
		if(fashionOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < fashionOffers.size(); i++) {
			System.out.println("Name: " + fashionOffers.get(i).getName());
			System.out.println("User: " + fashionOffers.get(i).getUser().getName());
			System.out.println("Category: Fashion");
			System.out.println("Description: " + fashionOffers.get(i).getDescription());
			System.out.println("Price: " + fashionOffers.get(i).getPrice());
		}
	}
	
	protected void addToList(Offer offer){
		fashionOffers.add(offer);

	}

}
