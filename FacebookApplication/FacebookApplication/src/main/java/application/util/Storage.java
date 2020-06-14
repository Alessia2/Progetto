package application.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.json.JSONException;

import application.model.Metadata;
import application.model.Post;

/**
 * classe che gestisce oggetti di Post e Metedata
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
public class Storage {
	
	public static ArrayList<Metadata> metadata = new ArrayList<Metadata>();
	public static ArrayList<Post> post = new ArrayList<Post>(); // static poichè comune a tutte le istanze della classe
	
	/**
	 * dopo il parsing salvo l'array dei posts 
	 * @param str, url per fare il parsing
	 * @return post, array di post
	 */
	public static ArrayList<Post> fill_post(String str) throws MalformedURLException, IOException, JSONException {// lavora con variabili statiche
		
		try {
			post = Parsing.getPost(str);
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
		return post;
		
		
	}
	/**
	 * crea array di metadata
	 * @return metadata, array di metadata
	 */
	public static ArrayList<Metadata> fill_metadata(){
		metadata.add(new Metadata("id", "String", "identificator"));
		metadata.add(new Metadata("message", "String", "description of the post"));
		return metadata;
	}

}
