package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class ComputerAccessories extends Electronics{
	
	private static ArrayList<Offer> computerAccessoriesOffers;
	
	public ComputerAccessories() {
		super();
		computerAccessoriesOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		computerAccessoriesOffers.remove(o);
	}

	@Override
	protected void addToList(Offer offer){
		computerAccessoriesOffers.add(offer);
	}
	
	public static class Cable extends ComputerAccessories{
		
		private static ArrayList<Offer> cableOffers;
		public static final String NAME = "Cables";
		private static Cable instance = new Cable();
		public Cable(){
			super();
			cableOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			cableOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			cableOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return cableOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Cable getInstance() {
			return instance;
		}
		
		
		
	}
	
	public static class Mouse extends ComputerAccessories{
			
			private static ArrayList<Offer> mouseOffers;
			public static final String NAME = "Mouse";
			private static Mouse instance = new Mouse();
			
			public Mouse(){
				super();
				mouseOffers = new ArrayList<>();
			}
	
			@Override
			public void addOffer(Offer offer) {
				super.addToList(offer);
				mouseOffers.add(offer);
			}
			
			@Override
			public void deleteOffer(Offer o) {
				super.deleteOffer(o);
				mouseOffers.remove(o);
			}
			
			public static ArrayList<Offer> getListOfOffers() {
				return mouseOffers;
			}
			
			@Override
			public String getCategoryName() {
				return NAME;
			}
			
			public static Mouse getInstance() {
				return instance;
			}
		}
	
	public static class Keyboard extends ComputerAccessories{
		
		private static ArrayList<Offer> keyboardOffers;
		public static final String NAME = "Keyboards";
		private static Keyboard instance = new Keyboard();
		public Keyboard(){
			super();
			keyboardOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			keyboardOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			keyboardOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return keyboardOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Keyboard getInstance() {
			return instance;
		}
	}
	
	
	public static class Other extends ComputerAccessories{
		
		private static ArrayList<Offer> otherOffers;
		public static final String NAME = "Other";
		private static Other instance = new Other();
		public Other(){
			super();
			otherOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			otherOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			otherOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return otherOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Other getInstance() {
			return instance;
		}
	}

}
