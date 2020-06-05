/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package Service;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Statistics.
 * 
 * @author aleip
 */
public class Statistics {
	// Start of user code (user defined attributes for Statistics)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Statistics() {
		// Start of user code constructor for Statistics)
		
		// End of user code
	}
	
	/**
	 * Description of the method max.
	 * @return 
	 */
	public String max(/*gli passo file json*/) {
		// Start of user code for method max
		int length_of_lista
		
		String max = ;
		return max;
		
		// End of user code
	}// searching the most used
	 
	/**
	 * Description of the method min.
	 * @return 
	 */
	public String min() {
		// Start of user code for method min
		String min = "";
		return min;
		// End of user code
	}// searching the less used
	 
	/**
	 * Description of the method times.
	 * @return 
	 */
	public int times(String item) {
		// Start of user code for method times
		int length_of_item = item.length();
		int length_of_file = file.length();
		int times = 0;
		for(int index = 0; index <= length_of_file - length_of_item; index++) {
			if(file.subSequence(index, index + length_of_item).equals(item))
				times++;
		}
		return times;
		//oppure usare stringtokenizer
		// End of user code
	}// how many times it's used
	 
	// Start of user code (user defined methods for Statistics)
	
	// End of user code


}
