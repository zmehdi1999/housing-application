
import java.util.ArrayList;
import java.util.Scanner;

public class HousingApplicationUI  {
	private Scanner scanner;
	private HousingApplication application;
	private String[] mainMenuOptionsTenant = {"Login","Search Properties","Review Property","Sign Lease","Close Application"};
	private String[] mainMenuOptionsOwner = {"Login","Add Property", "Rate Tenant","Sign Lease","Close Application"};
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
		while(true) {
			System.out.println();
			if(currentUser.getTenant()) {
				displayMainMenuTenant();
				int userCommand = getUserCommand(mainMenuOptionsTenant.length);
			
				if(userCommand == mainMenuOptionsTenant.length -1) break;
			
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
			if(currentUser.getOwner()) {
				displayMainMenuOwner();
				int userCommand = getUserCommand(mainMenuOptionsOwner.length);
			
				if(userCommand == mainMenuOptionsOwner.length -1) break;
			
				switch(userCommand) {
				case(0):
					login();
					break;
				case(1):
					addProperty();
					break;
				case(2):
					rateTenant();
					break;
				case(3):
					signLease();
					break;
				}
			}
		}
	}
	
	private void displayMainMenuTenant() {
		System.out.println("\nMain Menu:");
		for(int i=0; i< mainMenuOptionsTenant.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptionsTenant[i]);
		}
		System.out.println("\n");
	}
	
	private void displayMainMenuOwner() {
		System.out.println("\nMain Menu:");
		for(int i=0; i< mainMenuOptionsOwner.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptionsOwner[i]);
		}
		System.out.println("\n");
	}
	
	private int getUserCommand(int numCommands) {
		System.out.println("\nWhat option would you like to pick?: ");
		String input = scanner.nextLine();
		int command = Integer.parseInt(input) - 1;
		if(command >= 0 && command <= numCommands -1) return command;
		return -1;
	}
	
	private void login() {
		System.out.println("\nSign in as tenant(1) or owner(2)? ");
		String input = scanner.nextLine();
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
		System.out.print("Enter 'true' for if you want a washer and dryer and enter 'false' otherwise: ");
		boolean washerAndDryer = scanner.nextBoolean();
		System.out.print("Enter 'true' for if you want a pool and enter 'false' otherwise: ");
		boolean pool = scanner.nextBoolean();
		System.out.print("Enter 'true' for if you want lawncare and enter 'false' otherwise: ");
		boolean lawnCare = scanner.nextBoolean();
		ArrayList<Property> found = application.searchProperties(minPrice, maxPrice, numBed, numBath, washerAndDryer, pool, lawnCare);
		return found.toString();
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
