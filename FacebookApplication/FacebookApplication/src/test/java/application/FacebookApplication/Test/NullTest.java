package application.FacebookApplication.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import application.model.Hashtag;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NullTest {
	
	private HashMap<String,Integer> h=Hashtag.count();
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		assertNotNull(h);
	}


}
