
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

public class DataLoader {
	
	public static ArrayList<Users> loadUsers(){
	
		ArrayList<Users> users = new ArrayList<Users>();
		
		try { 
			FileReader reader = new FileReader(PEOPLE_FILE_NAME);
			String firstName = (String)json_TenantAndOwner.get(USER_FIRST_NAME);
			String lastName = (String)json_TenantAndOwner.get(USER_LAST_NAME);
			String userName = (String)json_TenantAndOwner.get(USER_USER_NAME);
			String email = (String)json_TenantAndOwner.get(USER_EMAIL);
			String password = (String)json_TenantAndOwner.get(USER_PASSWORD);
			int phoneNum =(int)json_TenantAndOwner.get(USER_PHONE_NUM);
			String registered =(String)json_TenantAndOwner.get(USER_REGISTERED);
			//boolean tenant =(boolean)json_TenantAndOwner.get(USER_REGISTERED);
			//we dont need tenant, bc if owner is false then they know they are a tenant, need to make OWNER a String not boolean
			String owner = (String)json_TenantAndOwner.get(USER_OWNER);
			int rating = (int) json_TenantAndOwner.get(USER_RATING);
	}
	
	public static ArrayList<Listings> loadListings() {
		ArrayList<Listings> listings = new ArrayList<Listings>();
		
		try {
			FileReader reader = new FileReader(LISTING_FILE_NAME);
			String address = 
			String type = 
			String 
			
			
	}
}
