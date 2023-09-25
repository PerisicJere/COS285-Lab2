/*
 * CLASS myArrayList
 * Create custom arraylist objects with a default initial size of 50 and a growth rate of 20%
 * 
 * @author Ben Sweeney, Jere Perisic, Abby Pitcairn, Esther Mugish
 * 
 * @version 20230917
 * 
 */

public class myArrayList<T extends Fraction> {
	private static Fraction[] fractions;
	private static int size;
	private int capacity;
	private double Growth_factor = 0.2;

	public myArrayList() {
		capacity = 50;
		fractions = new Fraction[capacity];
		size = 0;
	}

	/* add
	 * 
	 * Add a Fraction to the arraylist
	 * 
	 * @param inFrac new Fraction to append to the arraylist
	 * @return False if there was a process/input failure, true if the operation was successful
	 */
	public static boolean add(int index, Fraction inFrac) {
		return false;
	}

	
	/* remove
	 * 
	 * Remove a Fraction from the arraylist
	 * 
	 * @param delFrac Fraction to find and remove from the arraylist
	 * @return 
	 */
	public static Fraction remove(Fraction delFrac) {
	return null;
	}
	
	/* contains
	 * 
	 * See if a fraction is contained within the arraylist
	 * 
	 * @param checkFrac Specified Fraction to find in the arraylist
	 * @return False if the Fraction was not found, true if the Fraction was found
	 */
	public static boolean contains(Fraction checkFrac) {
		return false;
	}
	
	/**
	 * @author abby pitcairn
	 * find the index of the input Fraction
	 * @param input the Fraction to find the index of
	 * @return the index of input
	 */
	public static int indexOf(Fraction input) {
	    int index = -1;
	    for (int i = 0; i < size; i++) {
	        if (fractions[i].equals(input)) 
	            index = i;   }
	    return index;
	    
	    
	}
}
