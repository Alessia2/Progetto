package application.FacebookApplication.controller;



import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Metadata;
import application.model.Post;
import application.util.Storage;

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
	@GetMapping("/stat")
	public String Statistics() {
		return application.service.Statistics.max_hashtag();
	}

}
