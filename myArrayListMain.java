import java.util.Arrays;

/*
 * CLASS FractionMain
 * Test and output the results from iterator operations in Fraction array lists
 * @author Ben Sweeney, Abby Pitcairn, Jere Perisic, Esther Mugish
 *
 * @version 20231001
 */
public class myArrayListMain {
	public static void main(String[] args) {

		testAddAll();
		testRemoveAllNext();
	}
	/** testAddAll
	 * Creates a Fraction array list, a fraction array, and a fraction array list iterator.
	 * Determines if the iterator can successfully add the fraction array into the desired position
	 * in the array list.
	 * @author Sweeney
	 */
	public static void testAddAll() {
		myArrayList<Fraction> addAllTestFracArray = new myArrayList<>();
		//myArrayList<Fraction> fracArrayListToAdd = new myArrayList<>();
		Fraction[] fracArrayToAdd = new Fraction[3];
		for(int iter = 0; iter < 5; iter++){
			addAllTestFracArray.add(new Fraction(iter,iter+1));
		}
		System.out.println("Testing testAddAll");
		System.out.println("Test case initial array: " + addAllTestFracArray.print());
		for(int iter = 0; iter < fracArrayToAdd.length; iter++){
			fracArrayToAdd[iter] = (new Fraction(iter+9,iter+10));
		}
		System.out.println("Test case array to add: " + Arrays.toString(fracArrayToAdd));

		myArrayList.myListIterator fracIter = new myArrayList.myListIterator();
		System.out.println("Adding before item " + fracIter.next());
		fracIter.addAll(fracArrayToAdd);
		System.out.println("Test case post-add array: " + addAllTestFracArray.print());
		System.out.println("**TEST COMPLETE**\n");

	}

	/** testRemoveAllNext
	 * Creates a Fraction array list nd a fraction array list iterator.
	 * Determines if the iterator can successfully remove the elements in the array list after the intended position
	 * @author Sweeney
	 */
	public static void testRemoveAllNext() {
		myArrayList<Fraction> removeAllNextArrayList = new myArrayList<>();
		myArrayList.myListIterator fracIter = new myArrayList.myListIterator();

		for (int iter = 2; iter < 7; iter++) {
			removeAllNextArrayList.add(new Fraction(iter, iter + 1));
		}
		System.out.println("Testing removeAllNext");

		System.out.println("Test case initial array: " + removeAllNextArrayList.print());
		System.out.println("Removing after item " + fracIter.get(fracIter.getPos() + 1));
		fracIter.removeAllNext();
		System.out.println("Test case post-removal: " + removeAllNextArrayList.print());
		System.out.println("**TEST COMPLETE**\n");
	}


}
