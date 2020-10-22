package housingapplication;

import java.util.Scanner;

public class HousingApplicationUI {
	private Scanner scanner;
	private HousingApplication application;
	
	HousingApplicationUI(){
		scanner = new Scanner(System.in);
		application = new HousingApplication();
	}
	
	private void run() {
		
	}
	
	private int getUserCommand(int numCommands) {
		
		return -1;
	}
	
	private boolean searchProperties() {
		
		return true;
	}
	
	public static void main(String[] args) {
		HousingApplicationUI appInterface = new HousingApplicationUI();
		appInterface.run();
	}
}
