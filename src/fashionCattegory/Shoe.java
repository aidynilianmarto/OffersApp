package fashionCattegory;

import java.util.ArrayList;
import Offer.Offer;

public abstract class Shoe extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Shoe){
			offers.add(offer);
		}
	}
	
	public static class ManShoes extends Shoe{
		
		private static ArrayList<Offer> offers;
		
		public ManShoes(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof ManShoes){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}

	public static class WemenShoes extends Shoe{
		
		private static ArrayList<Offer> offers;
		
		public WemenShoes(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof WemenShoes){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
}
