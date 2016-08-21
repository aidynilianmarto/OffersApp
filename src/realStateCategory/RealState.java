package realStateCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class RealState implements ICategory {
	private static ArrayList<Offer> realStateOffers;

	protected RealState() {
		realStateOffers = new ArrayList<Offer>();
	}

	@Override
	public void deleteOffer(Offer o) {
		realStateOffers.remove(o);
	}

	protected void addToList(Offer offer) {
		realStateOffers.add(offer);
	}
}
