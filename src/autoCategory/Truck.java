package autoCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Truck extends Automobile{
	
	private static ArrayList<Offer> truckOffers;
	
	Truck(){
		truckOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		truckOffers.remove(o);
	}
	
	@Override
	protected void addToList(Offer offer) {
		super.addToList(offer);
		truckOffers.add(offer);
	}
	
	public static class SelfUnloading extends Car{
		
		private static ArrayList<Offer> selfUnloadingOffers;
		private static final String NAME = "Selfunloading trucks";
		private static SelfUnloading instance = new SelfUnloading();
		
		private SelfUnloading(){
			super();
			selfUnloadingOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			selfUnloadingOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			selfUnloadingOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return selfUnloadingOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static SelfUnloading getInstance(){
			return instance;
		}
		
	}
	
	public static class HeavyLoad extends Car{
		
		private static ArrayList<Offer> heavyLoadOffers;
		private static final String NAME = "Heavy load trucks";
		private static HeavyLoad instance = new HeavyLoad();
		
		private HeavyLoad(){
			super();
			heavyLoadOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			heavyLoadOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			heavyLoadOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return heavyLoadOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static HeavyLoad getInstance(){
			return instance;
		}
		
	}

}
