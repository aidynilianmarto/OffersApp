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

	public static void showNightList() {
		if (nightOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < nightOffers.size(); i++) {
			System.out.println("Name: " + nightOffers.get(i).getName());
			System.out.println("User: " + nightOffers.get(i).getUser().getName());
			System.out.println("Category: Nights");
			System.out.println("Description: " + nightOffers.get(i).getDescription());
			System.out.println("Price: " + nightOffers.get(i).getPrice());
		}
	}

	@Override
	public void addOffer(Offer offer) {
		nightOffers.add(offer);
	}

	@Override
	public ArrayList<Offer> getListOfOffers() {
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
