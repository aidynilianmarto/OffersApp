package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class 휽onomy extends Job{
	private static ArrayList<Offer> economyOffers;
	public static final String NAME = "Economy";
	private static 휽onomy instance = new 휽onomy();

	protected 휽onomy() {
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

	public 휽onomy getInstance() {
		return instance;
	}
}
