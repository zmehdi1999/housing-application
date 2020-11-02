import java.util.ArrayList;

public class Properties {
	private static Properties properties = null;
	private static ArrayList<Property> propertiesList = new ArrayList<Property>();
	
	private Properties() {
		propertiesList = DataLoader.loadListings();
	}
	
	public static Properties getInstance() {
		if(properties == null) {
			properties = new Properties();
		}
		
		return properties;
	}
	
	public ArrayList<Property> getProperties() {
		return propertiesList;
	}
	
	public static void addProperty(String location, String Vacancy, double Price, int yearBuilt, int numBed, int numBath, Boolean washerAndDryer, Boolean pool, Boolean parking, Boolean pets, int vistaWS, int fpWS, int uscWS){
		
		propertiesList.add(new Property(location, Vacancy,  Price, yearBuilt, numBed,  numBath,  washerAndDryer,  pool, parking,  pets,  vistaWS,  fpWS, uscWS));
		DataWriter.savePeople();
	}

}