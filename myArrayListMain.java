/*
 * CLASS FractionMain
 * Test and output the results from operations on custom Fraction ArrayList objects
 * @author Ben Sweeney, Abby Pitcairn, Jere Perisic, Esther Mugish
 * 
 * @version 20230917
 */
public class myArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fraction[] fractionArray = new Fraction[100];

//		for(int i=0; i<fractionArray.length; i++)
//			fractionArray[i] = new Fraction(i, i+1);
		
		System.out.println("Lab 1M - Custom Array Lists");
		//testAdd(null, 1,2);

		testRemove();

		testContains(null, 3, 4);
		System.out.println("\n*****END OF TESTS*****");
	}
	
	//=============TESTS================================================//


	/* testAdd
	 * Test that .add() actually adds a fraction object to the array
	 * @param testArr Input array to test the add method
	 * @param inNumA Desired Fraction A numerator
	 * @param inDenA Desired Fraction A denominator
	 */
	public static void testAdd() {
		
		
		System.out.println("\n===========================================");
		System.out.println(".add() TEST");

		System.out.println("\n===========================================");
	}
	
	/* testRemove
	 * Test that .remove() actually removes a fraction object from the array
	 */
	public static void testRemove() {

		myArrayList<Fraction> removeTestArray = new myArrayList<>();
		removeTestArray.add(0, new Fraction(1,2));
		removeTestArray.add(1, new Fraction(3,8));

		System.out.println("\n===========================================");
		System.out.println(".remove() TEST");
		System.out.println("The array initially has the following elements: " + removeTestArray.toString());
		System.out.println("Removing the first entry:");
		removeTestArray.remove(0);
		System.out.println("The array now has the following elements: " + removeTestArray.toString());

		System.out.println("Adding a few new fractions to the array...");
		removeTestArray.add(0, new Fraction(4,5));
		removeTestArray.add(1, new Fraction(99,100));
		System.out.println("The array now has the following elements: " + removeTestArray.toString());
		System.out.println("Removing the last entry...");
		removeTestArray.remove(2);
		System.out.println("The array now has the following elements: " + removeTestArray.toString());

		System.out.println("\nEND OF .remove() TEST");

		System.out.println("\n===========================================");
	}
	
	/* testContains
	 * Test that .contains() actually determines whether or not the array contains
	 * the specified Fraction object
	 * @param testArr Input array to test the contains method
	 * @param inNumA Desired Fraction A numerator
	 * @param inDenA Desired Fraction A denominator
	 */
	public static void testContains(myArrayList[] testArr, int inNumA, int inDenA) {
		int testNumA = inNumA;
		int testDenA = inDenA;
		Fraction testFracA = new Fraction(testNumA,testDenA);
		
		
		System.out.println("\n===========================================");
		System.out.println(".contains() TEST");

		System.out.println("\n===========================================");
	}
}
