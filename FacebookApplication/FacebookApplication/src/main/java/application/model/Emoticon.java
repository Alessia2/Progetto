package application.model;

//import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.HashMap;

import application.util.Storage;

/**
 * class that describes the emoticons
 * 
 * @author Flavai Gioiello
 * @author Alessia Castagnolo
 *
 */
public class Emoticon extends Post {
	static String[] emoji = {"\\u2b07\\ufe0f", "\\ud83d\\udc1d"};

	public Emoticon() {
		super();

	}

	/**
	 * metodo che riempie l'hashmap di emoticon inserendo il nome come chiave e
	 * quante volte appare come valore
	 * 
	 * @param post, array di post
	 * @return 
	 * 
	 */
	public static HashMap<String, Integer> count() {
		HashMap<String, Integer> emoticon = new HashMap<>();
		ArrayList<Post> array = Storage.get_post();
		for (int k = 0; k < array.size(); k++) {
			if (!array.get(k).getMessage().isEmpty()) {
				//String[] msg = array.get(k).getMessage().split("");// separa il messaggio a ogni #
				String msg = array.get(k).getMessage();
				//for (int i = 0; i < msg.length(); i++) {
					
					if(msg.contains(emoji[0]))
						emoticon.put(emoji[0], 1);
					if(msg.contains(emoji[1]))
						emoticon.put(emoji[1], 1);
System.out.println(emoticon);
					//if (msg[i].charAt(0) == 'u') {
						// String[] hash=msg[i].split(" ");
						/*for (int j = 0; j < msg.length; j++) {

							if (emoticon.containsKey(msg[j])) {
								int value = emoticon.get(msg[j]) + 1;
								emoticon.put(msg[j], value);
							} else
								emoticon.put(msg[j], 1);*/
					

				
			
			}
			}
		return emoticon;
	}
}
