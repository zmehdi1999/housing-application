import java.util.ArrayList;
public class Owner extends User{
	
	private ArrayList<Property> properties;
	public ArrayList<Owner> propertyOwners;
	private ArrayList<Double> ownerRatings;
	private ArrayList<String> ownerReviews;
	
	Owner(String firstName, String lastName, String userName, String email, String password, int phoneNum)
	{
		super(firstName, lastName, userName, email, password, phoneNum, true, true, 0);
	}
	

}
