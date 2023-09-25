import java.util.Arrays;
import java.util.Random;

/*
 * CLASS FractionMain
 * Test and output the results from operations on custom Fraction ArrayList objects
 * @author Ben Sweeney, Abby Pitcairn, Jere Perisic, Esther Mugish
 *
 * @version 20230917
 */
public class myArrayListMain {
	/*
	 *@author Jere Perisic
	 * Testing myArrayList.java
	 *
	 */
	public static void main(String[] args) {

		testAdd();
		testIndexOf();
		testRemove();
		testCapacity(61);


	}

	/*
	 * Tests the add method of myArrayList.
	 */
	public static void testAdd() {
		System.out.println("Testing add method.");
		myArrayList list = new myArrayList();
		for (int i = 0; i < 10; i++) {
			Fraction fraction = new Fraction(i, i + 2);
			list.add(list.getSize(), fraction);
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("\n" + "Add successful");
		System.out.println(list.getCapacity() + "\n");
	}

	/*
	 * Tests the indexOf method of myArrayList.
	 */
	public static void testIndexOf() {
		System.out.println("Testing IndexOf");
		myArrayList list = new myArrayList();

		Fraction fra1 = new Fraction(1, 2);
		Fraction fra2 = new Fraction(3, 4);
		list.add(0, fra1);
		list.add(1, fra2);
		int index = list.indexOf(fra2);
		System.out.println("Fra2: " + index);
		int nonExistingIndex = list.indexOf(new Fraction(2, 3));
		System.out.println("Non existing index: " + nonExistingIndex);
		System.out.println("Index of testing done" + "\n");
	}

	/*
	 * Tests the remove method of myArrayList.
	 */
	public static void testRemove() {
		System.out.println("Testing remove");
		myArrayList list = new myArrayList();

		Fraction fra1 = new Fraction(1, 2);
		Fraction fra2 = new Fraction(3, 4);

		list.add(0, fra1);
		list.add(1, fra2);

		Fraction removed = list.remove(0);

		assert removed.equals(fra1);

		assert list.getSize() == 1;
	}
	/*
	 * Tests the capacity increase of myArrayList.
	 *
	 * @param n The number of fractions to add for testing capacity increase.
	 */

	public static void testCapacity(int n) {
		System.out.println("Testing capacity increase");
		myArrayList list = new myArrayList();

		System.out.println("Initial capacity:" + list.getCapacity());
		for (int i = 0; i < n; i++) {
			list.add(i, new Fraction(i, i + 1));
		}
		System.out.println("Increased capacity: " + list.getCapacity());

	}
}
