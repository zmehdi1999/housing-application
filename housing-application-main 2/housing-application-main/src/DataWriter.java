
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;	

public class DataWriter extends DataConstants {
//Users Data	
	public static void savePeople() {
		People people = People.getInstance();
		ArrayList<User> rand = people.getPeople();
		JSONArray jsonRand = new JSONArray();
		
		for(int i = 0; i < rand.size(); i++){
			jsonRand.add(getUsersJSON(rand.get(i)));
		}
		
  	try(FileWriter file = new FileWriter(FILE)){
		file.write(jsonRand.toJSONString());
		file.flush();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
    }
	
  	private static JSONObject getUsersJSON(User users) {
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
  //Properties Data	
	public static void saveProperties() {
		Properties properties = Properties.getInstance();
		ArrayList<Property> rand = properties.getProperties();
		JSONArray array = new JSONArray();
		
		for(int i = 0; i < rand.size(); i++){
			array.add(getPropertiesJSON(rand.get(i)));
		}
		
  	try(FileWriter file = new FileWriter(PROPERTY_FILE)){
		file.write(array.toJSONString());
		file.flush();
	}
	catch(IOException e) {
		e.printStackTrace();
	 }
     }
 			
  	private static JSONObject getPropertiesJSON(Property properties)
  	{
  		JSONArray array = new JSONArray();
  		JSONObject propertyDetails = new JSONObject();
  		propertyDetails.put(PROPERTY_ID, properties.getID());
  		propertyDetails.put(PROPERTY_LOCATION, properties.getLocation());
  		propertyDetails.put(PROPERTY_VACANCY, properties.getVacancy());
  		propertyDetails.put(PROPERTY_PRICE, properties.getPrice());
  		propertyDetails.put(PROPERTY_YEARBUILT, properties.getYearBuilt());
  		propertyDetails.put(PROPERTY_NUMBED, properties.getNumBed());
  		propertyDetails.put(PROPERTY_NUMBATH, properties.getNumBath());
  		propertyDetails.put(PROPERTY_WASHERANDDRYER, properties.getWasherAndDryer());
  		propertyDetails.put(PROPERTY_POOL, properties.getPool());
  		propertyDetails.put(PROPERTY_PARKING, properties.getParking());
  		propertyDetails.put(PROPERTY_PETS, properties.getPets());
  		propertyDetails.put(PROPERTY_VISTAWS, properties.getVistaWS());
  		propertyDetails.put(PROPERTY_FPWS, properties.getFPWS());
  		propertyDetails.put(PROPERTY_USCWS, properties.getUscWS());
  		array.add(propertyDetails);
  		return propertyDetails;
  		
  	}
}
