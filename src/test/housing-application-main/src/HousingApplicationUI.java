import java.io.FileWriter;
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
		appInterface.run(); 
	}
	
	private void run() {
		boolean close = false;
		while(!close) {
			System.out.println();
			{
				System.out.println("Welcome to the Team-OSCAR Housing Application!");
				System.out.println("- You are currently operating as a Guest user");
				System.out.println("**********************************************");
				displayMainMenu(); 
				int userCommand = getUserCommand(mainMenuOptions.length);
				if(userCommand == mainMenuOptions.length -1) break;
			
				switch(userCommand) {
				case(0):
					login();
					break;
				case(1):
					searchProperties();
					System.out.println("Would you like to sign a lease for a property? (Type true if yes, and false if no)");
					boolean lease = scanner.nextBoolean();
					if(lease) signLease();
					break;
				case(2):
					reviewProperty();
					break;
				case(3):
					signLease();
					break;
				case(4):
					close = closeApp();
					break;
				}
			}
			if(tenant == true) {	
				displayMainMenuTenant(); 
				int userCommand1 = getUserCommand(mainMenuOptionsTenant.length);
				if(userCommand1 == mainMenuOptionsTenant.length -1) break;
			
				switch(userCommand1) {
				case(0):
					searchProperties();
					//signLease();
					break;
				case(1):
					reviewProperty();
					break;
				case(2):
					signLease();
					break;
				case(3):
					close = closeApp();
					break;
				}
			}
			else if(owner == true)
			{
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
				case(3):
					close = closeApp();
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
		int command = Integer.parseInt(input)-1;
		if(command >= 0 && command <= numCommands -1) return command;
		return -1;
	}
	private boolean closeApp() {
		return true;
	}
	boolean owner;
	boolean tenant;
	private void login() {
		System.out.println("\nSign in as tenant(1) or owner(2)? ");
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("1"))
		{
			tenant = true;
		}
		if(input.equalsIgnoreCase("2")) {
			owner = true;
		}
		int command = Integer.parseInt(input);
		switch(command) {
		case(1):
			System.out.print("Username: ");
			String username = scanner.nextLine();
			System.out.print("Password: ");
			String password = scanner.nextLine();
			//currentUser = application.loginTenant(username, password);
			ArrayList<User> foundTenant = application.login(username, password, owner);
			if(foundTenant!=null) {
				currentUser = application.loginTenant(username, password);
				System.out.println("Sucessfully logged in as: Tenant");
			}
			break;
		case(2):
			System.out.print("Username: ");
			String username0 = scanner.nextLine();
			System.out.print("Password: ");
			String password0 = scanner.nextLine();
			ArrayList<User> foundOwner = application.login(username0, password0, owner);
			if(foundOwner!=null) {
				currentUser = application.loginTenant(username0, password0);
				System.out.println("Sucessfully logged in as: Owner");
			}
			break;
			}
		}

	
	private void searchProperties() {
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
		
		for(int i = 0; i < found.size(); i++) {
			System.out.println("Apartment ID: " + found.get(i).getID());
			System.out.println("Address: " + found.get(i).getLocation());
			System.out.println("Price/month: $" + found.get(i).getPrice());
			System.out.println("Walk2Campus Score: " + found.get(i).getUscWS());
			System.out.println("Pet Friendly: " + found.get(i).getPets());
			System.out.println("Pool: "+ found.get(i).getPool());
			System.out.println("Washer and Dryer: " + found.get(i).getWasherAndDryer());
			System.out.println("Wifi: " + found.get(i).getWifi());
			System.out.println("Gym: " + found.get(i).getGym());
			System.out.println("Furnished: " + found.get(i).getFurnished());
			System.out.println();
		}
		
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
			System.out.println("Signing lease...");//TODO
		}
		else 
			System.out.println("Please login before signing a lease");
			
	}

	public void addProperty() {
		System.out.print("Enter location: ");
		String location = scanner.nextLine();
		System.out.print("Enter Vancancy: ");
		boolean Vacancy = scanner.nextBoolean();
		System.out.print("Enter price: ");
		int price  = scanner.nextInt();
		System.out.print("Enter year built: ");
		int yearBuilt = scanner.nextInt();
		System.out.print("Enter number of bedrooms: ");
		int numBed  = scanner.nextInt();
		System.out.print("Enter number of bathrooms: ");
		int numBath  = scanner.nextInt();
		System.out.print("Enter 'true' for if it has a washer and dryer or enter 'false' otherwise: ");
		boolean washerAndDryer = scanner.nextBoolean();
		System.out.print("Enter 'true' for if it has a pool or enter 'false' otherwise: ");
		boolean pool = scanner.nextBoolean();
		System.out.print("Enter 'true' for if it has a parking or enter 'false' otherwise: ");
		boolean parking = scanner.nextBoolean();
		System.out.print("Enter 'true' for if it is pet friendly location or enter 'false' otherwise: ");
		boolean pets = scanner.nextBoolean();
		System.out.print("Enter vista walk score: ");
		int vistaWS = scanner.nextInt();
		System.out.print("Enter five points walk score: ");
		int fpWS = scanner.nextInt();
		System.out.print("Enter USC walk score: ");
		int uscWS = scanner.nextInt();
		application.addProperty(location, Vacancy, price, yearBuilt, numBed, numBath, washerAndDryer, pool, parking, pets, vistaWS, fpWS, uscWS);
	}
	
	
	public void rateTenant() {
		
	}
	
	
}
