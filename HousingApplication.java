
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
	
	public Property searchProperties() {
		
		return null;
	}
	
	public void rateProperty() {
		
	}
	
	public void signLease() {
		
	}
}
