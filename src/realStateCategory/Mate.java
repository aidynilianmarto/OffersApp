package realStateCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Mate extends RealState {
	private static ArrayList<Offer> mateOffers;

	public Mate() {
		mateOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		mateOffers.remove(o);
	}

	public static void showRentList() {
		if (mateOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < mateOffers.size(); i++) {
			System.out.println("Name: " + mateOffers.get(i).getName());
			System.out.println("User: " + mateOffers.get(i).getUser().getName());
			System.out.println("Category: Mates");
			System.out.println("Description: " + mateOffers.get(i).getDescription());
			System.out.println("Price: " + mateOffers.get(i).getPrice());
		}
	}

	@Override
	protected void addToList(Offer offer) {
		mateOffers.add(offer);
	}

	public static class HouseMate extends Mate {

		private static ArrayList<Offer> houseMateOffers;
		public static final String NAME = "House mates";
		static HouseMate instance = new HouseMate();

		protected HouseMate() {
			houseMateOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			houseMateOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return houseMateOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public HouseMate getInstance() {
			return instance;
		}
	}

	public static class FlatMate extends Mate {

		private static ArrayList<Offer> flatMateOffers;
		public static final String NAME = "Flat mates";
		static FlatMate instance = new FlatMate();

		protected FlatMate() {
			flatMateOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			flatMateOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return flatMateOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public FlatMate getInstance() {
			return instance;
		}
	}

}
