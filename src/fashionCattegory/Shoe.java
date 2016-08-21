package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Shoe extends Fashion{
	
	private static ArrayList<Offer> shoeOffers;
	
	public Shoe() {
		super();
		shoeOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		shoeOffers.remove(o);
	}
	
	@Override
	protected void addToList(Offer offer){
		shoeOffers.add(offer);
		
	}
	
	public static class MenShoes extends Shoe{
		
		public static ArrayList<Offer> menShoesOffers;
		public static final String NAME = "Men shoes";
		private static MenShoes instance = new MenShoes();
		
		private MenShoes(){
			super();
			menShoesOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			menShoesOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			menShoesOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return menShoesOffers;
		}

		public static MenShoes getInstance() {
			return instance;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}

	public static class WomenShoes extends Shoe{
		
		private static ArrayList<Offer> womenShoesOffers;
		public static final String NAME = "Women shoes";
		private static WomenShoes instance = new WomenShoes();
		
		private WomenShoes(){
			super();
			womenShoesOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			womenShoesOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			womenShoesOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return womenShoesOffers;
		}

		public static WomenShoes getInstance() {
			return instance;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}
}
