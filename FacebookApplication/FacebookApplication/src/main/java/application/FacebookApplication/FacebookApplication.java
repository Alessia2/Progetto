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
					"https://graph.facebook.com/v7.0/106676254404182/feed?access_token=EAAD21gdlzPcBAJrF7F3yGAg41jVr9NDxjrbFj55jO6pBHy2o4heDsPsKaRdT6PhAvzLI12DZAAYOaR8jX3vTO2sXyQj1gafKvw5aCOGuzwi1wDQ6q34nELdIongjXmlUbFBADssvZCB6YDsDWkVwqeDZCevawOGxb43o4Gsz6gNNUJvR91Slegqzyp85G4ZD");
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
