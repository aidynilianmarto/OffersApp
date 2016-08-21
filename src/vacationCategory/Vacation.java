package vacationCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Vacation implements ICategory {
	private static ArrayList<Offer> vacationOffers;

	protected Vacation() {
		vacationOffers = new ArrayList<Offer>();
	}

	@Override
	public void deleteOffer(Offer o) {
		vacationOffers.remove(o);
	}

	protected void addToList(Offer offer) {
		vacationOffers.add(offer);
	}
}
