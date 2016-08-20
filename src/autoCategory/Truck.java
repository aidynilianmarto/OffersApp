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
	
	public void showTruckList(){
		if(truckOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < truckOffers.size(); i++) {
			System.out.println("Name: " + truckOffers.get(i).getName());
			System.out.println("User: " + truckOffers.get(i).getUser().getName());
			System.out.println("Category: Buses");
			System.out.println("Description: " + truckOffers.get(i).getDescription());
			System.out.println("Price: " + truckOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer) {
		super.addToList(offer);
		truckOffers.add(offer);
	}
	
	public static class SelfUnloading extends Car{
		
		private static ArrayList<Offer> selfUnloadingOffers;
		private static final String NAME = "Selfunloading trucks";
		private SelfUnloading instance = new SelfUnloading();
		
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
		public ArrayList<Offer> getListOfOffers() {
			return selfUnloadingOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public SelfUnloading getInstance(){
			return instance;
		}
		
	}
	
	public static class HeavyLoad extends Car{
		
		private static ArrayList<Offer> heavyLoadOffers;
		private static final String NAME = "Heavy load trucks";
		private HeavyLoad instance = new HeavyLoad();
		
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
		public ArrayList<Offer> getListOfOffers() {
			return heavyLoadOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public HeavyLoad getInstance(){
			return instance;
		}
		
	}

}
