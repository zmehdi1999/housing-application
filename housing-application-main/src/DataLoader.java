
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants{
	
	public static ArrayList<User> loadUsers(){
	
		ArrayList<User> users = new ArrayList<User>();
		
		
		
		try { 
			FileReader reader = new FileReader(FILE);
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			
			for(int i = 0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String firstName = (String)userJSON.get(USER_FIRST_NAME);
				String lastName = (String)userJSON.get(USER_LAST_NAME);
				String userName = (String)userJSON.get(USER_USER_NAME);
				String email = (String)userJSON.get(USER_EMAIL);
				String password = (String)userJSON.get(USER_PASSWORD);
				int phoneNum = (int)userJSON.get(USER_PHONE_NUM);
				boolean registered = (Boolean)userJSON.get(USER_REGISTERED);
				boolean owner = (Boolean)userJSON.get(USER_OWNER);
				int rating = (int)userJSON.get(USER_RATING);
				
				users.add(new User(firstName, lastName, userName, email, password, phoneNum, registered, owner, rating));
			}
			return users;
			reader.close();
			
		}	catch(Exception e) {
				e.printStackTrace();
			}
		
		
	}
	
	public static ArrayList<Property> loadListings() {
		ArrayList<Property> listings = new ArrayList<Property>();
		
		try {
			FileReader reader = new FileReader(PROPERTY_FILE);
			JSONArray propertiesJSON = (JSONArray)new JSONParser().parse(reader);
			
			
			for(int i = 0; i < propertiesJSON.size(); i++) {
				JSONObject propertyJSON = (JSONObject)propertiesJSON.get(i);
				String location = (String)propertiesJSON.get(PROPERTY_LOCATION);
				String vacancy = (String)propertiesJSON.get(PROPERTY_VACANCY);
				double price = (double)propertiesJSON.get(PROPERTY_PRICE);
				int yearBuilt = (int)propertiesJSON.get(PROPERTY_YEARBUILT);
				int numBed = (int)propertiesJSON.get(PROPERTY_NUMBED);
				int numBath = (int)propertiesJSON.get(PROPERTY_NUMBATH);
				String washerAndDryer = (String)propertiesJSON.get(PROPERTY_WASHERANDDRYER);
				String pool = (String)propertiesJSON.get(PROPERTY_POOL);
				String parking = (String)propertiesJSON.get(PROPERTY_PARKING);
				String lawncare = (String)propertiesJSON.get(PROPERTY_LAWNCARE);
				int vistaWS = (int)propertiesJSON.get(PROPERTY_VISTAWS);
				int fpWS = (int)propertiesJSON.get(PROPERTY_FPWS);
				int uscWS = (int)propertiesJSON.get(PROPERTY_USCWS);
				
				listings.add(new Property(location, vacancy, price, yearBuild, numBed, numBath, washerAndDryer, pool, parking, lawncare, vistaWS, fpWS, uscWS));
			}
			return listings;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}