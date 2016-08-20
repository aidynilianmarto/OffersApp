package autoCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Bus extends Automobile{
	
	private static ArrayList<Offer> busOffers;
	
	Bus(){
		busOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		busOffers.remove(o);
	}
	
	public void showBusList(){
		if(busOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < busOffers.size(); i++) {
			System.out.println("Name: " + busOffers.get(i).getName());
			System.out.println("User: " + busOffers.get(i).getUser().getName());
			System.out.println("Category: Buses");
			System.out.println("Description: " + busOffers.get(i).getDescription());
			System.out.println("Price: " + busOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer) {
		super.addToList(offer);
		busOffers.add(offer);
	}
	
	public static class MicroBus extends Car{
		
		private static ArrayList<Offer> microBusOffers;
		private static final String NAME = "Microbus vehicles";
		private static MicroBus instance = new MicroBus();
		
		private MicroBus(){
			super();
			microBusOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			microBusOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			microBusOffers.remove(o);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return microBusOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static MicroBus getInstance(){
			return instance;
		}
		
	}

}
