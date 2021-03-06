package application.FacebookApplication.controller;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.Exception.EmoticonNotFoundException;
import application.Exception.HashtagNotFoundException;
import application.model.Metadata;
import application.model.Post;
import application.util.Storage;
import application.service.FilterDouble;
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
	
	/**
	 * statistiche sugli hashtag
	 * @return s1,array contenente gli hashtag piu/meno usati
	 * 
	 */
	@GetMapping("/statshash")
	public String Statshash() {
		Statshash s1= new Statshash();
		return s1.max_key()+Statshash.max_hashtag()+"\n"+s1.min_key()+Statshash.min_hashtag()+"\n"+s1.tot()+"\n"+s1.numH();
		
	}
	/**
	 * statistiche sulle emoticon
	 * @return s2,array delle emoticon più/meno usate
	 */
	@GetMapping("/statsemoticons")
	public String Statsemoticons() {
		Statsemoticon s2= new Statsemoticon();
		return s2.max_key()+Statsemoticon.max_emoticon()+"\n"+s2.min_key()+Statsemoticon.min_emoticon()+"\n"+s2.tot()+"\n"+s2.numE();
	}
	
	/**
	 * filtri sugli hashtag
	 * @param param1,hashtag passato per la ricerca
	 * @return tutti i post in cui compare l'hashtag passato come parametro
	 */
	@GetMapping("/filhash")
	public ArrayList<Post> filterHashtag(@RequestParam(name="param1")String param1) {
		try {
			return Filtershash.contain(param1);
		} catch (HashtagNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * filtri sulle emoticon
	 * @param param1,emoticon passata pr la ricerca
	 * @return tutti i post in cui compare l'emoticon passata come parametro
	 */
	@GetMapping("/filemo")
	public ArrayList<Post> filterEmoticon(@RequestParam(name="param1")String param1){
		try {
			return Filtersemoticon.contain(param1);
		} catch (EmoticonNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 
	 * @param param1,hashtag secondo il quale si vuole filtrare
	 * @param param2,emoticon secondo la quale si vuole filtrare
	 * @return tutti i post che contengono  l'hashtag e l'emoticon passata
	 */
	@GetMapping("/FilterDouble")
	public ArrayList<Post> FilDoub(@RequestParam(name="param1")String param1, @RequestParam(name="param2")String param2){
		try {
			return FilterDouble.FilDouble(param1,param2);
		} catch (EmoticonNotFoundException | HashtagNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}

