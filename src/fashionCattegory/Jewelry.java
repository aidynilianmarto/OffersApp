package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Jewelry extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Jewelry){
			offers.add(offer);
		}
	}
	
	public static class Bracelet extends Jewelry{
		
		private static ArrayList<Offer> offers;
		
		public Bracelet(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Bracelet){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
	
	}
	
	public static class Earing extends Jewelry{
		
		private static ArrayList<Offer> offers;
		
		public Earing(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Earing){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
	
	}

	public static class Necklace extends Jewelry{
	
		private static ArrayList<Offer> offers;
		
		public Necklace(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Necklace){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
	
	}

	public static class Ring extends Jewelry{
		
		private static ArrayList<Offer> offers;
		
		private Ring(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Ring){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
	
	}
	
}
