package Progetto.Model;

import java.util.HashMap;


public class Emoticon extends Post {
	
	private HashMap<String,Integer> emoticon;
	
	public Emoticon() {
		super();
		emoticon=new HashMap<>();
	}
	

	public void count(Post post,String code ) {
		String msg=post.getMessage();
		for(int i=0;i<msg.length();i++)
		{
			char l=msg.charAt(i);
			if(l=='U')
			{
				while(l!=' '||l!='\n')
				code=msg.substring(i);
			
			}
		}
		if(emoticon.containsKey(code))
		{
			int value=emoticon.get(code)+1;
			emoticon.put(code, value);
		}
		else
			emoticon.put(code, 1);
	}

}
