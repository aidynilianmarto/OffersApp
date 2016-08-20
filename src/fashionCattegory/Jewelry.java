package fashionCattegory;

import java.util.ArrayList;

import Offer.ICategory;
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
	
	public static void showAccessoryList(){
		if(jewelryOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < jewelryOffers.size(); i++) {
			System.out.println("Name: " + jewelryOffers.get(i).getName());
			System.out.println("User: " + jewelryOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + jewelryOffers.get(i).getDescription());
			System.out.println("Price: " + jewelryOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer){
		jewelryOffers.add(offer);
		
	}
	
	public static class Bracelet extends Jewelry{
		
		private static ArrayList<Offer> braceletOffers;
		public static final String NAME = "Bracelets";
		Bracelet instance = new Bracelet();
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
		public ArrayList<Offer> getListOfOffers() {
			return braceletOffers;
		}

		public ICategory getInstance() {
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
		static Earing instance = new Earing();
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
		public ArrayList<Offer> getListOfOffers() {
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
		static Necklace instance = new Necklace();
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
		public ArrayList<Offer> getListOfOffers() {
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
		static Ring instance = new Ring();
		
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
		public ArrayList<Offer> getListOfOffers() {
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
