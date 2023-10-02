/**
 * CLASS myArrayList
 * Create custom arraylist objects with a default initial size of 50 and a growth rate of 20%
 *
 * @author Ben Sweeney, Jere Perisic, Abby Pitcairn, Esther Mugish
 *
 * @version 20230917
 *
 */

import java.util.Arrays;
import java.util.NoSuchElementException;

public class myArrayList<T extends Fraction> {
	private static Fraction[] fractions;
	private static int size;


	private static int capacity;
	private static double Growth_factor = 0.2;

	public myArrayList() {
		this.capacity = 50;
		this.fractions = new Fraction[capacity];
		this.size = 0;
	}

	/** add
	 * Add a Fraction to the middle of an arraylist
	 *
	 * @param index The spot we're inserting a new fraction into
	 * @param inFrac new Fraction to append to the arraylist
	 * @return False if there was a process/input failure, true if the operation was successful
	 */
	public static void add(int index, Fraction inFrac) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (size == capacity) {
			int newCap = (int) (capacity + capacity * Growth_factor);
			fractions = Arrays.copyOf(fractions, newCap);
			capacity = newCap;
		}

		for (int i = size; i > index; i--) {
			fractions[i] = fractions[i - 1];
		}
		fractions[index] = inFrac;
		size++;
	}

	/** add
	 * Add a Fraction to the end of an ArrayList
	 *
	 * @param inFrac new Fraction to append to the arraylist
	 * @return False if there was a process/input failure, true if the operation was successful
	 */
	public void add(Fraction inFrac) {
		if (size == capacity) {
			int newCap = (int) (capacity + capacity * Growth_factor);
			fractions = Arrays.copyOf(fractions, newCap);
			capacity = newCap;

		}
		fractions[size] = inFrac;
		size++;
	}

	/** remove
	 * Remove a Fraction from the arraylist
	 *
	 * @param index The specified index of the Fraction element to remove
	 * @return the removed value
	 */
	public static Fraction remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Fraction returnValue = fractions[index];
		for (int i = index + 1; i < size; i++) {
			fractions[i - 1] = fractions[i];
		}
		size--;
		return returnValue;
	}

	/** contains*
	 * See if a fraction is contained within the arraylist
	 *
	 * @param checkFrac Specified Fraction to find in the arraylist
	 * @return False if the Fraction was not found, true if the Fraction was found
	 */
	public boolean contains(Fraction checkFrac) {
		return false;
	}

	public Fraction get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return fractions[index];
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param input the Fraction to find the index of
	 * @return the index of input
	 * @author abby pitcairn
	 * find the index of the input Fraction
	 */
	public int indexOf(Fraction input) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (fractions[i].equals(input))
				index = i;
		}
		return index;


	}

	public String print() {
		String output = "[";
		for(int iter = 0; iter<size-1; iter++){
			output += get(iter).toString() + ", ";
		}
		output += this.get(size-1) + "]";
		return output;
	}

	//public String toString

	/**
	 * Iterator class
	 * Building a place marker to track the current position in a linked list
	 * @author Jere Perisic, Abigail Pitcairn, Ben Sweeney
	 */
	static class myListIterator {
		private int position = 0;
//		private int lastItemReturned = 0;
//		private int nextItem = 0;
		//private Node<Fraction> nextItem = null;
		//private Node<Fraction> lastItemReturned = null;
		//private Node<Fraction> head = new Node<>

		/**
		 * Default constructor when no index position is specified
		 * @author Perisic
		 */
		public myListIterator() {
			position = 0;
		}

//		/**
//		 * Default constructor when an index position is provided
//		 * @author Perisic, Sweeney
//		 */
//		public myListIterator(int start) {
//			position = start;
//			lastItemReturned = start - 1;
//			nextItem = start + 1;
//		}

		/**
		 * hasNext method
		 *
		 */
		public boolean hasNext() {
			return position < size;
		}
		/**
		 * hasPrevious method
		 *
		 */
		public boolean hasPrevious() {
			return position > 0;
		}

		/**next method
		 * @author Abby Pitcairn
		 * @return the fraction at the next position
		 * @throws NoSuchElementException if there is no next element
		 */
		public Fraction next(){
			if (!this.hasNext())
				throw new NoSuchElementException();
			position++;
			return fractions[position];
		}

		/**previous method
		 * @author Abby Pitcairn
		 * @return the fraction at the previous position
		 * @throws NoSuchElementException if there is no previous element
		 */
		public Fraction previous(){
			if (!this.hasPrevious())
				throw new NoSuchElementException();
			position--;
			return fractions[position];
		}
		/** addAll
		 * Inserts all the Fractions from the input array into the list just before the item
		 * that would be returned by the next call to method "next" and after the item that
		 * would have been returned by method "previous"
		 * @author Sweeney
		 * @param frc Input array to insert into the list
		 */
		public boolean addAll(Fraction[] frc){
			//use position
//			System.out.print("IN ADDALL METHOD: RECEIVED " + Arrays.toString(frc));
			for (int iter = 0; iter < frc.length; iter++){
//				System.out.println("iter = "  + iter);
//				System.out.println("frc[iter] = "  + frc[iter]);
//				System.out.println("pos = "  + position);

				add(position, frc[iter]);
//				System.out.println(print());
				position++;
			}
			return false;
		}

		/** removeAllNext
		 * Removes all items located after the item returned from a call to method "next"
		 * @author Sweeney
		 */
		public void removeAllNext(){
			int deletionPos = size-1;
			if ((position + 2) < size) {
             while(deletionPos>position+1){
				remove(deletionPos);
				 deletionPos--;
			 }
            } else {
                throw new IllegalStateException("There are no elements after the item that would be returned by a \"next\" call");
            }
		}

		public String print() {
			String output = "[";
			for(int iter = 0; iter<size-1; iter++){
				output += get(iter).toString() + ", ";
			}
			output += get(size-1) + "]";
			return output;
		}

		public Fraction get(int index) {
			if (index < 0 || index >= size) {
				throw new ArrayIndexOutOfBoundsException(index);
			}
			return fractions[index];
		}
		public int getPos() {
			return position;
		}
	}

//	/**
//	 * Private class for node building with Fraction objects
//	 * @author Sweeney
//	 * @param <Fraction>
//	 */
//	private static class Node<Fraction> {
//		Fraction item;
//		Node<Fraction> next;
//		Node<Fraction> prev;
//
//		Node(Node<Fraction> prev, Fraction element, Node<Fraction> next) {
//			this.item = element;
//			this.next = next;
//			this.prev = prev;
//		}
//		Node(Fraction element) {
//			this.item = element;
//			this.next = null;
//			this.prev = null;
//		}
//	}
}

