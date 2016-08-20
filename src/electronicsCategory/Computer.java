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
			return;
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
		private static Laptop instance = new Laptop();
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
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			laptopOffers.remove(o);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return laptopOffers;
			
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Laptop getInstance() {
			return instance;
		}
	}
	
	public static class Desktop extends Computer{
		
		private static ArrayList<Offer> desktopOffers;
		public static final String NAME = "Desktop";
		private static Desktop instance = new Desktop();
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
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			desktopOffers.remove(o);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return desktopOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Desktop getInstance() {
			return instance;
		}
	}
	
}
