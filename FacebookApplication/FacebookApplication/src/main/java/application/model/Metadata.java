package application.model;

/**
 * classe dell' oggetto metadata
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 *
 */
public class Metadata {
	
	private String name;
	private String type;
	private String property;
	
	/**
	 * costruttore della classe
	 * @param name, nome del dato
	 * @param type, tipo della caratteristica
	 * @param property, significato
	 */
	public Metadata (String name,String type,String property) {
		this.name=name;
		this.type=type;
		this.property=property;
	}
	
/** 
 * metodi getters e setters
 * 
 * 
 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
	/**
	 * override del metodo toString()
	 */
	public String toString() {
		return this.getName()+": "+this.getProperty()+"\n"+this.getType();
	}
	
	
	
	
	

}
