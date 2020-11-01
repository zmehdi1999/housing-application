
import java.util.ArrayList;
import java.util.Scanner;

public class HousingApplicationUI  {
	private Scanner scanner;
	private HousingApplication application;
	private String[] mainMenuOptions = {"Login", "Search Properties","Review Property","Sign Lease","Close Application"};
	private String[] mainMenuOptionsTenant = {"Search Properties","Review Property","Sign Lease","Close Application"};
	private String[] mainMenuOptionsOwner = {"Add Property", "Rate Tenant","Sign Lease","Close Application"};
	private User currentUser = new User("guest", "user", "guestuser", "guestuser@gmail.com", "guest", 555555555, false, false, 0);
	
	public HousingApplicationUI(){
		scanner = new Scanner(System.in);
		application = new HousingApplication();
	}
	public static void main(String[] args) {
		HousingApplicationUI appInterface = new HousingApplicationUI();
		appInterface.run(); //error
	}
	
	private void run() {
		while(true) {
			System.out.println();
			{
				displayMainMenu(); 
				int userCommand = getUserCommand(mainMenuOptions.length);//error
				if(userCommand == mainMenuOptions.length -1) break;
			
				switch(userCommand) {
				case(0):
					login();
					break;
				case(1):
					searchProperties();
					break;
				case(2):
					reviewProperty();
					break;
				case(3):
					signLease();
					break;
				}
			}
			if(tenant == true) {	
				displayMainMenuTenant(); 
				int userCommand1 = getUserCommand(mainMenuOptionsTenant.length);//error
				if(userCommand1 == mainMenuOptionsTenant.length -1) break;
			
				switch(userCommand1) {
				case(0):
					searchProperties();
					break;
				case(1):
					reviewProperty();
					break;
				case(2):
					signLease();
					break;
				}
			}
			else{
				displayMainMenuOwner();
				int useCommand = getUserCommand(mainMenuOptionsOwner.length);
				if(useCommand == mainMenuOptionsOwner.length -1) break;
			
				switch(useCommand) {
				case(0):
					addProperty();
					break;
				case(1):
					rateTenant();
					break;
				case(2):
					signLease();
					break;
				}
				}break;
			}
		}
	private void displayMainMenu()
	{
		System.out.println("\nMain Menu:");
		for(int i=0; i< mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
		}
		System.out.println("\n");
	}
	
	private void displayMainMenuTenant() {
		System.out.println("\nTenant Main Menu:");
		for(int i=0; i< mainMenuOptionsTenant.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptionsTenant[i]);
		}
		System.out.println("\n");
	}
	
	private void displayMainMenuOwner() {
		System.out.println("\nOwner Main Menu:");
		for(int i=0; i< mainMenuOptionsOwner.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptionsOwner[i]);
		}
		System.out.println("\n");
	}
	
	private int getUserCommand(int numCommands) {
		System.out.println("\nWhat option would you like to pick?: ");
		String input = scanner.nextLine();
		int command = Integer.parseInt(input)-1; //error
		if(command >= 0 && command <= numCommands -1) return command;
		return -1;
	}
	boolean tenant;
	private void login() {
		System.out.println("\nSign in as tenant(1) or owner(2)? ");
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("1"))
		{
			tenant = true;
		}
		int command = Integer.parseInt(input);
		switch(command) {
		case(1):
			System.out.print("Username: ");
			String username = scanner.nextLine();
			System.out.print("Password: ");
			String password = scanner.nextLine();
			currentUser = application.loginTenant(username, password);
			break;
		case(2):
			System.out.print("Username: ");
			String usernameO = scanner.nextLine();
			System.out.print("Password: ");
			String passwordO = scanner.nextLine();
			currentUser = application.loginOwner(usernameO, passwordO);
			break;
		}
	}
	
	private String searchProperties() {
		System.out.print("Enter minimum price: ");
		int minPrice = scanner.nextInt();
		System.out.print("Enter maximum price: ");
		int maxPrice  = scanner.nextInt();
		System.out.print("Enter number of bedrooms: ");
		int numBed  = scanner.nextInt();
		System.out.print("Enter number of bathrooms: ");
		int numBath  = scanner.nextInt();
		System.out.print("Enter 'true' for if you want a washer and dryer or enter 'false' otherwise: ");
		boolean washerAndDryer = scanner.nextBoolean();
		System.out.print("Enter 'true' for if you want a pool or enter 'false' otherwise: ");
		boolean pool = scanner.nextBoolean();
		System.out.print("Enter 'true' for if you want a pet friendly location or enter 'false' otherwise: ");
		boolean pets = scanner.nextBoolean();
		ArrayList<Property> found = application.searchProperties(minPrice, maxPrice, numBed, numBath, washerAndDryer, pool, pets);
		if(found.toString()!=null) {
			return found.toString();
		}
		else
			return "Sorry! No properties found that match your search.";
	}
	
	private void reviewProperty() {
		System.out.print("Enter property location: ");
		String property = scanner.nextLine();
		System.out.print("Enter property review: ");
		String review = scanner.nextLine();
		application.reviewProperty(property, review);
	}
	
	private void signLease() {
		if(currentUser.getRegistered()) {
			
		}
		else 
			System.out.println("Please login before signing a lease");
			
	}
	
	public void addProperty() {
		
	}
	
	public void rateTenant() {
		
	}
	
	
}
