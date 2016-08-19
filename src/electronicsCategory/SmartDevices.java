package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class SmartDevices extends Electronics{

	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Computer){
			offers.add(offer);
		}
	}
	
	public static class Phone extends SmartDevices{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Phones";
		
		public Phone(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Phone){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class Tablet extends SmartDevices{
			
		private static ArrayList<Offer> offers;
		public static final String name = "Tablets";
			
		public Tablet(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Tablet){
					offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}
	
	public static class Reader extends SmartDevices{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Readers";
		
		public Reader(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Reader){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class TV extends SmartDevices{
			
		private static ArrayList<Offer> offers;
		public static final String name = "TVs";
		
		public TV(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof TV){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}
	
	public static class Camera extends SmartDevices{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Cameras";
		
		public Camera(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Camera){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}
	
	public static class Navigation extends SmartDevices{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Navigation";
		
		public Navigation(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Navigation){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}
}	
