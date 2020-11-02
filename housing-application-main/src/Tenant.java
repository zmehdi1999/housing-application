import java.util.ArrayList;

public class Tenant extends User {

	
	private ArrayList<Property> favorites;
	public ArrayList<Tenant> tenants;
	private ArrayList <Double> tenantRating;
	private ArrayList <String> tenantReview;
	
	Tenant(String firstName, String lastName, String userName, String email, String password, int phoneNum) {
		super(firstName, lastName, userName, email, password, phoneNum, true, false, 0);
	}
	/*
	public void addTenant(Tenant tenant)
	{
		
	}
	public void removeTenant(Tenant tenant)
	{
		
	}
	private void addFavorite(Property property)
	{
		
	}
	private void removeFavorite(Property property)
	{
		
	}
	private Property rateProperty(Property property)
	{
		return property;
	}
	private Property reviewProperty(Property property)
	{
		return property;
	}
	private Owner rateOwner(Owner owner)
	{
		return owner;
	}
	private Owner reviewOwner(Owner owner)
	{
		return owner;
	}
	private void viewListing(Property property)
	{
		
	}
	private Property signListing(Property property)
	{
		return property;
	}
	private double calculateRating()
	{
		return rating;
	}
	private String showReviews()
	{
		return null;
	}*/
	
}