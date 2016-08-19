package electronicsCategory;

import java.util.ArrayList;


import Offer.ICategory;
import Offer.Offer;

public abstract class Electronics implements ICategory{

private ArrayList<Offer> offers;
	
	protected Electronics(){
		offers = new ArrayList<Offer>();
	}
	
	protected void addToList(Offer offer){
		if(offer.getCategory() instanceof Electronics){
			offers.add(offer);
		}
	
	}
	
}
