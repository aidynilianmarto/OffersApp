package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Accessory extends Fashion{
	
	private static ArrayList<Offer> accessoryOffers;
	
	public Accessory() {
		super();
		accessoryOffers = new ArrayList<>();
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
		for (int i = 0; i < accessoryOffers.size(); i++) {
			System.out.println("Name: " + accessoryOffers.get(i).getName());
			System.out.println("User: " + accessoryOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + accessoryOffers.get(i).getDescription());
			System.out.println("Price: " + accessoryOffers.get(i).getPrice());
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
		static Bag instance = new Bag();
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
		public ArrayList<Offer> getListOfOffers() {
			return bagOffers;
		}

		public static Bag getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}

	public static class Tie extends Accessory{
		
		private static ArrayList<Offer> tieOffers;
		public static final String NAME = "Ties";
		static Tie instance = new Tie();
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
		public ArrayList<Offer> getListOfOffers() {
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
		static Hat instance = new Hat();
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
		public ArrayList<Offer> getListOfOffers() {
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
		static Glasses instance = new Glasses();
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
		public ArrayList<Offer> getListOfOffers() {
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
