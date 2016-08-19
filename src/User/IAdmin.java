package User;

import Offer.Offer;

public interface IAdmin extends IUser {
	
	void approveOffer(Offer o);
	void removeUser(User u);
}
