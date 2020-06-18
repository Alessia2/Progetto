package application.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;
import java.util.Map.Entry;

import application.model.Emoticon;
import application.model.Metadata;


public class Statsemoticon implements Stats {

	/**
	 * metodo che cerca la/le emoticon più usata/e 
	 * @return quante volte è stata usta/e
	 */
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

	/**
	 * metodo che cerca la/le emoticon più usata/e  nell'hashmap
	 * @return stampa la/le emoticon più usata/e
	 */
	public String max_key() {
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

	/**
	 * metodo che cerca la/le emoticon meno usata/e 
	 * @return quante volte è stata usta/e
	 */
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

	/**
	 * metodo che cerca la/le emoticon meno usata/e  nell'hashmap
	 * @return stampa la/le emoticon meno usata/e
	 */
	public String min_key() {
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
	
	/**
	 * @return  tot,emoticon usate in totale
	 */
	public String tot() {
		HashMap<String, Integer> e=Emoticon.count();
		int tot=0;
		Collection<Integer> values = e.values();
		Iterator<Integer> i = values.iterator();
		while (i.hasNext()) {
			tot += i.next();
		}
		return "Totale emoticon usate: "+tot;
	}
	
	/** 
	 * @return tutte le emoticon usate e quante volte sono state usate
	 */
	 public String numE() {
		 HashMap<String, Integer> e=Emoticon.count();
		 return e.toString();
	 }
}
