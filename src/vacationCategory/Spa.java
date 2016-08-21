package vacationCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Spa extends Vacation {
	private static ArrayList<Offer> spaOffers;
	public static final String NAME = "Spa";
	private static Spa instance = new Spa();

	protected Spa() {
		spaOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		spaOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		spaOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return spaOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Spa getInstance() {
		return instance;
	}
}
