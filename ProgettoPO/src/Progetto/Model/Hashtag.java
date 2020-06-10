package Progetto.Model;

public class Hashtag extends Post {
	
	private String text;
	
	public Hashtag() {
		super();
		this.text=null;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text=text;
	}

}
