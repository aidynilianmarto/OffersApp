package Offer;

import User.User;
import Shop.Shop;
public class Offer{
	
	private String name;
	private double price;
	private String deadLine;
	private User user;
	private String date;
	private String description;
	private String location;
	private ICategory category;
	
	public Offer(String name, double price, String deadLine,String description,String location) {
		if(name!=null && !(name.isEmpty())){
			this.name = name;
		}
		if(price>0){
			this.price = price;
		}
		this.deadLine = deadLine;
		if(description!=null && !(description.isEmpty())){
			this.description = description;
		}
		this.location = location;
		this.category = category;
		Shop.allOffers.add(this);
		
	}
	
	public void setUser(User u){
		this.user = u;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public User getUser() {
		return user;
	}

	public String getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public ICategory getCategory() {
		return category;
	}

	public void setName(String newName) {
		this.name = newName;
		
	}

	public void setCategory(ICategory c) {
		this.category = c;
	}
}
