package User;

import Offer.Offer;
import Shop.Shop;

public class Admin extends User implements IAdmin {
	static Admin instance = new Admin("Admin", "admin", "123456789", "admin@admin.bg");
	
	protected Admin(String name, String userName, String password, String email) {
		super(name, userName, password, email);
	}

	@Override
	public void approveOffer(Offer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(User u) {
		if (this.getIsLogin()) {
			if (Shop.users.contains(Shop.users.contains(u)) || Shop.userAndOffer.containsKey(u)) {
				Shop.userAndOffer.remove(u);
				Shop.users.remove(u);
				System.out.println("User is deleted!");
			} else {
				System.out.println("User doesn't exist!");
			}

		} else {
			System.out.println("You are not log in!");
		}
	}

	public static Admin getInstance() {
		return instance;
	}

}
