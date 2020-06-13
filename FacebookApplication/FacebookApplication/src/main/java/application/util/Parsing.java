package application.util;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import application.model.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * classe per il parsing dato url sorgente
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 */
public class Parsing  {
	/**
	 * metodo di parsing per la creazione di arraylist di post
	 * @param link, da dove otteniamo la stringa per effettuare una richiesta get per il parsing
	 * @return arraylist di post
	 */
	public static ArrayList<Post> getPost(String link) throws MalformedURLException, IOException, JSONException {
		String url = null;
		ArrayList<Post> post = new ArrayList<Post>();
	
		try {
			url = Reading.read_url(link);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject object = null;
		try {
			object = new JSONObject(url);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONArray array = object.getJSONArray("data");// data è l'array json restituito da postman
		
		for(int i=0; i<array.length(); i++) {
			JSONObject o = object.getJSONArray("data").getJSONObject(i); // prende l'elemento in posizione i dell'array data e lo mette in o
			ObjectMapper m = new ObjectMapper();
			m.findAndRegisterModules(); //registra i post in ordine di data
			Post p = m.readValue(o.toString(), Post.class);
			post.add(p);
		}
		return post;
		
	}

}
