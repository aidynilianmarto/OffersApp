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
	
	protected void addToList(Offer offer){
		fashionOffers.add(offer);

	}
	
	public static ArrayList<Offer> getFashionOffers() {
		return fashionOffers;
	}

}
