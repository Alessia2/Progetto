package application.model;

/**
 * class that describes the posts
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 */
public class Post {
	
	private String id;
	private String message;
	private String created_time;
	
	/** 
	 * costruttore della classe
	 * @param id;id del post
	 * @param message,messaggio del post
	 * @param created_time, quando è stato creato il post
	 */
	public Post() {
		this.id=null;
		this.message=null;
		this.created_time=null;
	}
	
	public String getCreated_time() {
		return created_time;
	}
	
	/**
	 * 
	 * metodi getter e setter
	 */
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id=id;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message=message;
	}

}

