package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class IT extends Job {
	private static ArrayList<Offer> itOffers;
	public static final String NAME = "Information technologies";
	private static IT instance = new IT();

	protected IT() {
		itOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		itOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		itOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return itOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public IT getInstance() {
		return instance;
	}
}
