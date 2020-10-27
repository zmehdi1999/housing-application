
import java.util.Scanner;

public class HousingApplicationUI {
	private Scanner scanner;
	private HousingApplication application;
	private String[] mainMenuOptions = {"Login","Search Properties","Review Property","Sign Lease","Close Application"};
	
	HousingApplicationUI(){
		scanner = new Scanner(System.in);
		application = new HousingApplication();
	}
	
	private void run() {
		while(true) {
			System.out.println();
			displayMainMenu();
			int userCommand = getUserCommand(mainMenuOptions.length);
			
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
	}
	
	private void displayMainMenu() {
		System.out.println("\nMain Menu:");
		for(int i=0; i< mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
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
		
	}
	
	private boolean searchProperties() {
		
		return true;
	}
	
	private void reviewProperty() {
		
	}
	
	private void signLease() {
		
	}
	
	public static void main(String[] args) {
		HousingApplicationUI appInterface = new HousingApplicationUI();
		appInterface.run();
	}
}
