package animalsCategory;

import java.util.ArrayList;
import Offer.Offer;

public abstract class AnimalAccessories extends Animal {
	private static ArrayList<Offer> animalAccessoriesOffers;

	public AnimalAccessories() {
		animalAccessoriesOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		animalAccessoriesOffers.remove(o);
	}

	public static void showAccessoryList() {
		if (animalAccessoriesOffers.size() == 0) {
			System.out.println("No offers in this category!");
		}
		for (int i = 0; i < animalAccessoriesOffers.size(); i++) {
			System.out.println("Name: " + animalAccessoriesOffers.get(i).getName());
			System.out.println("User: " + animalAccessoriesOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + animalAccessoriesOffers.get(i).getDescription());
			System.out.println("Price: " + animalAccessoriesOffers.get(i).getPrice());
		}
	}

	@Override
	protected void addToList(Offer offer) {
		animalAccessoriesOffers.add(offer);
	}

	public static class Strap extends AnimalAccessories {

		private static ArrayList<Offer> strapOffers;
		public static final String NAME = "Straps";
		static Strap instance = new Strap();

		protected Strap() {
			strapOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			strapOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return strapOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public Strap getInstance() {
			return instance;
		}

	}

	public static class Toy extends AnimalAccessories {

		private static ArrayList<Offer> toysOffers;
		public static final String NAME = "Toys";
		static Toy instance = new Toy();

		protected Toy() {
			toysOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			toysOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return toysOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public Toy getInstance() {
			return instance;
		}
	}

	public static class Containment extends AnimalAccessories {

		private static ArrayList<Offer> containmentsOffers;
		public static final String NAME = "Containments";
		static Containment instance = new Containment();

		protected Containment() {
			containmentsOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			containmentsOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return containmentsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public Containment getInstance() {
			return instance;
		}
	}
	public static class Food extends AnimalAccessories {

		private static ArrayList<Offer> foodsOffers;
		public static final String NAME = "Foods";
		static Food instance = new Food();

		protected Food() {
			foodsOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			foodsOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return foodsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public Food getInstance() {
			return instance;
		}
	}

	public static class Other extends AnimalAccessories {

		private static ArrayList<Offer> otherOffers;
		public static final String NAME = "Other";
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
		public ArrayList<Offer> getListOfOffers() {
			return otherOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public Other getInstance() {
			return instance;
		}

	}

}
