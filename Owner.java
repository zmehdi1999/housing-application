import java.util.ArrayList;
public class Owner extends User{
	
	private ArrayList<Property> properties;
	public ArrayList<Owner> propertyOwners;
	private ArrayList<Double> ownerRatings;
	private ArrayList<String> ownerReviews;
	
	Owner(String firstName, String lastName, String userName, String email, String password, int phoneNum)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
	}
	public void addOwner(Owner owner)
	{
		
	}
	public void removeOwner(Owner owner)
	{
		
	}
	private void addProperty()
	{
		
	}
	private void removeProperty()
	{
		
	}
	private Tenant rateTentant(Tenant tenant)
	{
		return tenant;
	}
	private Tenant reviewTenant(Tenant tenant)
	{
		return tenant;
	}
	private double calculateRating()
	{
		return rating;
	}
	private String showReviews()
	{
		return null;
	}
}
