

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HousingApplicationTest {
	private HousingApplication app = new HousingApplication();
	private People people = People.getInstance();
	private ArrayList<User> userList = people.getPeople();
	private Properties properties = Properties.getInstance();
	private ArrayList<Property> propertyList = properties.getProperties();
	
	@BeforeEach
	public void setup() {
		People.getInstance().getPeople().clear();
		DataWriter.savePeople();
		Properties.getInstance().getProperties().clear();
		DataWriter.saveProperties();
	}
	
	@AfterEach
	public void tearDown() {
		People.getInstance().getPeople().clear();
		DataWriter.savePeople();
		Properties.getInstance().getProperties().clear();
		DataWriter.saveProperties();
	}
	
	@Test
	void testLoginTenant() {
		
	}
	
	@Test
	void testLoginOwner() {
		
	}
	
	@Test
	void testSearchProperties() {
		propertyList.addAll(app.searchProperties(0, 99999, 1, 1, true, true, true));
		
	}
	
	@Test
	void testLogin() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLoadProperties() {
		fail("Not yet implemented");
	}
	
	@Test
	void testReviewProperties() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAddProperty() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCreateAccount() {
		fail("Not yet implemented");
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
