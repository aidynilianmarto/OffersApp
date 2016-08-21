package animalsCategory;

import java.util.ArrayList;
import Offer.Offer;

public abstract class Cat extends Animal {

	private static ArrayList<Offer> catOffers;

	public Cat() {
		catOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		catOffers.remove(o);
	}

	@Override
	protected void addToList(Offer offer) {
		catOffers.add(offer);
	}

	public static class Homeless extends Cat {

		private static ArrayList<Offer> homelessOffers;
		public static final String NAME = "Homeless";
		static Homeless instance = new Homeless();

		protected Homeless() {
			homelessOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			homelessOffers.add(offer);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return homelessOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Homeless getInstance() {
			return instance;
		}
	}

	public static class HouseCat extends Cat {

		private static ArrayList<Offer> houseCatsOffers;
		public static final String NAME = "House Cats";
		static HouseCat instance = new HouseCat();

		protected HouseCat() {
			houseCatsOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			houseCatsOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			houseCatsOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return houseCatsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static HouseCat getInstance() {
			return instance;
		}

	}

}
