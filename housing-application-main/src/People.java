import java.util.ArrayList;

public class People{
	private static People people = null;
	private static ArrayList<User> personList = new ArrayList<User>();
	
	private People() {
		personList = DataLoader.loadUsers();
	}
	
	public static People getInstance() {
		if(people == null) {
			people = new People();
		}
		
		return people;
	}
	
	public ArrayList<User> getPeople() {
		return personList;
	}
	
	public void addUser(String firstName, String lastName, String userName, String email, String password, int phoneNum, boolean registered, boolean owner, int rating) {
		personList.add(new User(firstName, lastName, userName,  email, password,  phoneNum, registered,  owner,  rating));
		DataWriter.savePeople();
	}
}
