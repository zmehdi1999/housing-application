
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;	

public class DataWriter {
	public static void savePeople() {
		User users = User.getInstance();
		ArrayList<User> rand = users.getUsers();
		JSONArray jsonrand = new JSONArray();
		
		for(int i = 0; i < rand.size(); i++){
			jsonrand.add(getUsersJSON(rand.get(i));
		}
  	try(FileWriter file = new FileWriter(TENANTS_FILE_NAME)){
		file.write(jsonrand.toJSONString());
		file.flush();
	}
	catch(IOException e) {
		e.printStackTrace();
	 }
      }
 			
  	public static JSONObject getTenantJSON(User users) {
		JSONObject usersDetails = new JSONObject();
		usersDetails.put(USER_FIRST_NAME, users.getFirstName());
		usersDetails.put(USER_LAST_NAME, users.getLastName());
		usersDetails.put(USER_USER_NAME, users.getUserName());
		usersDetails.put(USER_EMAIL, users.getEmail());
		usersDetails.put(USER_PASSWORD,users.getPassword());
		usersDetails.put(USER_PHONE_NUM,users.getPhoneNum());
		usersDetails.put(USER_REGISTERED,users.getRegistered());
		usersDetails.put(USER_OWNER,users.getOwner());
		usersDetails.put(USER_RATING,users.getRating());
   
   	 return usersDetails;
	}
}
