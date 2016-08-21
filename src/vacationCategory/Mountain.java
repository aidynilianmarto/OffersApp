package vacationCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Mountain extends Vacation {
	private static ArrayList<Offer> mountainOffers;
	public static final String NAME = "On mountain";
	private static Mountain instance = new Mountain();

	protected Mountain() {
		mountainOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		mountainOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		mountainOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return mountainOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Mountain getInstance() {
		return instance;
	}
}
