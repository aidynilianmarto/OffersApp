package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class �rade extends Job {
	private static ArrayList<Offer> tradeOffers;
	public static final String NAME = "Trade";
	private static �rade instance = new �rade();

	protected �rade() {
		tradeOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		tradeOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		tradeOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return tradeOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public �rade getInstance() {
		return instance;
	}
}
