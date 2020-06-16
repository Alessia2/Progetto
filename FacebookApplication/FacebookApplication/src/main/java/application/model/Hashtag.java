package application.model;

import java.util.ArrayList;
import java.util.HashMap;

import application.util.Storage;
/**
 * class that describes the hashtags
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
public class Hashtag extends Post {
	
	public static HashMap<String,Integer> hashtag;
	
	public Hashtag() {
		super();
		hashtag=new HashMap<>();
	}
	
	/**
	 * metodo che riempie l'hashmap di hashtag con il nome come chiave e qunate volte appare come valore
	 * @param array,array di post
	 * @return 
	 */
	public static HashMap<String, Integer> count() {
		ArrayList<Post> array;
		array=Storage.get_post();
		String code=null;
		for(int k=0;k<array.size();k++) {
			String msg=array.get(k).getMessage();
			for(int i=0;i<msg.length();i++)
			{
				
				if(msg.charAt(i) == '#')
				{
						code=msg.substring(i);
				}
			}
			if(hashtag.containsKey(code))
			{
				int value=hashtag.get(code)+1;
				hashtag.put(code, value);
			}
			else
				hashtag.put(code, 1);
			
		}
		return hashtag;
	}
		
	

	



}
