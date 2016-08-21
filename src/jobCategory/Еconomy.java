package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class �conomy extends Job{
	private static ArrayList<Offer> economyOffers;
	public static final String NAME = "Economy";
	private static �conomy instance = new �conomy();

	protected �conomy() {
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

	public �conomy getInstance() {
		return instance;
	}
}
