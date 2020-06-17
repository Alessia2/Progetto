package application.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;
import java.util.Map.Entry;

import application.model.Emoticon;


public class Statsemoticon {

	public static int max_emoticon() {
		HashMap<String, Integer> e;
		e = Emoticon.count();
		int max = 0;

		Collection<Integer> values = e.values();
		Iterator<Integer> i = values.iterator();
		while (i.hasNext()) {
			int tmp = i.next();
			if (max < tmp)
				max = tmp;
		}
		return max;

	}

	public String max_e() {
		HashMap<String, Integer> e;
		e = Emoticon.count();

		Vector<String> key = new Vector<String>();
		int MAX = max_emoticon();

		for (Entry<String, Integer> entry : e.entrySet()) {
			if (Objects.equals(MAX, entry.getValue())) {
				key.add(entry.getKey());

			}
		}
		return "Le emoticons più usate sono: " + key.toString() + "\nUsate: ";
	}

	public static int min_emoticon() {
		HashMap<String, Integer> e;
		e = Emoticon.count();
		int min = max_emoticon();
		Collection<Integer> values = e.values();
		Iterator<Integer> i = values.iterator();
		while (i.hasNext()) {
			int tmp = i.next();
			if (min > tmp)
				min = tmp;
		}
		return min;
	}

	public String min_e() {
		HashMap<String, Integer> e;
		e = Emoticon.count();
		Vector<String> key = new Vector<String>();
		int MIN = min_emoticon();

		for (Entry<String, Integer> entry : e.entrySet()) {
			if (Objects.equals(MIN, entry.getValue())) {
				key.add(entry.getKey());

			}
		}
		return "Le emoticons meno usate sono: " + key.toString() + "\nUsate: ";
	}
}
