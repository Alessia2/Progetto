package application.Exception;

/**
 *  classe che descrive l'eccezione dell'emoticon non presente nell'hashmap di emoticons
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 */
public class EmoticonNotFoundException extends Exception {
	/**
	 * costruttore della classe
	 */
	public EmoticonNotFoundException() {
		super();
		System.out.println("EMOTICON NON TROVATA");
	}

}
