package realStateCategory;

import java.util.ArrayList;

import Offer.Offer;

public class AbroadState extends RealState {
	private static ArrayList<Offer> abroadStateOffers;
	public static final String NAME = "Abroad States";
	static AbroadState instance = new  AbroadState();

	protected  AbroadState() {
		abroadStateOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		abroadStateOffers.remove(o);

	}

	public static void showAbroadStateList() {
		if (abroadStateOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < abroadStateOffers.size(); i++) {
			System.out.println("Name: " + abroadStateOffers.get(i).getName());
			System.out.println("User: " + abroadStateOffers.get(i).getUser().getName());
			System.out.println("Category: Abroad states");
			System.out.println("Description: " + abroadStateOffers.get(i).getDescription());
			System.out.println("Price: " + abroadStateOffers.get(i).getPrice());
		}
	}

	@Override
	public void addOffer(Offer offer) {
		abroadStateOffers.add(offer);
	}

	@Override
	public ArrayList<Offer> getListOfOffers() {
		return abroadStateOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public AbroadState getInstance() {
		return instance;
	}
}
