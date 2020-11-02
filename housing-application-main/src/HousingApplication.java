
import java.util.ArrayList; 


public class HousingApplication {
	private ArrayList<Tenant> tenants; 
	private ArrayList<Owner> owners;
	public ArrayList<Property> properties;
	
	public HousingApplication() {
		tenants = Database.getTenants();
		owners = Database.getOwners();
		properties = Database.getInstance().getProperties();
	}
	public Tenant loginTenant(String username, String password) {
		for(Tenant t : tenants) {
			if(t.getUserName().equals(username) && t.getPassword().equals(password)) return t;
		}
		return null;
	}
	
	public Owner loginOwner(String username, String password) {
		for(Owner o : owners) {
			if(o.getUserName().equals(username) && o.getPassword().equals(password)) return o;
		}
		return null;
	}
	public ArrayList<Property> searchProperties(int minPrice, int maxPrice, int numBed, int numBath, boolean washerAndDryer, boolean pool, boolean pets) {
		ArrayList<Property> found = new ArrayList<Property>();
		Property property;
		//DataLoader.loadListings();
		System.out.println("****** Properties that match your search: ******* ");
		for(int i = 0; i < properties.size(); i++) {
			property = properties.get(i);
			//System.out.println(property);
			if(property.getNumBed() == numBed && property.getNumBath() == numBath && property.getWasherAndDryer()==washerAndDryer&& property.getPool().booleanValue()==pool&& property.getPets()== pets)
			//&& property.getPool()== pool && property.getPets()== pets
			{
				found.add(property);
			}
		}
		System.out.println(found);
		return found;
	}
	public void loadProperties(Property Property)
	{
		DataLoader.loadListings();
	}
	
	public void reviewProperty(String property, String review) {
		for(Property p : properties) {
			if(p.getLocation().equals(property)) p.userReviews.add(review);
		}
	}
	
	public void signLease(Property property) {
		for(Property p : properties) {
			
		}
	}
	public static void addProperty(String location, boolean Vacancy, int price, int yearBuilt, int numBed, int numBath, boolean washerAndDryer, boolean pool, boolean parking, boolean pets, int vistaWS, int fpWS, int uscWS) {
		//Properties.addProperty(location, Vacancy, price, yearBuilt, numBed, numBath, washerAndDryer, pool, parking, pets, vistaWS, fpWS, uscWS);
		System.out.println("Property manager has addded a new unit!");
	}

}
