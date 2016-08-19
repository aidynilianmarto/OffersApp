package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Accessory extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Accessory){
			offers.add(offer);
		}
	}
	
	public static class Bag extends Accessory{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Bags";
		
		public Bag(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Bag){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}

	public static class Tie extends Accessory{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Ties";
		
		public Tie(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Tie){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}

	public static class Hat extends Accessory{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Hats";
		
		public Hat(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Hat){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}

	public static class Glasses extends Accessory{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Glasses";
		
		public Glasses(){}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Glasses){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
}
