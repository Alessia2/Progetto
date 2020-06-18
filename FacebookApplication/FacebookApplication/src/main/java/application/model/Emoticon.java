package application.model;

//import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import application.util.Storage;

/**
 * classe che descrive le emoticons
 * 
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
public class Emoticon extends Post {

	/**
	 * costruttore della classe
	 */
	public Emoticon() {
		super();
	}

	/**
	 * metodo che riempie l'hashmap di emoticon inserendo il nome, ovvero il codice
	 * unicode, come chiave e quante volte appare come valore
	 * 
	 * @return emoticon, hashmap di emoticon
	 */
	public static HashMap<String, Integer> count() {
		HashMap<String, Integer> emoticon = new HashMap<>();
		ArrayList<Post> array = Storage.get_post();
		for (int k = 0; k < array.size(); k++) {
			if (!array.get(k).getMessage().isEmpty()) {
				String msg = array.get(k).getMessage();
				Pattern pattern = Pattern.compile(
						"[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]|[\u2700-\u27bf]|\u2b07\ufe0f|\ud83e\udd29|\ud83e\udda0|\ud83e\udde0|\ud83d\ude34",
						Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(msg);
				ArrayList<String> matchList = new ArrayList<String>();
				while (matcher.find()) {
					matchList.add(matcher.group());
				}
				for (int i = 0; i < matchList.size(); i++) {
					if (emoticon.containsKey(matchList.get(i))) {
						int value = emoticon.get(matchList.get(i)) + 1;
						emoticon.put(matchList.get(i), value);
					} else
						emoticon.put(matchList.get(i), 1);
				}
			}
		}
		return emoticon;
	}
}
