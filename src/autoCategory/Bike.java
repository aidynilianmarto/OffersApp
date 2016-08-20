package autoCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Bike extends Automobile{
	
	private static ArrayList<Offer> bikeOffers;
	
	Bike(){
		bikeOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		bikeOffers.remove(o);
	}
	
	public void showBikeList(){
		if(bikeOffers.size()==0){
			System.out.println("No offers in this category!");
		}
		for (int i = 0; i < bikeOffers.size(); i++) {
			System.out.println("Name: " + bikeOffers.get(i).getName());
			System.out.println("User: " + bikeOffers.get(i).getUser().getName());
			System.out.println("Category: Cars");
			System.out.println("Description: " + bikeOffers.get(i).getDescription());
			System.out.println("Price: " + bikeOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer) {
		super.addToList(offer);
		bikeOffers.add(offer);
	}
	
	public static class LowCubage extends Car{
		
		private static ArrayList<Offer> lowCubageOffers;
		private static final String NAME = "Low cubage bikes";
		private LowCubage instance = new LowCubage();
		
		private LowCubage(){
			super();
			lowCubageOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			lowCubageOffers.add(offer);
			
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return lowCubageOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public LowCubage getInstance(){
			return instance;
		}
		
	}
	
	public static class MidCubage extends Car{
		
		private static ArrayList<Offer> midCubageOffers;
		private static final String NAME = "Mid cubage bikes";
		private MidCubage instance = new MidCubage();
		
		private MidCubage(){
			super();
			midCubageOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			midCubageOffers.add(offer);
			
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return midCubageOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public MidCubage getInstance(){
			return instance;
		}
		
	}
	
	public static class HighCubage extends Car{
		
		private static ArrayList<Offer> highCubageOffers;
		private static final String NAME = "High cubage bikes";
		private HighCubage instance = new HighCubage();
		
		private HighCubage(){
			super();
			highCubageOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			highCubageOffers.add(offer);
			
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return highCubageOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public HighCubage getInstance(){
			return instance;
		}
		
	}

}
