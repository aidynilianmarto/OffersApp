package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Accessory extends Fashion{
	
	private static ArrayList<Offer> accessoryOffers;
	
	public Accessory() {
		super();
		accessoryOffers = new ArrayList<>();
	}
	
	public static ArrayList<Offer> getAccessoryOffers() {
		return accessoryOffers;
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		accessoryOffers.remove(o);
	}
	
	public static void showAccessoryList(){
		if(accessoryOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
	}
	
	@Override
	protected void addToList(Offer offer){
		super.addToList(offer);
		accessoryOffers.add(offer);
	}
	
	public static class Bag extends Accessory{
		
		private static ArrayList<Offer> bagOffers;
		public static final String NAME = "Bags";
		private static Bag instance = new Bag();
		protected Bag(){
			super();
			bagOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			bagOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			bagOffers.remove(o);
		}


		public static Bag getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static ArrayList<Offer> getBagOffers() {
			return bagOffers;
		}
		
	}

	public static class Tie extends Accessory{
		
		private static ArrayList<Offer> tieOffers;
		public static final String NAME = "Ties";
		private static Tie instance = new Tie();
		protected Tie(){
			super();
			tieOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			tieOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			tieOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return tieOffers;
		}
		
		public static Tie getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}

	public static class Hat extends Accessory{
		
		private static ArrayList<Offer> hatOffers;
		public static final String NAME = "Hats";
		private static Hat instance = new Hat();
		private Hat(){
			super();
			hatOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			hatOffers.add(offer);
			
		}

		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			hatOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return hatOffers;
		}
		
		public static Hat getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}

	public static class Glasses extends Accessory{
		
		private static ArrayList<Offer> glassesOffers;
		public static final String NAME = "Glasses";
		private static Glasses instance = new Glasses();
		private Glasses(){
			super();
			glassesOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			glassesOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			glassesOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return glassesOffers;
		}
		
		public static Glasses getInstance() {
			return instance;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		
	}
}
