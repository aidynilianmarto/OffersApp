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
	
	@Override
	protected void addToList(Offer offer){
		watchOffers.add(offer);
	}

	public static class MenWatch extends Watch{
		
		private static ArrayList<Offer> menWatchOffers;
		public static final String NAME = "Man watches";
		private static MenWatch instance = new MenWatch();
		
		private MenWatch(){
			super();
			menWatchOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			menWatchOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			menWatchOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return menWatchOffers;
		}

		public static MenWatch getInstance() {
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
		private static WomenWatch instance = new WomenWatch();
		
		private WomenWatch(){
			super();
			womenWatchOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			womenWatchOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			womenWatchOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
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
