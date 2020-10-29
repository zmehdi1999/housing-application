
import java.util.ArrayList; 

public class HousingApplication{
	private ArrayList<Tenant> tenants; 
	private ArrayList<Owner> owners;
	private ArrayList<Property> properties;
	
	public HousingApplication() {
		tenants = Database.getTenants();
		owners = Database.getOwners();
		properties = Database.getProperties();
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
	
	public ArrayList<Property> searchProperties(int minPrice, int maxPrice, int numBed, int numBath, boolean washerAndDryer, boolean pool, boolean lawnCare) {
		ArrayList<Property> found = new ArrayList<Property>();
		Property property;
		for(int i = 0; i < properties.size(); i++) {
			property = properties.get(i);
			if(property.getPrice() >= minPrice && property.getPrice() <= maxPrice);
			else continue;
			if(property.getNumBed() == numBed);
			else continue;
			if(property.getNumBath() == numBath);
			else continue;
			if(property.getWasherAndDryer() != null && washerAndDryer == true);
			else continue;
			if(property.getPool() != null && pool == true);
			else continue;
			if(property.getLawncare() != null && lawnCare == true);
			else continue;
			found.add(property);
		}
		return found;
	}
	
	public void reviewProperty(Property property, String review) {
		for(Property p : properties) {
			if(p.equals(property)) p.userReviews.add(review);
		}
	}
	
	public void signLease(Property property) {
		for(Property p : properties) {
			
		}
	}
}
