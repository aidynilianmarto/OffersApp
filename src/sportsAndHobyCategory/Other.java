package sportsAndHobyCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public class Other implements ICategory{
	
	private static ArrayList<Offer> otherOffers;
	private static final String NAME = "Others";
	private static Other instance = new Other();
	
	protected Other(){
		otherOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		otherOffers.remove(o);
	}

	@Override
	public void addOffer(Offer offer) {
		otherOffers.add(offer);
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}
	
	public static Other getInstance(){
		return instance;
	}

}
