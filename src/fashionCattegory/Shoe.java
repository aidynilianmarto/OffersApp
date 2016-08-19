package fashionCattegory;

import java.util.ArrayList;

import Offer.ICategory;
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
		
		private ArrayList<Offer> offers;
		private ManShoes instance = new ManShoes();
		
		private ManShoes(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof ManShoes){
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

	public static class WemenShoes extends Shoe{
		
		private ArrayList<Offer> offers;
		private WemenShoes instance = new WemenShoes();
		
		private WemenShoes(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof WemenShoes){
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
