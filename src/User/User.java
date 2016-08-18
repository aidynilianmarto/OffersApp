package User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import Offer.ICategory;
import Offer.Offer;
import Shop.Shop;


public class User implements IUser{
	private String name;
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private String address;
	private int age;
	private HashSet<Offer> favourite;
	private ArrayList<Offer> myOffer;
	private ArrayList<Offer> archiveOffer;
	private HashMap<String,String> receivedМessages;
	private HashMap<String,String> sendМessages;
	private boolean isLogIn;
	
	private User(String name,String userName, String password, String email) {
		if(name!=null && !(name.isEmpty())){
			this.name = name;
		}
		if(userName!=null && !(userName.isEmpty())){
			this.userName = userName;
		}
		if(password.length()>=8 ){
			this.password = password;
		}
		this.email = email;
		favourite = new HashSet<>();
		myOffer = new ArrayList<>();
		archiveOffer = new ArrayList<>();
		receivedМessages = new HashMap<>();
		sendМessages = new HashMap<>();
		isLogIn = false;
	}
	
	private User(String name,String userName, String password, String email,String phoneNumber,String address,int age){
		if(name!=null && !(name.isEmpty())){
			this.name = name;
		}
		if(userName!=null && !(userName.isEmpty())){
			this.userName = userName;
		}
		if(password.length()>=8 ){
			this.password = password;
		}
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.address = address;
		if(this.age>0){
			this.age = age;
		}
		favourite = new HashSet<>();
		myOffer = new ArrayList<>();
		archiveOffer = new ArrayList<>();
	}
	
	public static User registration(String name,String userName, String password, String email,String phoneNumber,String address,int age){
		if(Shop.checkUser(userName)){
			System.out.println("A user with that name already exists!");
			return null;
		}else{
			System.out.println("Registration is successfully!");
			User u = new User(name, userName, password, email, phoneNumber, address, age);
			Shop.getUserAndOffer().put(u, new ArrayList<>());
			Shop.getUsers().add(u);
			return u;
		}
	}
	
	public static User registration(String name,String userName, String password, String email){
		if(Shop.checkUser(userName)){
			System.out.println("A user with that name already exists!");
			return null;
		}else{
			System.out.println("Registration is successfully!");
			User u = new User(name, userName, password, email);
			Shop.getUserAndOffer().put(u, new ArrayList<>());
			Shop.getUsers().add(u);
			return u;
		}
	}
	
	@Override
	public void addOffer(Offer o, ICategory c) {
		if(this.isLogIn){
			if(Shop.getOffersByCategory().containsKey(c)){
				Shop.getOffersByCategory().get(c).add(o);
				Shop.getUserAndOffer().get(this).add(o);
				myOffer.add(o);
			}else{
				Shop.getOffersByCategory().put(c, new ArrayList<>());
				Shop.getOffersByCategory().get(c).add(o);
				Shop.getUserAndOffer().get(this).add(o);
				myOffer.add(o);
			}
			
		}else{
			System.out.println("You are not Log In!");
		}
		
	}
	@Override
	public void logIn(String userName, String password) {
		if(Shop.checkUser(userName)){
			if(this.userName.equals(userName) && this.password.equals(password)){
				System.out.println("You are login successfully!");
				this.isLogIn = true;
				return;
			}
			System.out.println("Wrong User Name or Password!");
		}else{
			System.out.println("No such user!");
		}
		
	}
	@Override
	public void addToFavourite(Offer o) {
		if(this.isLogIn){
			if(!favourite.contains(o)){
				favourite.add(o);
				System.out.println("Offer was successfully added!");
				return;
			}	
			System.out.println("Sorry!This offer was recently added!");
		}else{
			System.out.println("You are not Log In!");
		}
		
		
	}
	@Override
	public void viewOffer(Offer o) {
		System.out.println("Name: " + o.getName() );
		System.out.println("Description: " + o.getDescription() );
		System.out.println("Price: " + o.getPrice() );
		System.out.println("Location: " + o.getLocation() );
		System.out.println("Dead Line: " + o.getDeadLine() );
	}
	@Override
	public void callUser(User u) {
		if(this.isLogIn){
			
		}else{
			System.out.println("You are not Log In!");
		}
		
	}
	@Override
	public void sendMsg(User u,String title, String msg) {
		if(this.isLogIn){
			this.getSendМessages().put(title, msg);
			u.getReceivedМessages().put(title, msg);
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void searchByCategory(ICategory c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchByName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void search(ICategory c, String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteOffer(Offer o) {
		if(this.isLogIn){
			if(myOffer.contains(o)){
				myOffer.remove(0);
				System.out.println("The offer is successfully removed!");
				return;
			}
			System.out.println("Sorry!The offer was recently removed!");
		}else{
			System.out.println("You are not Log In!");
		}
		
	}
	@Override
	public void archiveOffer(Offer o) {
		if(this.isLogIn){
			if(!archiveOffer.contains(o)){
				archiveOffer.add(o);
				System.out.println("The offer is archived successfully!");
				return;
			}
			System.out.println("The offer was recently archived!");
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void changePassword(String oldPw, String newPw) {
		if(this.isLogIn){
			if(oldPw.equals(this.password)){
				this.password = newPw;
				System.out.println("The password is successfully changed!");
				return;
			}
			System.out.println("Your old password does not match!Please try againg later!");
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void changeMail(String oldMail, String newMail) {
		if(this.isLogIn){
			if(this.email.equals(oldMail)){
				this.email = newMail;
				System.out.println("The Email is successfully changed!");
				return;
			}
			System.out.println("Your old Email does not match!Please try againg later!");
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void getMyOffer() {
		if(this.isLogIn){
			if(myOffer.size()==0){
				System.out.println(this.getUserName()+ " no offers!");
				return;
			}
			for (int i = 0; i < myOffer.size(); i++) {
				System.out.println("-----Offer " + (i+1) + "-----" );
				System.out.println("Name: " + myOffer.get(i).getName() );
				System.out.println("Description: " + myOffer.get(i).getDescription() );
				System.out.println("Price: " + myOffer.get(i).getPrice() );
				System.out.println("Location: " + myOffer.get(i).getLocation() );
				System.out.println("Dead Line: " + myOffer.get(i).getDeadLine() );
			}
		}else{
			System.out.println("You are not Log In!");
		}
		
	}
	
	public HashMap<String, String> getReceivedМessages() {
		return receivedМessages;
	}
	
	public HashMap<String, String> getSendМessages() {
		return sendМessages;
	}
	@Override
	public void showReceivedMessages(){
		System.out.println("Title: " + this.receivedМessages.keySet());
		System.out.println("Message: " + this.receivedМessages.values());
	}
	@Override
	public void showSendMessages(){
		System.out.println("Title: " + this.sendМessages.keySet());
		System.out.println("Message: " + this.sendМessages.values());
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(!this.phoneNumber.equals(phoneNumber)){
			this.phoneNumber = phoneNumber;
			System.out.println("The Phone number is edited successfully!");
			return;
		}
		System.out.println("The Phone number is the same!");
	}

	public void setAddress(String address) {
		if(!this.address.equals(address)){
			this.address = address;
			System.out.println("The Address is edited successfully!");
			return;
		}
		System.out.println("The Address is the same!");
	}
	
	public String getUserName() {
		return userName;
	}
	
	
	
}
