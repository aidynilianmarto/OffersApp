package otherCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public class Other implements ICategory{
	
	private static ArrayList<Offer> otherOffers;
	private static final String NAME = "Other offers";
	private static Other instance = new Other();
	
	private Other(){
		otherOffers = new ArrayList<>();
	}

	@Override
	public void addOffer(Offer offer) {
		otherOffers.add(offer);
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	@Override
	public void deleteOffer(Offer o) {
		otherOffers.remove(o);
	}
	
	public static Other getInstance(){
		return instance;
	}
	
	public static ArrayList<Offer> getListOfOffers() {
		return otherOffers;
	}

	
}
