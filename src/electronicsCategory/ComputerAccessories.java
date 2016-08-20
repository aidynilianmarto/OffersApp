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
	
	public static void showAccessoryList(){
		if(computerAccessoriesOffers.size()==0){
			System.out.println("No offers in this category!");
		}
		for (int i = 0; i < computerAccessoriesOffers.size(); i++) {
			System.out.println("Name: " + computerAccessoriesOffers.get(i).getName());
			System.out.println("User: " + computerAccessoriesOffers.get(i).getUser().getName());
			System.out.println("Category: Accessorry");
			System.out.println("Description: " + computerAccessoriesOffers.get(i).getDescription());
			System.out.println("Price: " + computerAccessoriesOffers.get(i).getPrice());
		}
	}
	@Override
	protected void addToList(Offer offer){
		computerAccessoriesOffers.add(offer);
	}
	
	public static class Cable extends ComputerAccessories{
		
		private static ArrayList<Offer> cableOffers;
		public static final String NAME = "Cables";
		Cable instance = new Cable();
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
		public ArrayList<Offer> getListOfOffers() {
			return cableOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Cable getInstance() {
			return instance;
		}
		
		
		
	}
	
	public static class Mouse extends ComputerAccessories{
			
			private static ArrayList<Offer> mouseOffers;
			public static final String NAME = "Mouse";
			Mouse instance = new Mouse();
			
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
			public ArrayList<Offer> getListOfOffers() {
				return mouseOffers;
			}
			
			@Override
			public String getCategoryName() {
				return NAME;
			}
			
			public Mouse getInstance() {
				return instance;
			}
		}
	
	public static class Keyboard extends ComputerAccessories{
		
		private static ArrayList<Offer> keyboardOffers;
		public static final String NAME = "Keyboards";
		Keyboard instance = new Keyboard();
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
		public ArrayList<Offer> getListOfOffers() {
			return keyboardOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Keyboard getInstance() {
			return instance;
		}
	}
	
	
	public static class Other extends ComputerAccessories{
		
		private static ArrayList<Offer> otherOffers;
		public static final String NAME = "Other";
		Other instance = new Other();
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
		public ArrayList<Offer> getListOfOffers() {
			return otherOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Other getInstance() {
			return instance;
		}
	}
	
	public static class Camera extends ComputerAccessories{
		
		private static ArrayList<Offer> cameraOffers;
		public static final String NAME = "Cameras";
		Camera instance = new Camera();
		public Camera(){
			super();
			cameraOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			cameraOffers.add(offer);
		}
	
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return cameraOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Camera getInstance() {
			return instance;
		}
		
	}

}
