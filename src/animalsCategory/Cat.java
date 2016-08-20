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

	public static void showcCatsList() {
		if (catOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < catOffers.size(); i++) {
			System.out.println("Name: " + catOffers.get(i).getName());
			System.out.println("User: " + catOffers.get(i).getUser().getName());
			System.out.println("Category: Cats");
			System.out.println("Description: " + catOffers.get(i).getDescription());
			System.out.println("Price: " + catOffers.get(i).getPrice());
		}
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

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return homelessOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public Homeless getInstance() {
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
		public ArrayList<Offer> getListOfOffers() {
			return houseCatsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public HouseCat getInstance() {
			return instance;
		}

	}

}
