package Offer;

import java.util.ArrayList;

public abstract class Jewelry extends Fashion{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Jewelry){
			offers.add(offer);
		}
	}
	
	public static class Bracelet extends Jewelry{
		
		private ArrayList<Offer> offers;
		private Bracelet instance = new Bracelet();
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Bracelet){
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
	
	public static class Earing extends Jewelry{
		
		private ArrayList<Offer> offers;
		private Earing instance = new Earing();
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Earing){
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

	public static class Necklace extends Jewelry{
	
		private ArrayList<Offer> offers;
		private Necklace instance = new Necklace();
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Necklace){
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

	public static class Ring extends Jewelry{
		
		private ArrayList<Offer> offers;
		private Ring instance = new Ring();
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Ring){
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
