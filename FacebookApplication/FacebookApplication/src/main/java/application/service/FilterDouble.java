package application.service;

import java.util.ArrayList;
import java.util.HashMap;

import application.Exception.EmoticonNotFoundException;
import application.Exception.HashtagNotFoundException;
import application.model.Emoticon;
import application.model.Hashtag;
import application.model.Post;
import application.util.Storage;

public class FilterDouble {

	/**
	 * 
	 * @param text,hashtag secondo il quale si vuole filtrare
	 * @param emo,emoticon secondo la quale si vuole filtrare
	 * @return tutti i post che contengono sia l'hashtag che l'emoticon passate
	 * @throws EmoticonNotFoundException
	 * @throws HashtagNotFoundException
	 */
	public static ArrayList<Post> FilDouble(String text,String emo) throws EmoticonNotFoundException,HashtagNotFoundException {
		ArrayList<Post> filteredPost = new ArrayList<Post>();
		ArrayList<Post> post = Storage.get_post();
		HashMap<String, Integer> h = Hashtag.count();
		HashMap<String,Integer> e=Emoticon.count();
		if(h.containsKey(text) ) {
			if(e.containsKey(emo)){
			for(int i=0;i<post.size();i++) {
				String message=post.get(i).getMessage();
				if(message.contains(text)&& message.contains(emo))
					filteredPost.add(post.get(i));
			}
			
		}else
			throw new EmoticonNotFoundException();
		
	  }else 
		  throw new HashtagNotFoundException();
		return filteredPost;
	}
}


