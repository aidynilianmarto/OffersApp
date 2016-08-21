package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Appliances extends Electronics{
	
	private static ArrayList<Offer> applianceOffers;
	
	public Appliances() {
		super();
		applianceOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		applianceOffers.remove(o);
	}
	@Override
	protected void addToList(Offer offer){
		applianceOffers.add(offer);
	}
	
public static class Stove extends Appliances{
		
		private static ArrayList<Offer> stoveOffers;
		public static final String NAME = "Stoves";
		private static Stove instance = new Stove();
		public Stove(){
			super();
			stoveOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			stoveOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			stoveOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return stoveOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Stove getInstance() {
			return instance;
		}
		
	}
	
	public static class Refrigirator extends Appliances{
			
		private static ArrayList<Offer> refrigiratorOffers;
		public static final String NAME = "Refrigirators";
		private static Refrigirator instance = new Refrigirator();
		public Refrigirator(){
			super();
			refrigiratorOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			refrigiratorOffers.add(offer);

		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			refrigiratorOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return refrigiratorOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Refrigirator getInstance() {
			return instance;
		}
			
	}
	
	public static class Washer extends Appliances{
		
		private static ArrayList<Offer> washerOffers;
		public static final String NAME = "Washers";
		private static Washer instance = new Washer();
		public Washer(){
			super();
			washerOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			washerOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			washerOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return washerOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Washer getInstance() {
			return instance;
		}
		
	}
	
	public static class DishWasher extends Appliances{
			
		private static ArrayList<Offer> dishWasherOffers;
		public static final String NAME = "Dish washers";
		private static DishWasher instance = new DishWasher();
		public DishWasher(){
			super();
			dishWasherOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			dishWasherOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			dishWasherOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return dishWasherOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static DishWasher getInstance() {
			return instance;
		}
			
	}
	
	public static class AirConditioner extends Appliances{
		
		private static ArrayList<Offer> airConditionerOffers;
		public static final String NAME = "Air conditioners";
		private static AirConditioner instance = new AirConditioner();
		public AirConditioner(){
			super();
			airConditionerOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			airConditionerOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			airConditionerOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return airConditionerOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static AirConditioner getInstance() {
			return instance;
		}
			
	}


}
