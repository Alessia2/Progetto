package application.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import application.model.Emoticon;
import application.model.Hashtag;
import application.model.Post;
import application.util.Storage;

public class Statistics  {
	
	private Emoticon E;
	private ArrayList<Post> array;
	
	public Statistics() {
		array=Storage.get_post();
		E.count(array);
		
	}
	public static String max_hashtag() {
		HashMap<String, Integer> h;
		h=Hashtag.count();
		int max=0;
		String key=null;
		Set<Entry<String, Integer>> s=h.entrySet();
		Iterator<Entry<String, Integer>> it=s.iterator();
		while(it.hasNext()) {
			if(max<it.next().getValue()) {
				max=it.next().getValue();
			}
			for(Entry<String, Integer> entry : h.entrySet()) {
				if (Objects.equals(max, entry.getValue())) {
					key= entry.getKey();
					
				}
			}
		}
		return key;
			
	}
	

}
