package realStateCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Sale extends RealState {
	private static ArrayList<Offer> saleOffers;

	public Sale() {
		saleOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		saleOffers.remove(o);
	}
	@Override
	protected void addToList(Offer offer) {
		saleOffers.add(offer);
	}

	public static class Apartment extends Sale {

		private static ArrayList<Offer> apartmentsOffers;
		public static final String NAME = "Apartments";
		private static Apartment instance = new Apartment();

		protected Apartment() {
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

		public static ArrayList<Offer> getListOfOffers() {
			return apartmentsOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Apartment getInstance() {
			return instance;
		}
	}

	public static class House extends Sale {

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

		public static ArrayList<Offer> getListOfOffers() {
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

	public static class HouseFloor extends Sale {

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

		public static ArrayList<Offer> getListOfOffers() {
			return houseFloorOffers;

		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			houseFloorOffers.remove(o);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static HouseFloor getInstance() {
			return instance;
		}
	}

	public static class Shop extends Sale {

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

		public static ArrayList<Offer> getListOfOffers() {
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

	public static class Hotel extends Sale {

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

		public static ArrayList<Offer> getListOfOffers() {
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

	public static class Restaurant extends Sale {

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

		public static ArrayList<Offer> getListOfOffers() {
			return restaurantOffers;

		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			restaurantOffers.remove(o);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Restaurant getInstance() {
			return instance;
		}
	}

	public static class Office extends Sale {

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
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			officeOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return officeOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Office getInstance() {
			return instance;
		}
	}

	public static class Store extends Sale {

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
		public static ArrayList<Offer> getListOfOffers() {
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

	public static class IndustrialBuilding extends Sale {

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
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			industrialBuildingOffers.remove(o);
		}
		public static ArrayList<Offer> getListOfOffers() {
			return industrialBuildingOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static IndustrialBuilding getInstance() {
			return instance;
		}
	}

	public static class Plot extends Sale {

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
		
		public static ArrayList<Offer> getListOfOffers() {
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

	public static class AgriculturalLand extends Sale {

		private static ArrayList<Offer> agriculturalLandOffers;
		public static final String NAME = "Agricultural lands";
		private static AgriculturalLand instance = new AgriculturalLand();

		protected AgriculturalLand() {
			agriculturalLandOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			agriculturalLandOffers.add(offer);
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			agriculturalLandOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return agriculturalLandOffers;

		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static AgriculturalLand getInstance() {
			return instance;
		}
	}

	public static class Garage extends Sale {

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

		public static ArrayList<Offer> getListOfOffers() {
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
