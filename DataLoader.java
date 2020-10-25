
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
		}	catch(Exception e) {
			e.printStackTrace();
		}
	
	public static ArrayList<Listings> loadListings() {
		ArrayList<Listings> listings = new ArrayList<Listings>();
		
		try {
			FileReader reader = new FileReader(PROPERTY_FILE);
			String address = (String)json_Property.get(PROPERTY_ADDRESS);
			String type = (String)json_Property.get(PROPERTY_TYPE);
			
			
			}
		}
