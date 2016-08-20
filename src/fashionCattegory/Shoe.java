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
	
	public static void showAccessoryList(){
		if(shoeOffers.size()==0){
			System.out.println("No offers in this category!");
		}
		for (int i = 0; i < shoeOffers.size(); i++) {
			System.out.println("Name: " + shoeOffers.get(i).getName());
			System.out.println("User: " + shoeOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + shoeOffers.get(i).getDescription());
			System.out.println("Price: " + shoeOffers.get(i).getPrice());
		}
	}
	@Override
	protected void addToList(Offer offer){
		shoeOffers.add(offer);
		
	}
	
	public static class MenShoes extends Shoe{
		
		public static ArrayList<Offer> menShoesOffers;
		public static final String NAME = "Men shoes";
		static MenShoes instance = new MenShoes();
		
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
		public ArrayList<Offer> getListOfOffers() {
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
		static WomenShoes instance = new WomenShoes();
		
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
		public ArrayList<Offer> getListOfOffers() {
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
