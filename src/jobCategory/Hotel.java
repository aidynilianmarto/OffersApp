package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Hotel extends Job {
	private static ArrayList<Offer> hotelOffers;
	public static final String NAME = "Hotels";
	private static Hotel instance = new Hotel();

	protected Hotel() {
		hotelOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		hotelOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		hotelOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return hotelOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Hotel getInstance() {
		return instance;
	}
}
