package application.service;


import java.util.ArrayList;
import java.util.HashMap;

import application.Exception.EmoticonNotFoundException;
import application.model.Emoticon;
import application.model.Post;
import application.util.Storage;
public class Filtersemoticon {
	
	/**
	 * metodo che cerca i post in cui è presente l'emoticon passata come parametro
	 * @param emo, emoticon da cercare
	 * @return tutti i post contenenti l'emoticon pasata come parametro
	 * @throws EmoticonNotFoundException
	 */
	public static  ArrayList<Post> contain(String emo) throws EmoticonNotFoundException  {
		ArrayList<Post> post=Storage.get_post();
		ArrayList<Post> filteredPost=new ArrayList<Post>();
		HashMap<String,Integer> e=Emoticon.count();
		if(e.containsKey(emo)) {
			for(int i=0;i<post.size();i++) {
				String msg=post.get(i).getMessage();
				if(msg.contains(emo)) {
					filteredPost.add(post.get(i));
				}
			}			
		}
		else 
			throw new EmoticonNotFoundException();
		
		return filteredPost;
		}

	}
