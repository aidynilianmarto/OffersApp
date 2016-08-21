package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Economy extends Job{
	private static ArrayList<Offer> economyOffers;
	public static final String NAME = "Economy";
	private static Economy instance = new Economy();

	protected Economy() {
		economyOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		economyOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		economyOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return economyOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Economy getInstance() {
		return instance;
	}
}
