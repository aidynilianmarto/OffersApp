package otherCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public class Gift implements ICategory{
	
	private static ArrayList<Offer> giftOffers;
	private static final String NAME = "Gift offers";
	private static Gift instance = new Gift();
	
	private Gift(){
		giftOffers = new ArrayList<>();
	}

	@Override
	public void addOffer(Offer offer) {
		giftOffers.add(offer);
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	@Override
	public void deleteOffer(Offer o) {
		giftOffers.remove(o);
	}
	
	public static Gift getInstance(){
		return instance;
	}
	
	public static ArrayList<Offer> getListOfOffers() {
		return giftOffers;
	}

}
