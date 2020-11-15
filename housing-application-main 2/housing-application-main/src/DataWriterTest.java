

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTest {
	private People people = People.getInstance();
	private ArrayList<User> userList = people.getPeople();
	
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
	void test() {
		fail("Not yet implemented");
	}

}
