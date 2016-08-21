package vacationCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Sea extends Vacation {
	private static ArrayList<Offer> seaOffers;
	public static final String NAME = "On sea";
	private static Sea instance = new Sea();

	protected Sea() {
		seaOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		seaOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		seaOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return seaOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Sea getInstance() {
		return instance;
	}
}
