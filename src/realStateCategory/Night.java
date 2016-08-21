package realStateCategory;

import java.util.ArrayList;
import Offer.Offer;

public class Night extends RealState {
	private static ArrayList<Offer> nightOffers;
	public static final String NAME = "Nights";
	static Night instance = new Night();

	protected Night() {
		nightOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		nightOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		nightOffers.add(offer);
	}

	public static ArrayList<Offer> getListOfOffers() {
		return nightOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public Night getInstance() {
		return instance;
	}

}
