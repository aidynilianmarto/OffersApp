package sportsAndHobyCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Sport implements ICategory{
	
	private static ArrayList<Offer> sportOffers;
	
	protected Sport(){
		sportOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		sportOffers.remove(o);
	}
	protected void addToList(Offer offer){
		sportOffers.add(offer);
	}
	
	
	public static class Bicycle extends Sport{
		
		private static ArrayList<Offer> bicycleOffers;
		private static final String NAME = "Bicycle offers";
		private static Bicycle instance = new Bicycle();
		
		private Bicycle(){
			bicycleOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			bicycleOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			bicycleOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return bicycleOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Bicycle getInstance() {
			return instance;
		}
	}
	
	public static class Football extends Sport{
			
			private static ArrayList<Offer> footbalOffers;
			private static final String NAME = "Football offers";
			private static Football instance = new Football();
			
			private Football(){
				footbalOffers = new ArrayList<>();
			}
	
	
			@Override
			public void addOffer(Offer offer) {
				super.addToList(offer);
				footbalOffers.add(offer);
			}
			
			@Override
			public void deleteOffer(Offer o) {
				super.deleteOffer(o);
				footbalOffers.remove(o);
			}
	
			public static ArrayList<Offer> getListOfOffers() {
				return footbalOffers;
			}
	
			@Override
			public String getCategoryName() {
				return NAME;
			}
	
			public static Football getInstance() {
				return instance;
			}
		}

	public static class Winter extends Sport{
		
		private static ArrayList<Offer> winterOffers;
		private static final String NAME = "Winter offers";
		private static Winter instance = new Winter();
		
		private Winter(){
			winterOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			winterOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			winterOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return winterOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static Winter getInstance() {
			return instance;
		}
	}
	
	public static class Tennis extends Sport{
		
		private static ArrayList<Offer> tennisOffers;
		private static final String NAME = "Tennis offers";
		private static Tennis instance = new Tennis();
		
		private Tennis(){
			tennisOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			tennisOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			tennisOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return tennisOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static Tennis getInstance() {
			return instance;
		}
	}
	
	public static class Other extends Sport{
		
		private static ArrayList<Offer> otherOffers;
		private static final String NAME = "Other sport offers";
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
	
	public static class Fishing extends Sport{
		
		private static ArrayList<Offer> fishingOffers;
		private static final String NAME = "Fishing offers";
		private static Fishing instance = new Fishing();
		
		private Fishing(){
			fishingOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			fishingOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			fishingOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return fishingOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static Fishing getInstance() {
			return instance;
		}
	}
	
	public static class Camping extends Sport{
		
		private static ArrayList<Offer> campingOffers;
		private static final String NAME = "Camping offers";
		private static Camping instance = new Camping();
		
		private Camping(){
			campingOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			campingOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			campingOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return campingOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static Camping getInstance() {
			return instance;
		}
	}

}
