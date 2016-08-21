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
	@Override
	protected void addToList(Offer offer) {
		mateOffers.add(offer);
	}

	public static class HouseMate extends Mate {

		private static ArrayList<Offer> houseMateOffers;
		public static final String NAME = "House mates";
		private static HouseMate instance = new HouseMate();

		protected HouseMate() {
			houseMateOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			houseMateOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			houseMateOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return houseMateOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static HouseMate getInstance() {
			return instance;
		}
	}

	public static class FlatMate extends Mate {

		private static ArrayList<Offer> flatMateOffers;
		public static final String NAME = "Flat mates";
		private static FlatMate instance = new FlatMate();

		protected FlatMate() {
			flatMateOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			flatMateOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			flatMateOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return flatMateOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static FlatMate getInstance() {
			return instance;
		}
	}

}
