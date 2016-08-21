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
	protected void addToList(Offer offer){
		autoOffers.add(offer);
	}
	
	public static class CarAccessories extends Automobile{
		
		private static ArrayList<Offer> accessoriesOffers;
		private static final String NAME = "Car accessories";
		private static CarAccessories instance = new CarAccessories();
		
		private CarAccessories(){
			accessoriesOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			accessoriesOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			accessoriesOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return accessoriesOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static CarAccessories getInstance(){
			return instance;
		}

	}
	
	public static class CarPart extends Automobile{
		
		private static ArrayList<Offer> carPartsOffers;
		private static final String NAME = "Car parts";
		private static CarPart instance = new CarPart();
		
		private CarPart(){
			carPartsOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			carPartsOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			carPartsOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return carPartsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static CarPart getInstance(){
			return instance;
		}

	}
}
