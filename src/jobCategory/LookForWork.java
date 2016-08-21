package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class LookForWork extends Job {
	private static ArrayList<Offer> lookForWorkOffers;
	public static final String NAME = "Looking for work";
	private static LookForWork instance = new LookForWork();

	protected LookForWork() {
		lookForWorkOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		lookForWorkOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		lookForWorkOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return lookForWorkOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public LookForWork getInstance() {
		return instance;
	}
}
