package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Distribution extends Job {
	private static ArrayList<Offer> distributionOffers;
	public static final String NAME = "Distributions";
	private static Distribution instance = new Distribution();

	protected Distribution() {
		distributionOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		distributionOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		distributionOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return distributionOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Distribution getInstance() {
		return instance;
	}
}
