package Progetto.Model;

public class Emoticon extends Post {
	
	private String code;
	
	public Emoticon() {
		super();
		this.code=null;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String code) {
		this.code=code;
	}
	public void conta(Post post,String code ) {
		String msg=post.getMessage();
		for(int i=0;i<msg.length();i++)
		{
			char l=msg.charAt(i);
			if(l=='U')
			{
				while(l!=' '||l!='\n')
				code=msg.substring(i+1);
			
			}
		}
	}

}
