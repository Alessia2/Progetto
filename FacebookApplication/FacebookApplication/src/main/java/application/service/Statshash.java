package application.service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Objects;

import java.util.Vector;


import application.model.Hashtag;


public class Statshash {


	/**
	 * metodo che cerca la/gli hashtag più usato/i
	 * @return quante volte è stato usto/i
	 */
	public static int max_hashtag() {
		HashMap<String, Integer> h;
		h = Hashtag.count();
		int max = 0;

		Collection<Integer> values = h.values();
		Iterator<Integer> i = values.iterator();
		while (i.hasNext()) {
			int tmp = i.next();
			if (max < tmp)
				max = tmp;
		}
		return max;

	}

	/**
	 * metodo che cerca la/gli hashtag più usato/i  nell'hashmap
	 * @return stampa la/gli hashtag più usato/i
	 */
	public String max_key() {
		HashMap<String, Integer> h;
		h = Hashtag.count();

		Vector<String> key = new Vector<String>();
		int MAX = max_hashtag();

		for (Entry<String, Integer> entry : h.entrySet()) {
			if (Objects.equals(MAX, entry.getValue())) {
				key.add(entry.getKey());

			}
		}
		return "Gli hashtags più usati sono: " + key.toString() + "\nUsati: ";
	}

	/**
	 * metodo che cerca la/gli hashtag meno usato/i
	 * @return quante volte è stato usto/i
	 */
	public static int min_hashtag() {
		HashMap<String, Integer> h;
		h = Hashtag.count();
		int min = max_hashtag();
		Collection<Integer> values = h.values();
		Iterator<Integer> i = values.iterator();
		while (i.hasNext()) {
			int tmp = i.next();
			if (min > tmp)
				min = tmp;
		}
		return min;
	}

	/**
	 * metodo che cerca la/gli hashtag meno usato/i  nell'hashmap
	 * @return stampa la/gli hashtag meno usato/i
	 */
	public String min_key() {
		HashMap<String, Integer> h;
		h = Hashtag.count();
		Vector<String> key = new Vector<String>();
		int MIN = min_hashtag();

		for (Entry<String, Integer> entry : h.entrySet()) {
			if (Objects.equals(MIN, entry.getValue())) {
				key.add(entry.getKey());

			}
		}
		return "Gli hashtags meno usati sono: " + key.toString() + "\nUsati: ";
	}
}
