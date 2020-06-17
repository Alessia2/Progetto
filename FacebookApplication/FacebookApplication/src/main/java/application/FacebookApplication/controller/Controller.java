package application.FacebookApplication.controller;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import application.model.Metadata;
import application.model.Post;
import application.util.Storage;
import application.service.Statsemoticon;
import application.service.Statshash;

/**
 * Controller
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
@RestController
public class Controller {
	/**
	 * Post pubblicati con id e message
	 * @return elenco dei post
	 */
	@GetMapping("/post")
	public ArrayList<Post> getArrayPost(){
		return Storage.get_post();
	}
	
	/**
	 * elenco metadata
	 * @return elenco dei metadata
	 */
	@GetMapping("/metadata")
	public ArrayList<Metadata> getArrayMetadata(){
		return Storage.fill_metadata();
	}
	@GetMapping("/statshash")
	public String Statshash() {
		Statshash s1= new Statshash();
		return s1.max_key()+Statshash.max_hashtag()+"\n"+s1.min_key()+Statshash.min_hashtag();
		
	}
	@GetMapping("/statsemoticons")
	public String Statsemoticons() {
		Statsemoticon s2= new Statsemoticon();
		return s2.max_keye()+Statsemoticon.max_emoticon()+"\n"+s2.min_keye()+Statsemoticon.min_emoticon();
	}

}
