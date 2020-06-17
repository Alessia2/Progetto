package application.service;


	import java.util.ArrayList;
	import java.util.HashMap;

	import application.model.Hashtag;
	import application.model.Post;
	import application.util.Storage;
	public class Filtershash {
	
		public static ArrayList<Post> contain(String text) {
			ArrayList<Post> filteredPost=new ArrayList<Post>();
			ArrayList<Post> post = Storage.get_post();
			HashMap<String,Integer> h=Hashtag.count();
			if(h.containsKey(text)) {
				for(int i=0;i<post.size();i++) {
					String msg=post.get(i).getMessage();
					if(msg.contains(text))
						filteredPost.add(post.get(i));
					
				}
				return filteredPost;
			}
			
			return filteredPost;
			
		
		}


	}
