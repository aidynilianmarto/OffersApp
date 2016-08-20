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

	public static void showRealStateOffer() {
		if (realStateOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < realStateOffers.size(); i++) {
			System.out.println("Name: " + realStateOffers.get(i).getName());
			System.out.println("User: " + realStateOffers.get(i).getUser().getName());
			System.out.println("Category: Real state");
			System.out.println("Description: " + realStateOffers.get(i).getDescription());
			System.out.println("Price: " + realStateOffers.get(i).getPrice());
		}
	}

	protected void addToList(Offer offer) {
		realStateOffers.add(offer);
	}
}
