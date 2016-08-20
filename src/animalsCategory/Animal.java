package animalsCategory;
import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;
public abstract class Animal implements ICategory {

	private static ArrayList<Offer> animalOffers;
		
		protected Animal(){
			animalOffers = new ArrayList<Offer>();
		}
		
		@Override
		public void deleteOffer(Offer o) {
			animalOffers.remove(o);
		}
		public static void showAnimalOffer(){
			if(animalOffers.size()==0){
				System.out.println("No offers in this category!");
			}
			for (int i = 0; i < animalOffers.size(); i++) {
				System.out.println("Name: " + animalOffers.get(i).getName());
				System.out.println("User: " + animalOffers.get(i).getUser().getName());
				System.out.println("Category: Animals");
				System.out.println("Description: " + animalOffers.get(i).getDescription());
				System.out.println("Price: " + animalOffers.get(i).getPrice());
			}
		}
		protected void addToList(Offer offer){
			animalOffers.add(offer);
	}
		

}
