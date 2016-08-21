package babyAndChildCategory;

import java.util.ArrayList;

import Offer.*;

public abstract class BabyAndChild implements ICategory{
	
	private static ArrayList<Offer> babyAndChildOffers;
	
	protected BabyAndChild(){
		babyAndChildOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		babyAndChildOffers.remove(o);
	}
	protected void addToList(Offer offer){
		babyAndChildOffers.add(offer);
	}
	
	
	public static class Cloth extends BabyAndChild{
		
		private static ArrayList<Offer> clothOffers;
		private static final String NAME = "Baby and children clothes.";
		private static Cloth instance = new Cloth();
		
		private Cloth(){
			clothOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			clothOffers.add(offer);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			clothOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return clothOffers;
		}
		
		public static Cloth getInstance() {
			return instance;
		}
		
	}

	public static class Shoe extends BabyAndChild{
		
		private static ArrayList<Offer> shoeOffers;
		private static final String NAME = "Baby and children shoes.";
		private static Shoe instance = new Shoe();
		
		private Shoe(){
			shoeOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			shoeOffers.add(offer);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			shoeOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return shoeOffers;
		}
		
		public static Shoe getInstance() {
			return instance;
		}
		
	}

	public static class Stroll extends BabyAndChild{
		
		private static ArrayList<Offer> strollOffers;
		private static final String NAME = "Baby and children strolls.";
		private static Stroll instance = new Stroll();
		
		private Stroll(){
			strollOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			strollOffers.add(offer);
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			strollOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return strollOffers;
		}
		
		public static Stroll getInstance() {
			return instance;
		}
		
	}
	
	public static class Toy extends BabyAndChild{
		
		private static ArrayList<Offer> toyOffers;
		private static final String NAME = "Baby and children toys.";
		private static Toy instance = new Toy();
		
		private Toy(){
			toyOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			toyOffers.add(offer);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			toyOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return toyOffers;
		}
		
		public static Toy getInstance() {
			return instance;
		}
		
	}
	
	public static class Furniture extends BabyAndChild{
		
		private static ArrayList<Offer> furnitureOffers;
		private static final String NAME = "Baby and children beds and furniture.";
		private static Furniture instance = new Furniture();
		
		private Furniture(){
			furnitureOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			furnitureOffers.add(offer);
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			furnitureOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return furnitureOffers;
		}
		
		public static Furniture getInstance() {
			return instance;
		}
		
	}

	public static class BCAccessory extends BabyAndChild{
		
		private static ArrayList<Offer> bcAccessoryOffers;
		private static final String NAME = "Baby and children accessories.";
		private static BCAccessory instance = new BCAccessory();
		
		private BCAccessory(){
			bcAccessoryOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			bcAccessoryOffers.add(offer);
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			bcAccessoryOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return bcAccessoryOffers;
		}
		
		public static BCAccessory getInstance() {
			return instance;
		}
		
	}
	
	public static class Other extends BabyAndChild{
		
		private static ArrayList<Offer> otherOffers;
		private static final String NAME = "Other baby and children offers.";
		private static Other instance = new Other();
		
		private Other(){
			otherOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			otherOffers.add(offer);
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			otherOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return otherOffers;
		}
		
		public static Other getInstance() {
			return instance;
		}
		
	}

}
