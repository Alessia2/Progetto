package application.service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Objects;

import java.util.Vector;


import application.model.Hashtag;


public class Statshash {


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
