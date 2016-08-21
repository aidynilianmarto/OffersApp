package vacationCategory;

import java.util.ArrayList;

import Offer.Offer;

public class ForeignCountry extends Vacation {
	private static ArrayList<Offer> foreignCountryOffers;
	public static final String NAME = "In foreign country";
	private static ForeignCountry instance = new ForeignCountry();

	protected ForeignCountry() {
		foreignCountryOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		foreignCountryOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		foreignCountryOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return foreignCountryOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public ForeignCountry getInstance() {
		return instance;
	}
}
