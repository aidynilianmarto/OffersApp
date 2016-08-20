package electronicsCategory;

import java.util.ArrayList;
import Offer.Offer;

public abstract class Computer extends Electronics{

	private static ArrayList<Offer> computerOffers;
	
	public Computer() {
		super();
		computerOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		computerOffers.remove(o);
	}
	
	public static void showAccessoryList(){
		if(computerOffers.size()==0){
			System.out.println("No offers in this category!");
		}
		for (int i = 0; i < computerOffers.size(); i++) {
			System.out.println("Name: " + computerOffers.get(i).getName());
			System.out.println("User: " + computerOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + computerOffers.get(i).getDescription());
			System.out.println("Price: " + computerOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer){
		computerOffers.add(offer);
	}
	
	public static class Laptop extends Computer{
		
		private static ArrayList<Offer> laptopOffers;
		public static final String NAME = "Laptop";
		Laptop instance = new Laptop();
		public Laptop(){
			super();
			laptopOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			laptopOffers.add(offer);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return laptopOffers;
			
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Laptop getInstance() {
			return instance;
		}
	}
	
	public static class Desktop extends Computer{
		
		private static ArrayList<Offer> desktopOffers;
		public static final String NAME = "Desktop";
		Desktop instance = new Desktop();
		public Desktop(){
			super();
			desktopOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			desktopOffers.add(offer);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return desktopOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Desktop getInstance() {
			return instance;
		}
	}
	
}
