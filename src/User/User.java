package User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	private Pattern mailPatern = Pattern.compile(EMAIL_PATTERN);
	private Matcher mailMatcher;
	private static final String EMAIL_PATTERN ="^[[a-zA-Z_0-9]]+(\\.[[a-zA-Z_0-9]]+)*@" + "[[a-z]]+(\\.bg|\\.com)$";
	protected User(String name,String userName, String password, String email) {
		if(name!=null && !(name.isEmpty())){
			this.name = name;
		}
		if(userName!=null && !(userName.isEmpty())){
			this.userName = userName;
		}
		if(password.length()>=8 ){
			this.password = password;
		}
		if(validateMail(email)){
			this.email = email;
		}else{
			System.out.println("Your Email is Incorect!");
		}
		favourite = new HashSet<>();
		myOffer = new ArrayList<>();
		archiveOffer = new ArrayList<>();
		receivedМessages = new HashMap<>();
		sendМessages = new HashMap<>();
		isLogIn = false;
	}
	
	protected User(String name,String userName, String password, String email,String phoneNumber,String address,int age){
		if(name!=null && !(name.isEmpty())){
			this.name = name;
		}
		if(userName!=null && !(userName.isEmpty())){
			this.userName = userName;
		}
		if(password.length()>=8 ){
			this.password = password;
		}
		if(validateMail(email)){
			this.email = email;
		}else{
			System.out.println("Your Email is Incorect!");
		}
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
	
	public boolean validateMail(final String checkedMail) {
			mailMatcher = mailPatern.matcher(checkedMail);
			return mailMatcher.matches();
		}
	
	public static User registration(String name,String userName, String password, String email,String phoneNumber,String address,int age){
		if(Shop.checkUser(userName)){
			System.out.println("A user with that name already exists!");
			return null;
		}else{
			System.out.println("Registration is successfully!");
			User u = new User(name, userName, password, email, phoneNumber, address, age);
			Shop.userAndOffer.put(u, new ArrayList<>());
			Shop.users.add(u);
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
			Shop.userAndOffer.put(u, new ArrayList<>());
			Shop.users.add(u);
			return u;
		}
	}
	
	@Override
	public void addOffer(Offer o, ICategory c) {
		if(this.isLogIn){
			if(Shop.offersByCategory.containsKey(c)){
				Shop.offersByCategory.get(c).add(o);
			}else{
				Shop.offersByCategory.put(c, new ArrayList<>());
				Shop.offersByCategory.get(c).add(o);

			}
			System.out.println("The offer is added!");
			if(!Shop.userAndOffer.containsKey(this)){
				Shop.userAndOffer.put(this,	new ArrayList<>());
			}
			Shop.userAndOffer.get(this).add(o);
			o.setUser(this);
			o.setCategory(c);
			c.addOffer(o);
			Shop.allOffers.add(o);
			myOffer.add(o);
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void logIn(String userName, String password) {
		if(Shop.checkUser(userName)){
			if(this.isLogIn){
				return;
			}
			if(this.userName.equals(userName) && this.password.equals(password)){
				System.out.println(this.userName + " login successfully!");
				this.isLogIn = true;
				return;
			}
			System.out.println("Wrong Password!");
		}else{
			System.out.println("No such user!");
		}
		
	}
	
	@Override
	public void logOut() {
		this.isLogIn = false;
		System.out.println("Your are loging out!");
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
			System.out.println("The Message is sended!");
			return;
		}
		System.out.println("You are not Log In!");
		
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
				for(User u : Shop.users){
					u.archiveOffer.remove(o);
					u.favourite.remove(o);
				}
				Shop.allOffers.remove(o);
				Shop.offersByCategory.get(o.getCategory()).remove(o);
				Shop.userAndOffer.get(this).remove(o);
				o.getCategory().deleteOffer(o);
				o.getCategory().getListOfOffers().remove(o);
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
			if(validateMail(newMail)){
				if(this.email.equals(oldMail)){
					this.email = newMail;
					System.out.println("The Email is successfully changed!");
					return;
				}
				System.out.println("Your old Email does not match!Please try againg later!");
			}else{
				System.out.println("Wrong Input Email!");
			}
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void changeOffersName(Offer o,String newName){
		if(this.isLogIn){
				if(this.myOffer.contains(o)){
					if(o.getName().equals(newName)){
						System.out.println("The names are equals!");
						return;
					}
					if(newName!=null &&!(newName.isEmpty())){
						o.setName(newName);
						return;
					}
			}
			System.out.println("You can't change name of this offer!");
		}else{
			System.out.println("You are not Log In!");
		}
	}
	@Override
	public void showMyOffer() {
		
		if(myOffer.size()==0){
			System.out.println(this.getUserName()+ " no offers!");
			return;
		}
		for (int i = 0; i < myOffer.size(); i++) {
			System.out.println("-----Offer " + (i+1) + "-----" );
			System.out.println("Name: " + myOffer.get(i).getName() );
			System.out.println("Category: " + myOffer.get(i).getCategory().getCategoryName() );
			System.out.println("User: " + myOffer.get(i).getUser().getName());
			System.out.println("Description: " + myOffer.get(i).getDescription() );
			System.out.println("Price: " + myOffer.get(i).getPrice() );
			System.out.println("Location: " + myOffer.get(i).getLocation() );
			System.out.println("Dead Line: " + myOffer.get(i).getDeadLine() );
		}
	}
	

	@Override
	public void showMyFavouriteOffer() {
		if(this.isLogIn){
			if(favourite.size()==0){
				System.out.println(this.getUserName()+ " no offers!");
				return;
			}
			int i = 0;
			for (Offer o : favourite) {
				System.out.println("-----Offer " + (++i) + "-----" );
				System.out.println("Name: " + o.getName() );
				System.out.println("Category: " + o.getCategory().getCategoryName() );
				System.out.println("User: " + o.getUser().getName());
				System.out.println("Description: " + o.getDescription() );
				System.out.println("Price: " + o.getPrice() );
				System.out.println("Location: " + o.getLocation() );
				System.out.println("Dead Line: " + o.getDeadLine() );
			}
		}else{
			System.out.println("You are not Log In!");
		}
		
	}
	
	@Override
	public void showArchivedOffer() {
		if(this.isLogIn){
			if(archiveOffer.size()==0){
				System.out.println(this.getUserName()+ " no archived offers!");
				return;
			}
			int i = 0;
			for (Offer o : archiveOffer) {
				System.out.println("-----Offer " + (++i) + "-----" );
				System.out.println("Name: " + o.getName() );
				System.out.println("Category: " + o.getCategory().getCategoryName() );
				System.out.println("User: " + o.getUser().getName());
				System.out.println("Description: " + o.getDescription() );
				System.out.println("Price: " + o.getPrice() );
				System.out.println("Location: " + o.getLocation() );
				System.out.println("Dead Line: " + o.getDeadLine() );
			}
		}else{
			System.out.println("You are not Log In!");
		}
		
	}
	
	@Override
	public void showReceivedMessages(){
		if(this.isLogIn){
			if(this.receivedМessages.keySet().isEmpty()){
				System.out.println("Empty Received Messages List!");
				return;
			}
			for (String s : this.receivedМessages.keySet()) {
				System.out.println("[Title: " + s + "] " +"[Message: " + receivedМessages.get(s)+ "]" );
			}
			return;
		}
		System.out.println("You need to log in!");
	}
	
	@Override
	public void showSendMessages(){
		if(this.isLogIn){
			if(this.sendМessages.keySet().isEmpty()){
				System.out.println("Empty Send Messages List!");
				return;
			}
			for (String s : this.sendМessages.keySet()) {
				System.out.println("[Title: " + s + "] " +"[Message: " + sendМessages.get(s)+ "]" );
			}
			return;
		}
		System.out.println("You need to log in!");
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(this.isLogIn){
			if(this.phoneNumber==null){
				this.phoneNumber = phoneNumber;
				System.out.println("The Phone number is edited successfully!");
				return;
			}
			if(!this.phoneNumber.equals(phoneNumber)){
				this.phoneNumber = phoneNumber;
				System.out.println("The Phone number is edited successfully!");
				return;
			}
			System.out.println("The Phone number is the same!");
		}else{
			System.out.println("You need to log in!");
		}
	}

	public void setAddress(String address) {
		if(this.isLogIn){
			if(this.address == null){
				this.address = address;
				System.out.println("The Address is edited successfully!");
				return;
			}
				if(!this.address.equals(address)){
					this.address = address;
					System.out.println("The Address is edited successfully!");
					return;
				}
				System.out.println("The Address is the same!");
		}else{
			System.out.println("You need to log in!");
		}
	}
	
	public void setName(String name) {
		if(this.name.equals(name)){
			System.out.println("The names are the same!");
			return;
		}
		if(name!=null && !(name.isEmpty()) ){
			System.out.println("Name changed successfully!");
			this.name = name;
		}
	}
	
	public String getUserName() {
		return userName;
	}
	
	public HashMap<String, String> getReceivedМessages() {
		return receivedМessages;
	}
	
	public HashMap<String, String> getSendМessages() {
		return sendМessages;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	} 
	
	public boolean getIsLogin(){
		return isLogIn;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	
}
