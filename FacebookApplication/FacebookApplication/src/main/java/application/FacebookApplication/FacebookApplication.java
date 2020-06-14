package application.FacebookApplication;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import application.util.Storage;

/**
 * Spring Boot Application
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
@SpringBootApplication
public class FacebookApplication {

	public static void main(String[] args) throws MalformedURLException,IOException,JSONException  {
		try {
			Storage.fill_post("https://graph.facebook.com/v7.0/106676254404182/feed?access_token=EAAD21gdlzPcBAA8rIqD9K7VHPpOOyBboGGPQRG1h1lkYd0HKezdVNwTugU1K6xE7HGZANncLoN8D7x6ggXZBjqCzRFu70oxDO1IYQel1lE1hkMvUhkr64TjBzov1dB9CHxnJMIQ5s5nZCDKKlfP09ibU7Ewmhq8A4SW4gZB7CdUv64cT2dGDciMYaZCVaQdwZD");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SpringApplication.run(FacebookApplication.class, args);
	}

}
