package autoCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class Car extends Automobile{
	
	private static ArrayList<Offer> carOffers;
	
	Car(){
		carOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		carOffers.remove(o);
	}
	
	@Override
	protected void addToList(Offer offer) {
		super.addToList(offer);
		carOffers.add(offer);
	}
	
	public static class Hatchback extends Car{
		
		private static ArrayList<Offer> hatchbackOffers;
		private static final String NAME = "Hatchback cars";
		private static Hatchback instance = new Hatchback();
		
		private Hatchback(){
			super();
			hatchbackOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			hatchbackOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			hatchbackOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return hatchbackOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Hatchback getInstance(){
			return instance;
		}
		
	}
	
	public static class Sedan extends Car{
		
		private static ArrayList<Offer> sedanOffers;
		private static final String NAME = "Sedan cars";
		private static Sedan instance = new Sedan();
		
		private Sedan(){
			super();
			sedanOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			sedanOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			sedanOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return sedanOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Sedan getInstance(){
			return instance;
		}
		
	}
	
	public static class Combi extends Car{
		
		private static ArrayList<Offer> combiOffers;
		private static final String NAME = "Combi cars";
		private static Combi instance = new Combi();
		
		private Combi(){
			super();
			combiOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			combiOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			combiOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return carOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Combi getInstance(){
			return instance;
		}
		
	}
	
	public static class SUV extends Car{
		
		private static ArrayList<Offer> sUVOffers;
		private static final String NAME = "SUV cars";
		private static SUV instance = new SUV();
		
		private SUV(){
			super();
			sUVOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			sUVOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			sUVOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return sUVOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static SUV getInstance(){
			return instance;
		}
		
	}
	
	public static class Cabrio extends Car{
		
		private static ArrayList<Offer> cabrioOffers;
		private static final String NAME = "Cabrio cars";
		private static Cabrio instance = new Cabrio();
		
		private Cabrio(){
			super();
			cabrioOffers = new ArrayList<Offer>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			cabrioOffers.add(offer);
			
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			cabrioOffers.remove(o);
		}

		public static  ArrayList<Offer> getListOfOffers() {
			return cabrioOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Cabrio getInstance(){
			return instance;
		}
		
	}
}


