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
	
	public Hashtag() {
		super();
	}
	
	/**
	 * metodo che riempie l'hashmap di hashtag con il nome come chiave e qunate volte appare come valore
	 * @param array,array di post
	 * @return 
	 */
	public static HashMap<String, Integer> count() {
		HashMap<String,Integer> hashtag=new HashMap<>();
		ArrayList<Post> array;
		array=Storage.get_post();
		for(int k=0;k<array.size();k++) {
			if(!array.get(k).getMessage().isEmpty()) {
				String[] msg=array.get(k).getMessage().split("\n");//separa il messaggio a ogni #
				for(int i=0;i<msg.length;i++) {
					
					if(msg[i].charAt(0)=='#' ) {
						String[] hash=msg[i].split(" ");
						for(int j=0;j<hash.length;j++) {
							
							if(hashtag.containsKey(hash[j]))
							{
								int value=hashtag.get(hash[j])+1;
								hashtag.put(hash[j], value);
							}
							else
								hashtag.put(hash[j], 1);
							}	
						
						}	
				}
			
			}
		}

		return hashtag;
	}
}
