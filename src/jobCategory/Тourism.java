package jobCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Òourism extends Job {
	private static ArrayList<Offer> tourismOffers;
	public static final String NAME = "Tourism";
	private static Òourism instance = new Òourism();

	protected Òourism() {
		tourismOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		tourismOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		tourismOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return tourismOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Òourism getInstance() {
		return instance;
	}
}
