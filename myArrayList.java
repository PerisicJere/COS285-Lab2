/*
 * CLASS myArrayList
 * Create custom arraylist objects with a default initial size of 50 and a growth rate of 20%
 *
 * @author Ben Sweeney, Jere Perisic, Abby Pitcairn, Esther Mugish
 *
 * @version 20230917
 *
 */

import java.util.Arrays;

//public class myArrayList<T extends Fraction> {
public class myArrayList<T extends Fraction>{
	private Fraction[] fractions;
	private int size;
	private int capacity;
	private double Growth_factor = 0.2;

	public myArrayList() {
		capacity = 50;
		fractions = new Fraction[capacity];
		size = 0;
	}

	/* add
	 *
	 * Add a Fraction to the middle of an arraylist
	 *
	 * @param index The spot we're inserting a new fraction into
	 * @param inFrac new Fraction to append to the arraylist
	 * @return False if there was a process/input failure, true if the operation was successful
	 */
	public void add(int index, Fraction inFrac) {
		if (index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (size == capacity) {
			reallocate();
		}
		for(int i = size; i>index; i--){
			fractions[i]=fractions[i-1];
		}
		fractions[size]=inFrac;
		size++;
	}

	/* add
	 *
	 * Add a Fraction to the end of an ArrayList
	 *
	 * @param inFrac new Fraction to append to the arraylist
	 * @return False if there was a process/input failure, true if the operation was successful
	 */
	public void add(Fraction inFrac) {
		if (size == capacity) {
			reallocate();
		}
		fractions[size]=inFrac;
		size++;
	}

	/* remove
	 *
	 * Remove a Fraction from the arraylist
	 *
	 * @param index The specified index of the Fraction element to remove
	 * @return the removed value
	 */
	public Fraction remove(int index) {
		if (index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Fraction returnValue = fractions[index];
		for (int i= index+1; i < size; i++){
			fractions[i-1] = fractions[i];
		}
		size--;
		return returnValue;
	}

	/* contains
	 *
	 * See if a fraction is contained within the arraylist
	 *
	 * @param checkFrac Specified Fraction to find in the arraylist
	 * @return False if the Fraction was not found, true if the Fraction was found
	 */
	public boolean contains(Fraction checkFrac) {
		return false;
	}

	/* reallocate
	 *
	 * Create a new array 20% larger than the current size;
	 *
	 */
	private void reallocate(){
		capacity += ((10*capacity)*(10*Growth_factor))/10;
		fractions = Arrays.copyOf(fractions, capacity);
		//capacity = 1.2 * capacity;
	}
//	public String printArray() {
//		String arrayString = " ";
//		for (int i = 0; i < fractions.length; i++){
//			arrayString += fractions[i].toPrint();
//		}
//		return arrayString;
//	}

	public Fraction get(int index){
		if (index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return fractions[index];
	}

	public int getSize(){
		return size;
	}


}

