package autoCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Automobile implements ICategory{
	
	private static ArrayList<Offer> autoOffers;
	
	protected Automobile(){
		autoOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		autoOffers.remove(o);
	}
	public static void showAutoOffer(){
		if(autoOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < autoOffers.size(); i++) {
			System.out.println("Name: " + autoOffers.get(i).getName());
			System.out.println("User: " + autoOffers.get(i).getUser().getName());
			System.out.println("Category: Automobiles");
			System.out.println("Description: " + autoOffers.get(i).getDescription());
			System.out.println("Price: " + autoOffers.get(i).getPrice());
		}
	}
	protected void addToList(Offer offer){
		autoOffers.add(offer);
	}
	
	public static class CarAccessories extends Automobile{
		
		private static ArrayList<Offer> accessoriesOffers;
		private static final String NAME = "Car accessories";
		private CarAccessories instance = new CarAccessories();
		
		private CarAccessories(){
			accessoriesOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			accessoriesOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return accessoriesOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public CarAccessories getInstance(){
			return instance;
		}

	}
	
	public static class CarPart extends Automobile{
		
		private static ArrayList<Offer> carPartsOffers;
		private static final String NAME = "Car parts";
		private CarPart instance = new CarPart();
		
		private CarPart(){
			carPartsOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			carPartsOffers.add(offer);
		}

		@Override
		public ArrayList<Offer> getListOfOffers() {
			return carPartsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public CarPart getInstance(){
			return instance;
		}

	}
}
