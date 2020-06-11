package application.model;

import java.util.HashMap;

public class Emoticon extends Post {
	
	private HashMap<String,Integer> emoticon;
	
	public Emoticon() {
		super();
		emoticon=new HashMap<>();
	}
	
	//verifica se l'emoticon è gia presente nell'hashmap,
	//se è gia presente aumentea il valore di uno altrimetni la inserisce 
	//nell'hashmap
	public void count(Post post,String code) {
		String msg=post.getMessage();
		for(int i=0;i<msg.length();i++) {
			char l=msg.charAt(i);
			if(l=='U')
			{
				while(l!=' '|| l!='\n')
					code=msg.substring(i);
			}
			else
				emoticon.put(code,1);
		}
	}
		
		

}
