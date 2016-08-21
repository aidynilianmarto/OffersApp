package sportsAndHobyCategory;

import java.util.ArrayList;

import Offer.ICategory;
import Offer.Offer;

public abstract class Stationery implements ICategory{
	
	private static ArrayList<Offer> stationeryOffers;
	
	protected Stationery(){
		stationeryOffers = new ArrayList<Offer>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		stationeryOffers.remove(o);
	}
	protected void addToList(Offer offer){
		stationeryOffers.add(offer);
	}
	
	public static class ChildernBook extends Stationery{
		
		private static ArrayList<Offer> childrenBookOffers;
		private static final String NAME = "Children books";
		private static ChildernBook instance = new ChildernBook();
		
		private ChildernBook(){
			childrenBookOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			childrenBookOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			childrenBookOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return childrenBookOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static ChildernBook getInstance() {
			return instance;
		}
	}
	
	public static class Book extends Stationery{
		
		private static ArrayList<Offer> bookOffers;
		private static final String NAME = "Bicycle offers";
		private static Book instance = new Book();
		
		private Book(){
			bookOffers = new ArrayList<>();
		}


		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			bookOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			bookOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return bookOffers;
		}

		@Override
		public String getCategoryName() {
			return NAME;
		}

		public static Book getInstance() {
			return instance;
		}
	}

	public static class StudyBook extends Stationery{
		
		private static ArrayList<Offer> studyBookOffers;
		private static final String NAME = "Study books";
		private static StudyBook instance = new StudyBook();
		
		private StudyBook(){
			studyBookOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			studyBookOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			studyBookOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return studyBookOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static StudyBook getInstance() {
			return instance;
		}
	}
	
	public static class Dictionaries extends Stationery{
		
		private static ArrayList<Offer> dictionariesOffers;
		private static final String NAME = "Dictionaries";
		private static Dictionaries instance = new Dictionaries();
		
		private Dictionaries(){
			dictionariesOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			dictionariesOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			dictionariesOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return dictionariesOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static Dictionaries getInstance() {
			return instance;
		}
	}
	
	public static class Encyclopedia extends Stationery{
		
		private static ArrayList<Offer> encyclopediaOffers;
		private static final String NAME = "Encyclopedia offers";
		private static Encyclopedia instance = new Encyclopedia();
		
		private Encyclopedia(){
			encyclopediaOffers = new ArrayList<>();
		}
	
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			encyclopediaOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			encyclopediaOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return encyclopediaOffers;
		}
	
		@Override
		public String getCategoryName() {
			return NAME;
		}
	
		public static Encyclopedia getInstance() {
			return instance;
		}
	}
	
	public static class Other extends Stationery{
		
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
