

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTest {
	private People people = People.getInstance();
	private ArrayList<User> userList = people.getPeople();
	private Properties properties = Properties.getInstance();
	private ArrayList<Property> propertyList = properties.getProperties();
	
	@BeforeEach
	public void setup() {
		People.getInstance().getPeople().clear();
		DataWriter.savePeople();
	}
	
	@AfterEach
	public void tearDown() {
		People.getInstance().getPeople().clear();
		DataWriter.savePeople();
	}
	
	@Test
	void testSaveZeroPeople() {
		userList = DataLoader.loadUsers();
		assertEquals(0, userList.size());
	}
	
	@Test
	void testSaveOnePeople() {
		userList.add(new User("Emily", "Smith", "esmith", "esmith@gmail.com", "12345", 0, true, false, 0));
		DataWriter.savePeople();
		assertEquals("esmith", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testSaveThreePeople() {
		userList.add(new User("Emily", "Smith", "esmith", "esmith@gmail.com", "12345", 0, true, false, 0));
		userList.add(new User("Emily", "Smith", "asmith", "esmith@gmail.com", "12345", 0, true, false, 0));
		userList.add(new User("Emily", "Smith", "bsmith", "esmith@gmail.com", "12345", 0, true, false, 0));
		DataWriter.savePeople();
		assertEquals("asmith", DataLoader.loadUsers().get(1).getUserName());
	}
	
	@Test
	void testSaveEmptyPeople() {
		userList.add(new User("", "", "", "", "", 0, false, false, 0));
		DataWriter.savePeople();
		assertEquals("", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testSaveNullPeople() {
		userList.add(new User("", "", null, "", "", 0, false, false, 0));
		DataWriter.savePeople();
		assertEquals("", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testSaveZeroProperties() {
		propertyList = DataLoader.loadListings();
		assertEquals(0, propertyList.size());
	}
	
	@Test
	void testSaveOneProperties() {
		propertyList.add(new Property(true, true, true, 23, "123 Street St.", true, 100, 2000, 1, 1, true, true, true, true, 1, 2, 3));
		DataWriter.saveProperties();
		assertEquals("123 Street St.", DataLoader.loadListings().get(0).getLocation());
	}
	
	@Test
	void testSaveThreeProperties() {
		propertyList.add(new Property(true, true, true, 23, "123 Street St.", true, 100, 2000, 1, 1, true, true, true, true, 1, 2, 3));
		propertyList.add(new Property(true, true, true, 23, "123 Avenue Ave.", true, 100, 2000, 1, 1, true, true, true, true, 1, 2, 3));
		propertyList.add(new Property(true, true, true, 23, "123 Court Ct.", true, 100, 2000, 1, 1, true, true, true, true, 1, 2, 3));
		DataWriter.saveProperties();
		assertEquals("123 Court Ct.", DataLoader.loadListings().get(2).getLocation());
	}
	
	@Test
	void testSaveEmptyProperties() {
		propertyList.add(new Property(false, false, false, 0, "", false, 0, 0, 0, 0, false, false, false, false, 0, 0, 0));
		DataWriter.saveProperties();
		assertEquals("", DataLoader.loadListings().get(0).getLocation());
	}
	
	@Test
	void testSaveNullProperties() {
		propertyList.add(new Property(false, false, false, 0, null, false, 0, 0, 0, 0, false, false, false, false, 0, 0, 0));
		DataWriter.saveProperties();
		assertEquals(null, DataLoader.loadListings().get(0).getLocation());
	}
	
}
