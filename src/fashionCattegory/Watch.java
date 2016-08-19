package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Watch extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Watch){
			offers.add(offer);
		}
	}

	public static class ManWatch extends Watch{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Man watches";

		
		public ManWatch(){}
		
		@Override
		public void addOffer(Offer offer) {
			if(offer.getCategory() instanceof ManWatch){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class WemenWatch extends Watch{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Wemen watches";

		
		public WemenWatch(){}
		
		@Override
		public void addOffer(Offer offer) {
			if(offer.getCategory() instanceof WemenWatch){
				offers.add(offer);
			}
		}
		
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
}
