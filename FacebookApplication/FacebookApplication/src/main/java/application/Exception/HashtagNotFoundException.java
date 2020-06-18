package application.Exception;

/** classe che descrive l'eccezione dell'hashtag non presente nell'hashmap di hashtags
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
public class HashtagNotFoundException extends Exception {
	/**
	 * costruttore della classe
	 */

	public HashtagNotFoundException() {
		super();
		System.out.println("HASHTAG NON TROVATO");

	}

}
