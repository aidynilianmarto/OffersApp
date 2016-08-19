package fashionCattegory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Fashion implements ICategory{
	
	private ArrayList<Offer> offers;
	
	protected Fashion(){
		offers = new ArrayList<Offer>();
	}
	
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Fashion){
			offers.add(offer);
		}
	
	}

}
