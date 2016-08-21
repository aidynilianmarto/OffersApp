package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Other extends Job {
	private static ArrayList<Offer> otherOffers;
	public static final String NAME = "Others";
	private static Other instance = new Other();

	protected Other() {
		otherOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		otherOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		otherOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return otherOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Other getInstance() {
		return instance;
	}
}
