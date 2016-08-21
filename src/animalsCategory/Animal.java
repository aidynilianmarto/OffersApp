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
		protected void addToList(Offer offer){
			animalOffers.add(offer);
	}
		

}
