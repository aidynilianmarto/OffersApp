package animalsCategory;

import java.util.ArrayList;
import Offer.Offer;

public abstract class Dog extends Animal {

private static ArrayList<Offer> dogOffers;
	
	public Dog() {
		dogOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		dogOffers.remove(o);
	}
	
	public static void showDogsList(){
		if(dogOffers.size()==0){
			System.out.println("No offers in this category!");
			return;
		}
		for (int i = 0; i < dogOffers.size(); i++) {
			System.out.println("Name: " + dogOffers.get(i).getName());
			System.out.println("User: " + dogOffers.get(i).getUser().getName());
			System.out.println("Category: Dogs");
			System.out.println("Description: " + dogOffers.get(i).getDescription());
			System.out.println("Price: " + dogOffers.get(i).getPrice());
		}
	}
	
	@Override
	protected void addToList(Offer offer){
		dogOffers.add(offer);
	}
	
	public static class Homeless extends Dog{
		
		private static ArrayList<Offer> homelessOffers;
		public static final String NAME = "Homeless";
		static Homeless instance = new Homeless();
		protected Homeless(){
			homelessOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			homelessOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			homelessOffers.remove(o);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return homelessOffers;
			
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public Homeless getInstance() {
			return instance;
		}
	}
	
	public static class HouseDog extends Dog{
		
		private static ArrayList<Offer> houseDogsOffers;
		public static final String NAME = "House Dogs";
		static HouseDog instance = new HouseDog();
		protected HouseDog(){
			houseDogsOffers = new ArrayList<>();
		}
		
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			houseDogsOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			houseDogsOffers.remove(o);
		}
		
		@Override
		public ArrayList<Offer> getListOfOffers() {
			return houseDogsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public HouseDog getInstance() {
			return instance;
		}
	}
	
}
