package vacationCategory;

import java.util.ArrayList;

import Offer.Offer;

public class Village extends Vacation {
	private static ArrayList<Offer> villageOffers;
	public static final String NAME = "On village";
	private static Village instance = new Village();

	protected Village() {
		villageOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		villageOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		villageOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return villageOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Village getInstance() {
		return instance;
	}
}
