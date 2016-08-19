package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Cloth extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Cloth){
			offers.add(offer);
		}
	}
	
	

	public static class ManCloth extends Cloth{
		
		private  static ArrayList<Offer> offers;
		
		public ManCloth(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof ManCloth){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
		
	}
	
	public static class WemenCloth extends Cloth{
		
		private static ArrayList<Offer> offers;
		
		public WemenCloth(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof WemenCloth){
				offers.add(offer);
			}
	
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}

		
	}
	
}


