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
	
	public static ArrayList<Property> getProperties() {
		return propertiesList;
	}
	
	public void addProperty(String location, String Vacancy, int price, int yearBuilt, int numBed, int numBath, Boolean washerAndDryer, Boolean pool, Boolean parking, Boolean pets, int vistaWS, int fpWS, int uscWS){
		
		propertiesList.add(new Property(location, Vacancy,  price, yearBuilt, numBed,  numBath,  washerAndDryer,  pool, parking,  pets,  vistaWS,  fpWS, uscWS));
		DataWriter.saveProperties();
	}

}