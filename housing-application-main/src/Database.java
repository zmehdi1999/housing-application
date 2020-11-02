
import java.util.ArrayList;

public class Database {
	private ArrayList<Property> properties;
	private static Database database;
	
	private Database()
	{
		properties = DataLoader.loadListings();
	}
	public static Database getInstance(){
		if(database==null)
		{
			database = new Database();
		}
		return database;
	}
	
	public static ArrayList<Tenant> getTenants(){
		return new ArrayList<Tenant>();
	}
	
	public static ArrayList<Owner> getOwners(){
		return new ArrayList<Owner>();
	}
	
	public ArrayList<Property> getProperties(){
		return properties;
	}
	public static ArrayList<User> getUsers(){
		return new ArrayList<User>();
	}
	


}
