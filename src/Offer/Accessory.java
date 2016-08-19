package Offer;

import java.util.ArrayList;

public abstract class Accessory extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Accessory){
			offers.add(offer);
		}
	}
	
	public static class Bag extends Accessory{
		
		private ArrayList<Offer> offers;
		private Bag instance = new Bag();

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Bag){
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

	public static class Tie extends Accessory{
		
		private ArrayList<Offer> offers;
		private Tie instance = new Tie();

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Tie){
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

	public static class Hat extends Accessory{
		
		private ArrayList<Offer> offers;
		private Hat instance = new Hat();
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Hat){
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

	public static class Glasses extends Accessory{
		
		private ArrayList<Offer> offers;
		private Glasses instance = new Glasses();
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Glasses){
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
