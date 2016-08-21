package realStateCategory;

import java.util.ArrayList;

import Offer.Offer;

public class AbroadState extends RealState {
	private static ArrayList<Offer> abroadStateOffers;
	public static final String NAME = "Abroad States";
	static AbroadState instance = new  AbroadState();

	protected  AbroadState() {
		abroadStateOffers = new ArrayList<>();
	}

	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		abroadStateOffers.remove(o);

	}

	@Override
	public void addOffer(Offer offer) {
		abroadStateOffers.add(offer);
	}
	public static ArrayList<Offer> getListOfOffers() {
		return abroadStateOffers;
	}

	@Override
	public String getCategoryName() {
		return NAME;
	}

	public AbroadState getInstance() {
		return instance;
	}
}
