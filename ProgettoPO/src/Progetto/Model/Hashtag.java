package Progetto.Model;

import java.util.HashMap;

public class Hashtag extends Post {
	
	private HashMap<String,Integer> hashtag;
	
	public Hashtag() {
		super();
		hashtag=new HashMap<>();
	}

	public void conta(Post post,String code ) {
		String msg=post.getMessage();
		for(int i=0;i<msg.length();i++)
		{
			char l=msg.charAt(i);
			if(l=='#')
			{
				i++;//per non prendere#?!
				while(l!=' '||l!='\n')
				code=msg.substring(i);
			
			}
		}
		if(hashtag.containsKey(code))
		{
			int value=hashtag.get(code)+1;
			hashtag.put(code, value);
		}
		else
			hashtag.put(code, 1);
	}

}
