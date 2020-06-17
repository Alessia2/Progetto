	package application.service;

	import java.util.ArrayList;
	import java.util.HashMap;

	import application.model.Emoticon;
	import application.model.Post;
	import application.util.Storage;
	public class Filtersemoticon {
	
		public static ArrayList<Post> contains(String emo){
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
				
				return filteredPost;
			}
			
			return filteredPost;
			}
		
				
			
			
			
		}

