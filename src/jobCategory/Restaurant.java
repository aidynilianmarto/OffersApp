package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Restaurant extends Job {
	private static ArrayList<Offer> restaurantOffers;
	public static final String NAME = "Restaurants";
	private static Restaurant instance = new Restaurant();

	protected Restaurant() {
		restaurantOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		restaurantOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		restaurantOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return restaurantOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Restaurant getInstance() {
		return instance;
	}
}
