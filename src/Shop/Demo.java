package Shop;

import Offer.ICategory;
import Offer.Offer;
import User.User;
import fashionCattegory.*;
import fashionCattegory.Shoe.ManShoes;
import fashionCattegory.Shoe.WomenShoes;
public class Demo {
	public static void main(String[] args) {
		System.out.println("Show users and offers:");
		Shop.showUsersAndOffers();
		System.out.println("--------");
		System.out.println("Registration:");
		User pesho = User.registration("Petur", "pesho", "123456789", "petur@gmail.com");
		User gosho = User.registration("Georgi", "goshko", "123456789", "goshko@gmail.com");
		System.out.println("--------");
		System.out.println("Pesho list");
		pesho.showMyOffer();
		System.out.println("--------");
		System.out.println("Gosho list");
		gosho.showMyOffer();
		gosho.logIn("goshko", "123456789");
		System.out.println("Show messages:");
		pesho.showReceivedMessages();
		pesho.showSendMessages();
		System.out.println("--------");
		System.out.println("Change some filds:");
		pesho.setAddress("Lulin 5 , Sofia");
		pesho.setPhoneNumber("0885496823");
		System.out.println("--------");
		System.out.println("Show Users:");
		Shop.showUsers();
		System.out.println("--------");
		System.out.println("Log In:");
		pesho.logIn("pesho", "123456789");
		System.out.println("--------");
		System.out.println("Show users and offers:");
		Shop.showUsersAndOffers();
		System.out.println("--------");
		System.out.println("Show messages:");
		pesho.showReceivedMessages();
		pesho.showSendMessages();
		System.out.println("--------");
		System.out.println("gosho send msg to pesho:");
		gosho.sendMsg(pesho, "Oferta", "Bih iskal da....");
		System.out.println("Pesho list");
		pesho.showReceivedMessages();
		pesho.showSendMessages();
		System.out.println("--------");
		System.out.println("Gosho list");
		gosho.showReceivedMessages();
		gosho.showSendMessages();
		System.out.println("--------");
		System.out.println("Pesho list");
		pesho.showMyOffer();
		System.out.println("--------");
		System.out.println("Gosho list");
		gosho.showMyOffer();
		ICategory menShoes = ManShoes.getInstance();
		ICategory womenShoes = WomenShoes.getInstance();
		Offer o1 = new Offer("Phone", 200, "13.07.2017", "Много Запазен!", "София");
		pesho.addOffer(o1, menShoes);
		pesho.showMyOffer();
//		Offer o2 = new Offer("TV", 1000, "15.04.2018", "FullHD", "Пловдив", new Shoe.ManShoes() {
//		});
//		Offer o3 = new Offer("FlashMemory", 21, "25.08.2016", "16GB Free Space", "Търново", new ICategory() {
//		});
//		Offer o4 = new Offer("CD", 15, "14.03.2017", "Комплект 20 броя", "Лом", new ICategory() {
//		});
//		Offer o5 = new Offer("Printer", 140, "29.09.2016", "Brother DCP145C", "Червен Бряг", new ICategory() {
//		});
//		Offer o6 = new Offer("Computer", 340, "22.12.2016", "Модел Compaq, 500GB Hard Disk", "Смолян", new ICategory() {
//		});
//		
//		Shop.showAllOfers();
//		pesho.addOffer(o1, new ICategory() {
//		});
//		pesho.addOffer(o2, new ICategory() {
//		});
//		pesho.addOffer(o3, new ICategory() {
//		});
//		gosho.addOffer(o4, new ICategory() {
//		});
//		gosho.addOffer(o5, new ICategory() {
//		});
//		gosho.addOffer(o6, new ICategory() {
//		});
//		pesho.logOut();
//		gosho.logOut();
//		System.out.println("**********");
//		System.out.println("Pesho's offers");
//		pesho.showMyOffer();
//		System.out.println("Gosho's offers");
//		gosho.showMyOffer();
//		System.out.println("**********");
//		Shop.showAllOfers();
//		System.out.println("**********");
//		Shop.showUsers();
//		System.out.println("**********");
//		Shop.showUsersAndOffers();
//		System.out.println("**********");
//		System.out.println("Adding To favourite!");
//		pesho.addToFavourite(o1);
//		pesho.addToFavourite(o4);
//		gosho.addToFavourite(o5);
//		gosho.addToFavourite(o2);
//		System.out.println("**********");
//		System.out.println("Pesho's favourites");
//		pesho.showMyFavouriteOffer();
//		System.out.println("**********");
//		System.out.println("Gosho's favourites");
//		gosho.showMyFavouriteOffer();
//		System.out.println("**********");
//		System.out.println("Show archived offers");
//		pesho.archiveOffer(o2);
//		pesho.archiveOffer(o5);
//		gosho.archiveOffer(o6);
//		gosho.archiveOffer(o1);
//		System.out.println("**********");
//		System.out.println("Pesho's archived offers");
//		pesho.showArchivedOffer();
//		System.out.println("**********");
//		System.out.println("Gosho's archived offers");
//		gosho.showArchivedOffer();
//		pesho.deleteOffer(o1);
//		pesho.deleteOffer(o2);
//		pesho.showMyOffer();
//		pesho.showMyFavouriteOffer();
//		pesho.showMyOffer();
//		pesho.showArchivedOffer();
		
	}
}
