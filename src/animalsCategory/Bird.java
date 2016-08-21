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
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			parrotOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return parrotOffers;
			
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Parrot getInstance() {
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
}
