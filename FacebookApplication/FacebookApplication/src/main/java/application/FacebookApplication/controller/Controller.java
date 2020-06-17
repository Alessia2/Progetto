package application.FacebookApplication.controller;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import application.model.Metadata;
import application.model.Post;
import application.util.Storage;
import application.service.Filtersemoticon;
import application.service.Filtershash;
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
		return s2.max_e()+Statsemoticon.max_emoticon()+"\n"+s2.min_e()+Statsemoticon.min_emoticon();
	}
	@GetMapping("/filhash")
	public ArrayList<Post> filterHashtag(@RequestParam(name="param1")String param1) {
		return Filtershash.contain(param1);
	}
	
	@GetMapping("/filemo")
	public ArrayList<Post> filterEmoticon(@RequestParam(name="param1")String param1){
		return Filtersemoticon.contains(param1);
	}


}
