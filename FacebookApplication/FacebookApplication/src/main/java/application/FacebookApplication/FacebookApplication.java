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
			Storage.fill_post(
					"https://graph.facebook.com/v7.0/106676254404182/feed?access_token=EAAD21gdlzPcBALj274OHcjcAW6Xj6Y4AkUfQ7C5SUNIcsFKOhwXD5othJjh6edDmrCi4V4E1WPdiPZCKD52tngVudKE2csvR8rQ14WmeA2FJIUQGdYSqOL7ZC2viv60pWn2D4rAZBfOG5KNcpOk4KfABjffWJN3ZAgqFnt66ugZDZD");
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
