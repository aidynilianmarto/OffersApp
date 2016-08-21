package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Trade extends Job {
	private static ArrayList<Offer> tradeOffers;
	public static final String NAME = "Trade";
	private static Trade instance = new Trade();

	protected Trade() {
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

	public Trade getInstance() {
		return instance;
	}
}
