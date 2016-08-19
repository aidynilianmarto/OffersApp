package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class ComputerAccessories extends Electronics{
	
	private ArrayList<Offer> offers;
	
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Computer){
			offers.add(offer);
		}
	}
	
	public static class Cable extends ComputerAccessories{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Cables";

		public Cable(){}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Cable){
				offers.add(offer);
			}
		}

		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class Mouse extends ComputerAccessories{
			
			private static ArrayList<Offer> offers;
			public static final String NAME = "Mice";
			
			public Mouse(){}
	
			@Override
			public void addOffer(Offer offer) {
				super.addToList(offer);
				if(offer.getCategory() instanceof Mouse){
					offers.add(offer);
				}
			}
	
			@Override
			public void getListOfOffers() {
				System.out.println(offers);
			}
			
		}
	
	public static class Keyboard extends ComputerAccessories{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Keyboards";
	
		public Keyboard(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Keyboard){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	
	public static class Other extends ComputerAccessories{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Other";
		
		public Other(){}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof Other){
				offers.add(offer);
			}
		}
	
		@Override
		public void getListOfOffers() {
			System.out.println(offers);
		}
		
	}
	
	public static class Camera extends ComputerAccessories{
		
		private static ArrayList<Offer> offers;
		public static final String NAME = "Cameras";
	
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

}
