
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader {
	
	public static ArrayList<User> loadUsers(){
	
		ArrayList<User> users = new ArrayList<User>();
		
		try { 
			FileReader reader = new FileReader(FILE);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			
			for(int i = 0; i < json_User.size(); i++) {
				String firstName = (String)json_USER.get(USER_FIRST_NAME);
				String lastName = (String)json_USER.get(USER_LAST_NAME);
				String userName = (String)json_USER.get(USER_USER_NAME);
				String email = (String)json_USER.get(USER_EMAIL);
				String password = (String)json_USER.get(USER_PASSWORD);
				int phoneNum = (int)json_USER.get(USER_PHONE_NUM);
				String registered = (String)json_USER.get(USER_REGISTERED);
				//boolean tenant =(boolean)json_TenantAndOwner.get(USER_REGISTERED);
				//we dont need tenant, bc if owner is false then they know they are a tenant, need to make OWNER a String not boolean
				String owner = (String)json_USER.get(USER_OWNER);
				int rating = (int) json_USER.get(USER_RATING);
				
				users.add(new User(firstName, lastName, userName, email, password, phoneNum, registered, owner, rating));
			}
			return users;
		}
			catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Listings> loadListings() {
		ArrayList<Listings> listings = new ArrayList<Listings>();
		
		try {
			FileReader reader = new FileReader(PROPERTY_FILE);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			
			for(int i = 0; i < json_Property.size(); i++) {
				String location = (String)json_Property.get(PROPERTY_LOCATION);
				String vacancy = (String)json_Property.get(PROPERTY_VACANCY);
				double price = (double)json_Property.get(PROPERTY_PRICE);
				int yearBuilt = (int)json_Property.get(PROPERTY_YEARBUILT);
				int numBed = (int)json_Property.get(PROPERTY_NUMBED);
				int numBath = (int)json_Property.get(PROPERTY_NUMBATH);
				String washerAndDryer = (String)json_Property.get(PROPERTY_WASHERANDDRYER);
				String pool = (String)json_Property.get(PROPERTY_POOL);
				String parking = (String)json_Property.get(PROPERTY_PARKING);
				String lawncare = (String)json_Property.get(PROPERTY_LAWNCARE);
				int vistaWS = (int)json_Property.get(PROPERTY_VISTAWS);
				int fpWS = (int)json_Property.get(PROPERTY_FPWS);
				int uscWS = (int)json_Property.get(PROPERTY_USCWS);
			}
			
			listings.add(new Property(location, vacancy, price, yearBuild, numBed, numBath, washerAndDryer, pool, parking, lawncare, vistaWS, fpWS, uscWS));
		}
		
		return listings;
		
		}	catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}