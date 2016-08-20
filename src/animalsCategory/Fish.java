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

	public static void showFishesList() {
		if (fishOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < fishOffers.size(); i++) {
			System.out.println("Name: " + fishOffers.get(i).getName());
			System.out.println("User: " + fishOffers.get(i).getUser().getName());
			System.out.println("Category: Fishes");
			System.out.println("Description: " + fishOffers.get(i).getDescription());
			System.out.println("Price: " + fishOffers.get(i).getPrice());
		}
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

		@Override
		public ArrayList<Offer> getListOfOffers() {
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

		@Override
		public ArrayList<Offer> getListOfOffers() {
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
