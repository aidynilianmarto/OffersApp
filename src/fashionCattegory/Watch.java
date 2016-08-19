package fashionCattegory;

import java.util.ArrayList;

import Offer.ICategory;
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
		
		private ArrayList<Offer> offers;
		private ManWatch instance = new ManWatch();
		
		private ManWatch(){}
		
		@Override
		public void addOffer(Offer offer) {
			if(offer.getCategory() instanceof ManWatch){
				offers.add(offer);
			}
		}
		@Override
		public ICategory getInstance() {
			return instance;
		}
		@Override
		public void getListOfOffers() {
			System.out.println(this.offers);
		}
		
	}
	
	public static class WemenWatch extends Watch{
		
		private ArrayList<Offer> offers;
		private WemenWatch instance = new WemenWatch();
		
		private WemenWatch(){}
		
		@Override
		public void addOffer(Offer offer) {
			if(offer.getCategory() instanceof WemenWatch){
				offers.add(offer);
			}
		}
		@Override
		public ICategory getInstance() {
			return instance;
		}
		@Override
		public void getListOfOffers() {
			System.out.println(this.offers);
		}
		
	}
	
}
