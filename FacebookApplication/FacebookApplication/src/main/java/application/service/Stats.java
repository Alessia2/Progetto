package application.service;



/**
 * interfaccia per i metodi max_key() e min_key() relativi alle statistiche di hashtag ed emoticon
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
public interface Stats {
	public String max_key();
	public String min_key();
	public String tot();

}
