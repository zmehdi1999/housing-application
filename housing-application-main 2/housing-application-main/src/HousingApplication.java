
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject; 


public class HousingApplication {
	private ArrayList<Tenant> tenants; 
	private ArrayList<Owner> owners;
	public ArrayList<Property> properties;
	public ArrayList<User> people;
	
	public HousingApplication() {
		tenants = Database.getTenants();
		owners = Database.getOwners();
		properties = Database.getInstance().getProperties();
		people = Database.getUsers();
	}
	public User loginTenant(String username, String password) {
		people = DataLoader.loadUsers();
		/*
		for(Tenant t : tenants) {
			if(t.getUserName().equals(username) && t.getPassword().equals(password)) return t;
		}
		return null;
		*/
		for(User u : people) {
			if(u.getUserName().equals(username) && u.getPassword().equals(password)) return u;
		}
		return null;
	}
	
	public Owner loginOwner(String username, String password) {
		for(Owner o : owners) {
			if(o.getUserName().equals(username) && o.getPassword().equals(password)) return o;
		}
		return null;
	}
	public ArrayList<Property> searchProperties(int minPrice, int maxPrice, int numBed, int numBath, boolean washerAndDryer, boolean pool, boolean pets) {
		ArrayList<Property> found = new ArrayList<Property>();
		Property property;
		System.out.println("****** Properties that match your search: ******* ");
		for(int i = 0; i < properties.size(); i++) {
			property = properties.get(i);
			if(property.getNumBed() == numBed && property.getNumBath() == numBath && property.getWasherAndDryer()==washerAndDryer&& property.getPool().booleanValue()==pool&& property.getPets()== pets)
			{
				found.add(property);
			}
		}
		return found;
	}
	public ArrayList<User> login(String userName, String password, Boolean owner){
		ArrayList<User> found = new ArrayList<User>();
		User user;
		for(int i = 0; i < people.size(); i ++) {
			user = people.get(i);
			if(user.getUserName() == userName && user.getPassword()==password && user.getOwner()==owner) {
				found.add(user);
			}
		}
		return found;
	}
	
	public void loadProperties(Property Property)
	{
		DataLoader.loadListings();
	}
	
	public void reviewProperty(String property, String review) {
		for(Property p : properties) {
			if(p.getLocation().equals(property)) p.userReviews.add(review);
		}
	}
	
	public void signLease(Property property) {
		for(Property p : properties) {
			
		}
	}
	
	
	public static void addProperty(String location, boolean vacancy, int price, int yearBuilt, int numBed, int numBath, boolean washerAndDryer, boolean pool, boolean parking, boolean pets, int vistaWS, int fpWS, int uscWS) {
		
		JSONObject prop = new JSONObject();

		prop.put("address", location);
		prop.put("vacancy", vacancy);
		prop.put("price", price);
		prop.put("yearBuild", yearBuilt);
		prop.put("beds", numBed);
		prop.put("baths", numBath);
		prop.put("washAndDryer", washerAndDryer);
		prop.put("pool", pool);
		prop.put("parking", parking);
		prop.put("pets", pets);
		prop.put("vistaWS", vistaWS);
		prop.put("fpWS", fpWS);
		prop.put("uscWS", uscWS);
		
		try(FileWriter file = new FileWriter(DataConstants.PROPERTY_FILE)){
			file.write(prop.toJSONString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public User createAccount(String firstName, String lastName, String userName, String email, String password, int phoneNum, boolean registered, boolean owner) {
		JSONObject user = new JSONObject();
		User newUser;

		user.put("userName", userName);
		user.put("email", email);
		user.put("password", password);
		user.put("firstName", firstName);
		user.put("lastName", lastName);
		user.put("registered", registered);
		user.put("owner", owner);
		
		try(FileWriter file = new FileWriter(DataConstants.FILE)){
			file.write(user.toJSONString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(owner)
			newUser = new Owner(firstName, lastName, userName, email, password, 0000000);
		else
			newUser = new Tenant(firstName, lastName, userName, email, password, 0000000);
		
		return newUser;
	}

}
