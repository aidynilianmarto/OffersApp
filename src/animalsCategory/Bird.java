package animalsCategory;

import java.util.ArrayList;
import Offer.Offer;


public abstract class Bird extends Animal {
private static ArrayList<Offer> birdOffers;
	
	public Bird() {
		birdOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		birdOffers.remove(o);
	}
	
	public static void showBirdsList(){
		if(birdOffers.size()==0){
			System.out.println("No offers in this category!");
		}
		for (int i = 0; i < birdOffers.size(); i++) {
			System.out.println("Name: " + birdOffers.get(i).getName());
			System.out.println("User: " + birdOffers.get(i).getUser().getName());
			System.out.println("Category: Dogs");
			System.out.println("Description: " + birdOffers.get(i).getDescription());
			System.out.println("Price: " + birdOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer){
		birdOffers.add(offer);
	}
	
	public static class Parrot extends Bird{
		
		private static ArrayList<Offer> parrotOffers;
		public static final String NAME = "Parrots";
		static Parrot instance = new Parrot();
		protected Parrot(){
			parrotOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			parrotOffers.add(offer);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return parrotOffers;
			
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Parrot getInstance() {
			return instance;
		}
	}
	
	public static class Other extends Bird{
		
		private static ArrayList<Offer> otherOffers;
		public static final String NAME = "Others";
		static Other instance = new Other();
		protected Other(){
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
