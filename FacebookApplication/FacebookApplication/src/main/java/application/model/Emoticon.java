package application.model;

//import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
				Pattern pattern = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",
                        Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
				//Pattern pattern = Pattern.compile("(?:[\\u2700-\\u27bf]|(?:\\ud83c[\\udde6-\\uddff]){2}|[\\ud800-\\udbff][\\udc00-\\udfff]|[\\u0023-\\u0039]\\ufe0f?\\u20e3|\\u3299|\\u3297|\\u303d|\\u3030|\\u24c2|\\ud83c[\\udd70-\\udd71]|\\ud83c[\\udd7e-\\udd7f]|\\ud83c\\udd8e|\\ud83c[\\udd91-\\udd9a]|\\ud83c[\\udde6-\\uddff]|[\\ud83c[\\ude01-\\ude02]]|\\ud83c\\ude1a|\\ud83c\\ude2f|[\\ud83c[\\ude32-\\ude3a]]|[\\ud83c[\\ude50-\\ude51]]|\\u203c|\\u2049|[\\u25aa-\\u25ab]|\\u25b6|\\u25c0|[\\u25fb-\\u25fe]|\\u00a9|\\u00ae|\\u2122|\\u2139|\\ud83c\\udc04|[\\u2600-\\u26FF]|\\u2b05|\\u2b06|\\u2b07|\\u2b1b|\\u2b1c|\\u2b50|\\u2b55|\\u231a|\\u231b|\\u2328|\\u23cf|[\\u23e9-\\u23f3]|[\\u23f8-\\u23fa]|\\ud83c\\udccf|\\u2934|\\u2935|[\\u2190-\\u21ff])");
				Matcher matcher = pattern.matcher(msg);
				ArrayList<String> matchList = new ArrayList<String>();
				while(matcher.find()) {
					
					matchList.add(matcher.group());
				}
				for(int i = 0; i<matchList.size(); i++) {
			
					if(emoticon.containsKey(matchList.get(i))) {
						int value = emoticon.get(matchList.get(i))+1;
						emoticon.put(matchList.get(i), value);
						
					}
					else 
						emoticon.put(matchList.get(i), 1);
				
				}
				//for (int i = 0; i < msg.length(); i++) {
					
					/*if(msg.contains(emoji[0]))
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
