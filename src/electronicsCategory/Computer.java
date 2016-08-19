package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Computer extends Electronics{

	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Computer){
			offers.add(offer);
		}
	}
	
	public static class Laptop extends Computer{
		
		private static ArrayList<Offer> offers;
		
		public Laptop(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Laptop){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class Desktop extends Computer{
		
		private static ArrayList<Offer> offers;
		
		public Desktop(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Laptop){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
}
