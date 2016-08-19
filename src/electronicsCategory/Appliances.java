package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Appliances extends Electronics{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Appliances){
			offers.add(offer);
		}
	}
	
public static class Stove extends Appliances{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Stoves";
		
		public Stove(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Stove){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class Refrigirator extends Appliances{
			
		private static ArrayList<Offer> offers;
		public static final String name = "Refrigirators";
			
		public Refrigirator(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Refrigirator){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}
	
	public static class Washer extends Appliances{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Washers";
		
		public Washer(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Washer){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class DishWasher extends Appliances{
			
		private static ArrayList<Offer> offers;
		public static final String name = "Dish washers";
			
		public DishWasher(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof DishWasher){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}
	
	public static class AirConditioner extends Appliances{
		
		private static ArrayList<Offer> offers;
		public static final String name = "Air conditioners";
			
		public AirConditioner(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof AirConditioner){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
			
	}


}
