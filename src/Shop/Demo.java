package Shop;

import Offer.ICategory;
import Offer.Offer;
import User.User;

public class Demo {
	public static void main(String[] args) {
		
		User pesho = User.registration("Petur", "petur1", "123456878", "petur@gmail.com");
		User gosho = User.registration("Gosho", "gosho1", "123456878", "petur@gmail.com");
		pesho.logIn("petur1", "123456878");
		gosho.logIn("gosho1", "123456878");
		Offer o1 = new Offer("Telefon", 200, "20-10-2016", "Samsung Galaxy S6", "Sofia", new ICategory() {
		});
		pesho.addOffer(o1, new ICategory() {
		});
		Offer o2 = new Offer("Kola", 2000, "17-04-2016", "Audi A3", "Pleven", new ICategory() {
		});
		pesho.addOffer(o2, new ICategory() {
		});
		
		Offer o3 = new Offer("Kushta", 50000, "17-04-2016", "S basein", "Smolqn", new ICategory() {
		});
		gosho.addOffer(o3, new ICategory() {
		});
		Shop.showUsersAndOffers();
		System.out.println("Viewing offers!");
		gosho.viewOffer(o1);
		pesho.sendMsg(gosho, "Hello", "Iskam da kupq neshto");
		pesho.sendMsg(gosho, "Zdr", "kvo stava");
		gosho.showReceivedMessages();
		pesho.showSendMessages();
	
	}
}
