package sportsAndHobyCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Entertainment implements ICategory{
	
private static ArrayList<Offer> entertainmentOffers;
	
	protected Entertainment(){
		entertainmentOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		entertainmentOffers.remove(o);
	}
	protected void addToList(Offer offer){
		entertainmentOffers.add(offer);
	}
	
	public static class Movie extends Entertainment{
		
		private static ArrayList<Offer> movieOffers;
		private static final String NAME = "Movies";
		private static Movie instance = new Movie();
		
		private Movie(){
			movieOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			movieOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			movieOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return movieOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Movie getInstance() {
			return instance;
		}
	}
	

	public static class Music extends Entertainment{
		
		private static ArrayList<Offer> musicOffers;
		private static final String NAME = "Music";
		private static Music instance = new Music();
		
		private Music(){
			musicOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			musicOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			musicOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return musicOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Music getInstance() {
			return instance;
		}
	}
	

	public static class Instruments extends Entertainment{
		
		private static ArrayList<Offer> instrumentsOffers;
		private static final String NAME = "Music instruments";
		private static Instruments instance = new Instruments();
		
		private Instruments(){
			instrumentsOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			instrumentsOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			instrumentsOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return instrumentsOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Instruments getInstance() {
			return instance;
		}
	}
	

	public static class Ticket extends Entertainment{
		
		private static ArrayList<Offer> ticketOffers;
		private static final String NAME = "Tickets";
		private static Ticket instance = new Ticket();
		
		private Ticket(){
			ticketOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			ticketOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			ticketOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return ticketOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Ticket getInstance() {
			return instance;
		}
	}
	

	public static class Other extends Entertainment{
		
		private static ArrayList<Offer> otherOffers;
		private static final String NAME = "Other offers";
		private static Other instance = new Other();
		
		private Other(){
			otherOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			otherOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			otherOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return otherOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Other getInstance() {
			return instance;
		}
	}
	
}
