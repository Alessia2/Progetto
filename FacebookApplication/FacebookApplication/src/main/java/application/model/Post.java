package application.model;

/**
 * class that describes the posts
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 */
public class Post {
	
	private int id;
	private String message;
	
	
	public Post() {
		this.id=0;
		this.message=null;
	}
	
	/**
	 * 
	 * @return the id of the post
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id,the id to set
	 */
	public void setId(int id) {
		this.id=id;
	}
	
	/**
	 * 
	 * @return the message of the post
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * 
	 * @param message,the message to set
	 */
	public void setMessage(String message) {
		this.message=message;
	}

}
