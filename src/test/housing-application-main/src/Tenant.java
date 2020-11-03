import java.util.ArrayList;

public class Tenant extends User {

	
	private ArrayList<Property> favorites;
	public ArrayList<Tenant> tenants;
	private ArrayList <Double> tenantRating;
	private ArrayList <String> tenantReview;
	
	Tenant(String firstName, String lastName, String userName, String email, String password, int phoneNum) {
		super(firstName, lastName, userName, email, password, phoneNum, true, false, 0);
	}
	
	
}