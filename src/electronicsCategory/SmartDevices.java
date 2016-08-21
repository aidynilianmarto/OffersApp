package electronicsCategory;

import java.util.ArrayList;

import Offer.Offer;

public abstract class SmartDevices extends Electronics{

	private static ArrayList<Offer> smartDevicesOffers;
	public SmartDevices() {
		super();
		smartDevicesOffers = new ArrayList<>();
	}
	
	@Override
	public void deleteOffer(Offer o) {
		super.deleteOffer(o);
		smartDevicesOffers.remove(o);
	}
	@Override
	protected void addToList(Offer offer){
		smartDevicesOffers.add(offer);
	}
	
	public static class Phone extends SmartDevices{
		
		private static ArrayList<Offer> phoneOffers;
		public static final String NAME = "Phones";
		private static Phone instance = new Phone();
		public Phone(){
			super();
			phoneOffers = new ArrayList<>();
		}

		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			phoneOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			phoneOffers.remove(o);
		}

		public static ArrayList<Offer> getListOfOffers() {
			return phoneOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Phone getInstance() {
			return instance;
		}
		
	}
	
	public static class Tablet extends SmartDevices{
			
		private static ArrayList<Offer> tabletOffers;
		public static final String NAME = "Tablets";
		private static Tablet instance = new Tablet();
		public Tablet(){
			super();
			tabletOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			tabletOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			tabletOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return tabletOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Tablet getInstance() {
			return instance;
		}
			
	}
	
	public static class Reader extends SmartDevices{
		
		private static ArrayList<Offer> readerOffers;
		public static final String NAME = "Readers";
		private static Reader instance = new Reader();
		public Reader(){
			super();
			readerOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			readerOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			readerOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return readerOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Reader getInstance() {
			return instance;
		}
		
	}
	
	public static class TV extends SmartDevices{
			
		private static ArrayList<Offer> tvOffers;
		public static final String NAME = "TVs";
		private static TV instance = new TV();
		public TV(){
			super();
			tvOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			tvOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			tvOffers.remove(o);
		}
		
		public static ArrayList<Offer> getListOfOffers() {
			return tvOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static TV getInstance() {
			return instance;
		}
			
	}
	
	public static class Camera extends SmartDevices{
		
		private static ArrayList<Offer> cameraOffers;
		public static final String NAME = "Cameras";
		private static Camera instance = new Camera();
		public Camera(){
			super();
			cameraOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			cameraOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			cameraOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return cameraOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Camera getInstance() {
			return instance;
		}
			
	}
	
	public static class Navigation extends SmartDevices{
		
		private static ArrayList<Offer> navigationOffers;
		public static final String NAME = "Navigation";
		private static Navigation instance = new Navigation();
		public Navigation(){
			super();
			navigationOffers = new ArrayList<>();
		}
	
		@Override
		public void addOffer(Offer offer) {
			super.addToList(offer);
			navigationOffers.add(offer);
		}
		
		@Override
		public void deleteOffer(Offer o) {
			super.deleteOffer(o);
			navigationOffers.remove(o);
		}
	
		public static ArrayList<Offer> getListOfOffers() {
			return navigationOffers;
		}
		
		@Override
		public String getCategoryName() {
			return NAME;
		}
		
		public static Navigation getInstance() {
			return instance;
		}
			
	}
}	
