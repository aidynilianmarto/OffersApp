package Offer;

import java.util.ArrayList;

public abstract class Cloth extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		offers.add(offer);
	}
	
	

	public static class ManCloth extends Cloth{
		
		private ArrayList<Offer> offers;
		private ManCloth instance = new ManCloth();

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof ManCloth){
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
	
	public static class WemenCloth extends Cloth{
		
		private ArrayList<Offer> offers;
		private WemenCloth instance = new WemenCloth();

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof WemenCloth){
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


