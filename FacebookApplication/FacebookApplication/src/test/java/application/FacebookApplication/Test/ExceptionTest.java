package application.FacebookApplication.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import application.Exception.HashtagNotFoundException;
import application.service.*;

abstract class ExceptionTest {
	private String text;

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		assertThrows(HashtagNotFoundException.class,()->Filtershash.contain(text));
	}

	

}
