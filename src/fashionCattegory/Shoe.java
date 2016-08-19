package fashionCattegory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Shoe extends Fashion{
	
	private ArrayList<Offer> offers;
	
	public Shoe() {
		super();
	}
	@Override
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Shoe){
			offers.add(offer);
		}
	}
	
	public static class ManShoes extends Shoe{
		private ArrayList<Offer> offers;
		private static ManShoes instance = new ManShoes();
		public ManShoes(){
			super.name = getClass().getSimpleName();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof ManShoes){
				offers.add(offer);
			}
		}

		
		public static ICategory getInstance() {
			return instance;
		}

		@Override
		public void getListOfOffers() {
			System.out.println(this.offers);
		}

		@Override
		public String getName() {
			return name;
		}
		
	}

	public static class WomenShoes extends Shoe{
		private ArrayList<Offer> offers;
		private static WomenShoes instance = new WomenShoes();
		private WomenShoes(){
			super.name = getClass().getName();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			if(offer.getCategory() instanceof WomenShoes){
				offers.add(offer);
			}
		}

		public static ICategory getInstance() {
			return instance;
		}

		@Override
		public void getListOfOffers() {
			System.out.println(this.offers);
		}

		@Override
		public String getName() {
			return name;
		}
		
	}
}
