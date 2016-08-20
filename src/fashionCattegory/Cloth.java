package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Cloth extends Fashion{
	
	private static ArrayList<Offer> clothOffers;
	
	public Cloth() {
		super();
		clothOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		clothOffers.remove(o);
	}
	
	public static void showAccessoryList(){
		if(clothOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < clothOffers.size(); i++) {
			System.out.println("Name: " + clothOffers.get(i).getName());
			System.out.println("User: " + clothOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + clothOffers.get(i).getDescription());
			System.out.println("Price: " + clothOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer){
		clothOffers.add(offer);
	}
	
	public static class MenCloth extends Cloth{
		
		private  static ArrayList<Offer> menClothOffers;
		public static final String NAME = "Man clothes";
		private static MenCloth instance = new MenCloth();
		
		protected MenCloth(){
			super();
			menClothOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			menClothOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			menClothOffers.remove(o);
		}
	
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return menClothOffers;
		}

		public static MenCloth getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		
	}
	
	public static class WomenCloth extends Cloth{
		
		private static ArrayList<Offer> womenClothOffers;
		public static final String NAME = "Women clothes";
		private static WomenCloth instance = new WomenCloth();
		
		private WomenCloth(){
			super();
			womenClothOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			womenClothOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			womenClothOffers.remove(o);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return womenClothOffers;
		}

		public static WomenCloth getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}

		
	}
	
}


