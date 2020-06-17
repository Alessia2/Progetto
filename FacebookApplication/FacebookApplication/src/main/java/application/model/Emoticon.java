package application.model;

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
				String[] msg = array.get(k).getMessage().split("U+");// separa il messaggio a ogni #
				System.out.println(msg[0]);
				System.out.println(msg[1]);
				System.out.println(msg[2]);
				for (int i = 0; i < msg.length; i++) {

					if (msg[i].charAt(0) == 'U') {
						// String[] hash=msg[i].split(" ");
						for (int j = 0; j < msg.length; j++) {

							if (emoticon.containsKey(msg[j])) {
								int value = emoticon.get(msg[j]) + 1;
								emoticon.put(msg[j], value);
							} else
								emoticon.put(msg[j], 1);
						}

					}
				}
			}
		}
		return emoticon;
	}
}
