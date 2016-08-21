package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Production extends Job {
	private static ArrayList<Offer> productionOffers;
	public static final String NAME = "Production";
	private static Production instance = new Production();

	protected Production() {
		productionOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		productionOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		productionOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return productionOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Production getInstance() {
		return instance;
	}
}
