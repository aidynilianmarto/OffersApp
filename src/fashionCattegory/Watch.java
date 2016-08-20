package fashionCattegory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Watch extends Fashion{
	
	private static ArrayList<Offer> watchOffers;
	
	public Watch() {
		super();
		watchOffers = new ArrayList<>();
	}
	
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		watchOffers.remove(o);
	}
	
	public static void showAccessoryList(){
		if(watchOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < watchOffers.size(); i++) {
			System.out.println("Name: " + watchOffers.get(i).getName());
			System.out.println("User: " + watchOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + watchOffers.get(i).getDescription());
			System.out.println("Price: " + watchOffers.get(i).getPrice());
		}
	}
	@Override
	protected void addToList(Offer offer){
		watchOffers.add(offer);
	}

	public static class MenWatch extends Watch{
		
		private static ArrayList<Offer> menWatchOffers;
		public static final String NAME = "Man watches";
		static MenWatch instance = new MenWatch();
		
		private MenWatch(){
			super();
			menWatchOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			menWatchOffers.add(offer);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return menWatchOffers;
		}

		public static Watch getInstance() {
			return instance;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}
	
	public static class WomenWatch extends Watch{
		
		private static ArrayList<Offer> womenWatchOffers;
		public static final String NAME = "Women watches";
		static WomenWatch instance = new WomenWatch();
		
		private WomenWatch(){
			super();
			womenWatchOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			womenWatchOffers.add(offer);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return womenWatchOffers;
		}

		public static WomenWatch getInstance() {
			return instance;
		}
		

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
	}
	
}
