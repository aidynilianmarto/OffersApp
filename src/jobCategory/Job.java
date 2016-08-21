package jobCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Job implements ICategory {
	private static ArrayList<Offer> jobOffers;

	protected Job() {
		jobOffers = new ArrayList<Offer>();
	}

	@Override
	public void deleteOffer(Offer o) {
		jobOffers.remove(o);
	}

	protected void addToList(Offer offer) {
		jobOffers.add(offer);
	}

}
