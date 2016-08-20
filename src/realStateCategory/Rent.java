package realStateCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Rent extends RealState {
	private static ArrayList<Offer> rentOffers;

	public Rent() {
		rentOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		rentOffers.remove(o);
	}

	public static void showRentList() {
		if (rentOffers.size() == 0) {
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < rentOffers.size(); i++) {
			System.out.println("Name: " + rentOffers.get(i).getName());
			System.out.println("User: " + rentOffers.get(i).getUser().getName());
			System.out.println("Category: Rents");
			System.out.println("Description: " + rentOffers.get(i).getDescription());
			System.out.println("Price: " + rentOffers.get(i).getPrice());
		}
	}

	@Override
	protected void addToList(Offer offer) {
		rentOffers.add(offer);
	}

	public static class �partment extends Rent {

		private static ArrayList<Offer> apartmentsOffers;
		public static final String NAME = "Apartments";
		private static �partment instance = new �partment();

		protected �partment() {
			apartmentsOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			apartmentsOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			apartmentsOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return apartmentsOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static �partment getInstance() {
			return instance;
		}
	}

	public static class House extends Rent {

		private static ArrayList<Offer> houseOffers;
		public static final String NAME = "Houses";
		private static House instance = new House();

		protected House() {
			houseOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			houseOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			houseOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return houseOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static House getInstance() {
			return instance;
		}
	}

	public static class HouseFloor extends Rent {

		private static ArrayList<Offer> houseFloorOffers;
		public static final String NAME = "House floor";
		private static HouseFloor instance = new HouseFloor();

		protected HouseFloor() {
			houseFloorOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			houseFloorOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			houseFloorOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return houseFloorOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static HouseFloor getInstance() {
			return instance;
		}
	}

	public static class Shop extends Rent {

		private static ArrayList<Offer> shopOffers;
		public static final String NAME = "Shops";
		private static Shop instance = new Shop();

		protected Shop() {
			shopOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			shopOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			shopOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return shopOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Shop getInstance() {
			return instance;
		}
	}

	public static class Hotel extends Rent {

		private static ArrayList<Offer> hotelOffers;
		public static final String NAME = "Hotels";
		private static Hotel instance = new Hotel();

		protected Hotel() {
			hotelOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			hotelOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			hotelOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return hotelOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Hotel getInstance() {
			return instance;
		}
	}

	public static class Restaurant extends Rent {

		private static ArrayList<Offer> restaurantOffers;
		public static final String NAME = "Restaurants";
		private static Restaurant instance = new Restaurant();

		protected Restaurant() {
			restaurantOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			restaurantOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			restaurantOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return restaurantOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Restaurant getInstance() {
			return instance;
		}
	}

	public static class Office extends Rent {

		private static ArrayList<Offer> officeOffers;
		public static final String NAME = "Offices";
		private static Office instance = new Office();

		protected Office() {
			officeOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			officeOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return officeOffers;

		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			officeOffers.remove(o);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Office getInstance() {
			return instance;
		}
	}

	public static class Store extends Rent {

		private static ArrayList<Offer> storeOffers;
		public static final String NAME = "Stores";
		private static Store instance = new Store();

		protected Store() {
			storeOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			storeOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			storeOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return storeOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Store getInstance() {
			return instance;
		}
	}

	public static class IndustrialBuilding extends Rent {

		private static ArrayList<Offer> industrialBuildingOffers;
		public static final String NAME = "Industrial Buildings";
		private static IndustrialBuilding instance = new IndustrialBuilding();

		protected IndustrialBuilding() {
			industrialBuildingOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			industrialBuildingOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return industrialBuildingOffers;

		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			industrialBuildingOffers.remove(o);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static IndustrialBuilding getInstance() {
			return instance;
		}
	}

	public static class Plot extends Rent {

		private static ArrayList<Offer> plotOffers;
		public static final String NAME = "Plots";
		private static Plot instance = new Plot();

		protected Plot() {
			plotOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			plotOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			plotOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return plotOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Plot getInstance() {
			return instance;
		}
	}

	public static class �griculturalLand extends Rent {

		private static ArrayList<Offer> agriculturalLandOffers;
		public static final String NAME = "�gricultural lands";
		private static �griculturalLand instance = new �griculturalLand();

		protected �griculturalLand() {
			agriculturalLandOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			agriculturalLandOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return agriculturalLandOffers;

		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			agriculturalLandOffers.remove(o);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static �griculturalLand getInstance() {
			return instance;
		}
	}

	public static class Garage extends Rent {

		private static ArrayList<Offer> garageOffers;
		public static final String NAME = "Garages";
		private static Garage instance = new Garage();

		protected Garage() {
			garageOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			garageOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			garageOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return garageOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Garage getInstance() {
			return instance;
		}
	}
}
