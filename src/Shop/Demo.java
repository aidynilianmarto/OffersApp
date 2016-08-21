package Shop;

import fashionCattegory.Accessory;
import fashionCattegory.Accessory.Bag;
import fashionCattegory.Accessory.Glasses;
import fashionCattegory.Accessory.Hat;
import fashionCattegory.Accessory.Tie;
import fashionCattegory.Fashion;
import Offer.ICategory;
import Offer.Offer;
import User.User;
import User.Admin;

public class Demo {
	public static void main(String[] args) {
		User pesho = User.registration("Petur", "pesho", "123456789", "petur_ivanov@gmail.bg");
		User gosho = User.registration("Georgi", "goshko", "123456789", "goshko@gmail.com");
		Admin admin = Admin.getInstance();
		//Shop.users.add(admin);
		//Shop.showUsers();
		//admin.logIn("admin", "123456789");
		//admin.removeUser(pesho);
		//Shop.showUsers();
		
		Fashion bagAccessory = Bag.getInstance();
		Fashion tieAccessory = Tie.getInstance();
		Fashion hatAccessory = Hat.getInstance();
		Fashion glassAccessory = Glasses.getInstance();
		Offer o1 = new Offer("Phone", 200,"Много Запазен!", "София");
		Offer o2 = new Offer("TV", 1000 , "FullHD", "Пловдив");
		Offer o3 = new Offer("FlashMemory", 21,"16GB Free Space", "Търново");
		Offer o4 = new Offer("CD", 15,"Комплект 20 броя", "Лом");
		Offer o5 = new Offer("Buffer", 70,"5.1", "Варна");
		pesho.logIn("pesho", "123456789");
		pesho.addOffer(o2, glassAccessory);
		gosho.logIn("goshko", "123456789");
		gosho.addOffer(o3, bagAccessory);
		pesho.deleteOffer(o2);
//		System.out.println("Fashion List:");
//		Fashion.showFashionOffer();
//		System.out.println("**********************");
//		System.out.println("Accessory List:");
//		Accessory.showAccessoryList();
//		ICategory.showListOfOffers(Fashion.getFashionOffers());
//		System.out.println("**********************");
//		System.out.println("Glass List:");
//		ICategory.showListOfOffers(Glasses.getListOfOffers());
//		System.out.println("**********************");
//		System.out.println("Bag List:");
//		ICategory.showListOfOffers(bagAccessory);
		System.out.println("Fashion with method in ICATEGORY");
		ICategory.showListOfOffers(Fashion.getFashionOffers());
		System.out.println("Accessory");
		ICategory.showListOfOffers(Accessory.getAccessoryOffers());
		System.out.println("Other method");
//		System.out.println("Bag Accesory: ");
//		ICategory.showListOfOffers(bagAccessory);
//		System.out.println("Tie Accesory: ");
//		ICategory.showListOfOffers(tieAccessory);
//		System.out.println("Hat Accesory: ");
//		ICategory.showListOfOffers(hatAccessory);
//		System.out.println("Glass Accesory: ");
//		ICategory.showListOfOffers(glassAccessory);

	}
}
