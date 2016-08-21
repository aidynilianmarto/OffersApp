package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Jewelry extends Fashion{
	
	private static ArrayList<Offer> jewelryOffers;
	
	public Jewelry() {
		super();
		jewelryOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		jewelryOffers.remove(o);
	}
	
	@Override
	protected void addToList(Offer offer){
		jewelryOffers.add(offer);
		
	}
	
	public static class Bracelet extends Jewelry{
		
		private static ArrayList<Offer> braceletOffers;
		public static final String NAME = "Bracelets";
		private static Bracelet instance = new Bracelet();
		private Bracelet(){
			super();
			braceletOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			braceletOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			braceletOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return braceletOffers;
		}

		public static Bracelet getInstance() {
			return instance;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
	}
	
	public static class Earing extends Jewelry{
		
		private static ArrayList<Offer> earingOffers;
		public static final String NAME = "Earings";
		private static Earing instance = new Earing();
		private Earing(){
			super();
			earingOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			earingOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			earingOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return earingOffers;
		}
		public static Earing getInstance() {
			return instance;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
	}

	public static class Necklace extends Jewelry{
	
		private static ArrayList<Offer> necklaceOffers;
		public static final String NAME = "Necklaces";
		private static Necklace instance = new Necklace();
		private Necklace(){
			super();
			necklaceOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			necklaceOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			necklaceOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return necklaceOffers;
		}

		public static Necklace getInstance() {
			return instance;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
	}

	public static class Ring extends Jewelry{
		
		private static ArrayList<Offer> ringOffers;
		public static final String NAME = "Rings";
		private static Ring instance = new Ring();
		
		private Ring(){
			super();
			ringOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			ringOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			ringOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return ringOffers;
		}

		public static Ring getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
	
	}
	
}
