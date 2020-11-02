
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
				int phoneNum = (int)userJSON.get(USER_PHONE_NUM);
				Boolean registered = (Boolean)userJSON.get(USER_REGISTERED);
				Boolean owner = (Boolean)userJSON.get(USER_OWNER);
				int rating = (int)userJSON.get(USER_RATING);
				
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
				String location = (String)propertyJSON.get(PROPERTY_LOCATION);
				Boolean vacancy = (Boolean)propertyJSON.get(PROPERTY_VACANCY);
				int price = ((Long)propertyJSON.get(PROPERTY_PRICE)).intValue();
				int yearBuilt = ((Long)propertyJSON.get(PROPERTY_YEARBUILT)).intValue();
				int numBed = ((Long)propertyJSON.get(PROPERTY_NUMBED)).intValue();
				int numBath = ((Long)propertyJSON.get(PROPERTY_NUMBATH)).intValue();
				Boolean washerAndDryer = (Boolean)propertyJSON.get(PROPERTY_WASHERANDDRYER);
				Boolean pool = (Boolean)propertyJSON.get(PROPERTY_POOL);
				Boolean parking = (Boolean)propertyJSON.get(PROPERTY_PARKING);
				Boolean pets = (Boolean)propertyJSON.get(PROPERTY_PETS);
				int vistaWS = ((Long)propertyJSON.get(PROPERTY_VISTAWS)).intValue();
				int fpWS = ((Long)propertyJSON.get(PROPERTY_FPWS)).intValue();
				int uscWS = ((Long)propertyJSON.get(PROPERTY_USCWS)).intValue();
				System.out.println(properties);
				properties.add(new Property(location, vacancy, price, yearBuilt, numBed, numBath, washerAndDryer, pool, parking, pets, vistaWS, fpWS, uscWS));
			}
			System.out.println(properties.size());
			return properties;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}