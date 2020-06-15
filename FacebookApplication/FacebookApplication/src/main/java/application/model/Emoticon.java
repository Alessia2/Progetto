package application.model;


import java.util.ArrayList;
import java.util.HashMap;

import application.util.Storage;

/**
 * class that describes the emoticons
 * @author Flavai Gioiello
 * @author Alessia Castagnolo
 *
 */
public class Emoticon extends Post {
	
	private HashMap<String,Integer> emoticon;
	
	public Emoticon() {
		super();
		emoticon=new HashMap<>();
	}
	
	/**
	 * metodo che riempie l'hashmap di emoticon inserendo il nome come chiave e quante volte appare come valore
	 * @param post, array di post
	 * 
	 */
	public void count(ArrayList<Post> array) {
		array=Storage.get_post();
		String code=null;
		for(int k=0;k<array.size();k++) {
			String msg=array.get(k).getMessage();
			for(int i=0;i<msg.length();i++) {
				char l=msg.charAt(i);
				int j=i+1;
				if(l=='U' && msg.charAt(j)=='+')
				{
					while(l!=' '|| l!='\n'|| l=='0'||l=='1' ||l=='2'||l=='3'||l=='4'||l=='5'|| l=='6' ||l=='7' ||l=='8' ||l=='9')
						code=msg.substring(i);
				}
				else
					emoticon.put(code,1);
			}
		}
			
		
	}
	
	public HashMap<String,Integer> getE(){
		return this.emoticon;
	}
		
		

}
