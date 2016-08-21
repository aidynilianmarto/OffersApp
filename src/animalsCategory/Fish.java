package animalsCategory;

import java.util.ArrayList;
import Offer.Offer;

public abstract class Fish extends Animal {
	private static ArrayList<Offer> fishOffers;

	public Fish() {
		fishOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		fishOffers.remove(o);
	}

	@Override
	protected void addToList(Offer offer) {
		fishOffers.add(offer);
	}

	public static class AquariumFish extends Dog {

		private static ArrayList<Offer> aquariumOffers;
		public static final String NAME = "Aquarium fishes";
		static AquariumFish instance = new AquariumFish();

		protected AquariumFish() {
			aquariumOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			aquariumOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			aquariumOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return aquariumOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static AquariumFish getInstance() {
			return instance;
		}
	}

	public static class Other extends Fish {

		private static ArrayList<Offer> otherOffers;
		public static final String NAME = "Others";
		static Other instance = new Other();

		protected Other() {
			otherOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			otherOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			otherOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return otherOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Other getInstance() {
			return instance;
		}
	}
}
