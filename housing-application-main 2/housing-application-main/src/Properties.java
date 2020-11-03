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
	
	public void addProperty(Boolean wifi, Boolean gym, Boolean furnished, int id, String location, Boolean vacancy, int price, int yearBuilt, int numBed, int numBath, Boolean washerAndDryer, Boolean pool, Boolean parking, Boolean pets, int vistaWS, int fpWS, int uscWS){
		
		propertiesList.add(new Property(wifi, gym, furnished, id, location, vacancy, price, yearBuilt, numBed,  numBath,  washerAndDryer,  pool, parking,  pets,  vistaWS,  fpWS, uscWS));
		DataWriter.saveProperties();
	}

}