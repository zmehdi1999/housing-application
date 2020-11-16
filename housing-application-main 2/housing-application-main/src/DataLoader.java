
import java.io.FileReader;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants  {
	
	public static ArrayList<User> loadUsers(){
	
		ArrayList<User> users = new ArrayList<User>();
		
		
		
		try { 
			FileReader reader = new FileReader(FILE);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String firstName = (String)userJSON.get(USER_FIRST_NAME);
				String lastName = (String)userJSON.get(USER_LAST_NAME);
				String userName = (String)userJSON.get(USER_USER_NAME);
				String email = (String)userJSON.get(USER_EMAIL);
				String password = (String)userJSON.get(USER_PASSWORD);
				//int phoneNum = (int)userJSON.get(USER_PHONE_NUM);
				int phoneNum = (int)0;
				//Boolean registered = (Boolean)userJSON.get(USER_REGISTERED);
				Boolean registered;
				if(userJSON.get(USER_REGISTERED).equals("true"))
					registered = true;
				else
					registered = false;
				//Boolean owner = (Boolean)userJSON.get(USER_OWNER);
				Boolean owner;
				if(userJSON.get(USER_OWNER).equals("true"))
					owner = true;
				else
					owner = false;
				int rating = (int)0;
				
				users.add(new User(firstName, lastName, userName, email, password, phoneNum, registered, owner, rating));
			}
			return users;
			
		}	catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	public static ArrayList<Property> loadListings() {
		ArrayList<Property> properties = new ArrayList<Property>();
		
		try {
			FileReader reader = new FileReader(PROPERTY_FILE);
			JSONParser parser = new JSONParser();
			JSONArray propertiesJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < propertiesJSON.size(); i++) {
				JSONObject propertyJSON = (JSONObject)propertiesJSON.get(i);
				Boolean wifi = (Boolean)propertyJSON.get(PROPERTY_WIFI);
				Boolean gym = (Boolean)propertyJSON.get(PROPERTY_GYM);
				Boolean furnished = (Boolean)propertyJSON.get(PROPERTY_FURNISHED);
				int id = ((Long)propertyJSON.get(PROPERTY_ID)).intValue();
				String location = (String)propertyJSON.get(PROPERTY_LOCATION);
				Boolean vacancy = (Boolean)propertyJSON.get(PROPERTY_VACANCY);
				double price = ((Long) propertyJSON.get(PROPERTY_PRICE)).doubleValue();
				//int yearBuilt = ((Long)propertyJSON.get(PROPERTY_YEARBUILT)).intValue();
				int yearBuilt = ((Long) propertyJSON.get(PROPERTY_YEARBUILT)).intValue();
				int numBed = ((Long)propertyJSON.get(PROPERTY_NUMBED)).intValue();
				int numBath = ((Long)propertyJSON.get(PROPERTY_NUMBATH)).intValue();
				//Boolean washerAndDryer = (Boolean)propertyJSON.get(PROPERTY_WASHERANDDRYER);
				Boolean washerAndDryer;
				if(propertyJSON.get(PROPERTY_WASHERANDDRYER).equals("true"))
					washerAndDryer = true;
				else
					washerAndDryer = false;
				//Boolean pool = (Boolean)propertyJSON.get(PROPERTY_POOL);
				Boolean pool;
				if(propertyJSON.get(PROPERTY_POOL).equals("true"))
					pool = true;
				else
					pool = false;
				//Boolean parking = (Boolean)propertyJSON.get(PROPERTY_PARKING);
				Boolean parking;
				if(propertyJSON.get(PROPERTY_PARKING).equals("true"))
					parking = true;
				else
					parking = false;
				//Boolean pets = (Boolean)propertyJSON.get(PROPERTY_PETS);
				Boolean pets;
				if(propertyJSON.get(PROPERTY_PETS).equals("true"))
					pets = true;
				else
					pets = false;
				int vistaWS = ((Long) propertyJSON.get(PROPERTY_VISTAWS)).intValue();
				int fpWS = ((Long)propertyJSON.get(PROPERTY_FPWS)).intValue();
				int uscWS = ((Long)propertyJSON.get(PROPERTY_USCWS)).intValue();
				properties.add(new Property(wifi, gym, furnished, id, location, vacancy, price, yearBuilt, numBed, numBath, washerAndDryer, pool, parking, pets, vistaWS, fpWS, uscWS));
			}
			return properties;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}