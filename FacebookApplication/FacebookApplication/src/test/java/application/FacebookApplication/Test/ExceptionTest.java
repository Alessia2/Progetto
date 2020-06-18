package application.FacebookApplication.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.Exception.EmoticonNotFoundException;
import application.Exception.HashtagNotFoundException;
import application.service.Filtersemoticon;
import application.service.Filtershash;

class ExceptionTest {
	private String text;
	private String emo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertThrows(HashtagNotFoundException.class,()->Filtershash.contain(text));
		assertThrows(EmoticonNotFoundException.class,()->Filtersemoticon.contain(emo));
	}

}
