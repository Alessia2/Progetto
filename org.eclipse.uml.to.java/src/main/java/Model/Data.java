/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package Model;

import Model.HashMap<String,Integer>    ;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Data.
 * 
 * @author aleip
 */
public interface Data {
	/**
	 * Description of the property property.
	 */
	protected HashMap<String,Integer>     property = null;
	
	// Start of user code (user defined attributes for Data)
		
		// End of user code
	
	/**
	 * Description of the method getValue.
	 * @return 
	 */
	public Integer getValue();
	
	/**
	 * Description of the method setValue.
	 * @param value 
	 */
	public void setValue(String value);
	
	/**
	 * Description of the method getKey.
	 * @return 
	 */
	public Integer getKey();
	
	/**
	 * Description of the method setKey.
	 * @param value 
	 */
	public void setKey(String value);
	
	// Start of user code (user defined methods for Data)
		
		// End of user code


}
