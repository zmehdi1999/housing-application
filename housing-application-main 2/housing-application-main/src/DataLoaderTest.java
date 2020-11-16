

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTest {
	private People people = People.getInstance();
	private ArrayList<User> userList = people.getPeople();
	private Properties properties = Properties.getInstance();
	private ArrayList<Property> propertyList = properties.getProperties();
	
	@BeforeEach
	public void setup() {
		People.getInstance().getPeople().clear();
		userList.add(new User("Emily", "Smith", "esmith", "esmith@gmail.com", "12345", 0, true, false, 0));
		DataWriter.savePeople();
		Properties.getInstance().getProperties().clear();
		propertyList.add(new Property(true, true, true, 23, "123 Street St.", true, 100, 2000, 1, 1, true, true, true, true, 1, 2, 3));
		DataWriter.saveProperties();
	}
	
	@Test
	void testGetUsersSize() {
		userList = DataLoader.loadUsers();
		assertEquals(1,userList.size());
	}
		
	@Test
	void testGetUsersSizeZero() {
		People.getInstance().getPeople().clear();
		DataWriter.savePeople();
		assertEquals(0, userList.size());
	}
	
	@Test
	void testLoadListings() {
		propertyList = DataLoader.loadListings();
		assertEquals(1, propertyList.size());
	}
	
	@Test
	void testLoadListingsZero() {
		Properties.getInstance().getProperties().clear();
		DataWriter.saveProperties();
		assertEquals(0, propertyList.size());
	}
	
	@AfterEach
	public void tearDown() {
		People.getInstance().getPeople().clear();
		DataWriter.savePeople();
		Properties.getInstance().getProperties().clear();
		DataWriter.saveProperties();
	}

}
