



/*LAB0M MAIN METHOD CARRIED FORWARD FOR EASIER REFERENCE*/



///*
// * CLASS FractionMain
// * Create fraction objects with numerator and denominator inputs
// * 
// * @author Ben Sweeney,Abby Pitcairn, Jere Perisic, Esther Mugish
// * 
// * @version 20230917
// */
//public class FractionMain {
//
//	public static void main(String[] args) {
//
//		Fraction maxFrac = new Fraction(99,100);
//		Fraction minFrac = new Fraction();
//		Fraction[] fractionArray = new Fraction[100];
//		Fraction[] sortedFracArray = new Fraction[100];
//
//		for(int i=0; i<fractionArray.length; i++)
//			fractionArray[i] = new Fraction(i, i+1);
//
//		for(int i=0; i<fractionArray.length; i++)
//			System.out.println("Fraction " + (i+1) + ": " + fractionArray[i].toPrint());
//
//		//System.out.println("The initial maxfrac is " + maxFrac.toPrint());
//
//		maxFrac = findMax(fractionArray);
//		System.out.println("The highest-value array in fractionArray is " + maxFrac.toPrint());
//
//		minFrac = findMin(fractionArray);
//		System.out.println("The lowest-value array in fractionArray is " + minFrac.toPrint());
//
//		sortedFracArray = sort(fractionArray);
//		for(int i=0; i<sortedFracArray.length; i++)
//			System.out.println("Fraction " + (i+1) + ": " + sortedFracArray[i].toPrint());
//	}
//
//	//===========FUNCTIONAL METHODS=====================================//
//	/*FINDMIN Find the smallest value in an array of Fractions
//	 * @param input: the Fraction array to find the minimum from
//	 * @return min: the smallest Fraction in the array input
//	 */
//	public static Fraction findMin(Fraction[] input) {
//		Fraction min = input[0];
//		for (int i = 1; i < input.length; ++i) 
//			if (min.compare(input[i]) == 1) //check this -1 variable when compareTo method comes through
//				min = input[i];
//		return min;
//	}
//	/*FINDMAX Find the largest value in an array of Fractions
//	 * @param input: the Fraction array to find the maximum from
//	 * @return max: the largest Fraction in the array input
//	 */
//	public static Fraction findMax(Fraction[] input) {
//		Fraction max = input[0];		
//		for (int i = 1; i < input.length; ++i) { 
//			if (max.compare(input[i]) == -1) //check this 1 variable when compareTo method comes through
//				max = input[i];
//		}
//
//		return max;
//	}
//
//	/*
//	Selection sort for array of fractions
//	@param fraction array
//	@return sorted array
//	 */
//	public static Fraction[] sort(Fraction[] arr) {
//		Fraction[] sortedArr = new Fraction[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			sortedArr[i] = arr[i];
//		}
//
//		for (int i = 0; i < sortedArr.length - 1; i++) {
//			int min = i;
//			for (int j = i + 1; j < sortedArr.length; j++) {
//				if (sortedArr[j].compare(sortedArr[min]) == -1) {
//					min = j;
//				}
//				Fraction swap = sortedArr[min];
//				sortedArr[min] = sortedArr[i];
//				sortedArr[i] = swap;
//			}
//
//		}
//		return sortedArr;
//	}	
//
//	//=============TESTS================================================//
//
//	/* testSingleObj
//	 * Create and print a single Fraction object based on input numbers
//	 * @param inNum Desired numerator
//	 * @param inDen Desired denominator
//	 */
//	public static void testSingleObj(int inNum, int inDen) {
//		int testNum = inNum;
//		int testDen = inDen;
//		Fraction testFrac = new Fraction(testNum,testDen);
//
//		System.out.print("Variable testFrac should equal " + testNum + "/" + testDen +". It equals: ");
//		testFrac.print();
//		System.out.println();	
//	}
//
//	/* testPlus
//	 * Test that .plus() actually adds two fractions together
//	 * @param inNumA Desired Fraction A numerator
//	 * @param inDenA Desired Fraction A denominator
//	 * @param inNumB Desired Fraction B numerator
//	 * @param inDenB Desired Fraction B denominator
//	 */
//	public static void testPlus(int inNumA, int inDenA,int inNumB, int inDenB) {
//		int testNumA = inNumA;
//		int testDenA = inDenA;
//		int testNumB = inNumB;
//		int testDenB = inDenB;
//
//		Fraction testFracA = new Fraction(testNumA,testDenA);
//		Fraction testFracB = new Fraction(testNumB,testDenB);
//		Fraction testFracSum = testFracA.plus(testFracB);
//		System.out.println("\n===========================================");
//		System.out.println(".plus() TEST");
//		System.out.print("Fraction A = ");
//		testFracA.print();
//		System.out.println();	
//		System.out.print("Fraction B = ");
//		testFracB.print();
//		System.out.println();
//		System.out.print("A + B = ");
//		testFracSum.print();
//		System.out.println("\n===========================================");
//	}
//
//	/* testMinus
//	 * Test that .minus() actually subtracts Fraction B from Fraction A
//	 * @param inNumA Desired Fraction A numerator
//	 * @param inDenA Desired Fraction A denominator
//	 * @param inNumB Desired Fraction B numerator
//	 * @param inDenB Desired Fraction B denominator
//	 */
//	public static void testMinus(int inNumA, int inDenA,int inNumB, int inDenB) {
//		int testNumA = inNumA;
//		int testDenA = inDenA;
//		int testNumB = inNumB;
//		int testDenB = inDenB;
//
//		Fraction testFracA = new Fraction(testNumA,testDenA);
//		Fraction testFracB = new Fraction(testNumB,testDenB);
//		Fraction testFracSum = testFracA.minus(testFracB);
//
//		System.out.println("\n===========================================");
//		System.out.println(".minus() TEST");
//		System.out.print("Fraction A = ");
//		testFracA.print();
//		System.out.println();	
//		System.out.print("Fraction B = ");
//		testFracB.print();
//		System.out.println();
//		System.out.print("A - B = ");
//		testFracSum.print();
//		System.out.println("\n===========================================");	
//	}
//
//	/* testMult
//	 * Test that .multiply() actually multiplies Fractions A and B together
//	 * @param inNumA Desired Fraction A numerator
//	 * @param inDenA Desired Fraction A denominator
//	 * @param inNumB Desired Fraction B numerator
//	 * @param inDenB Desired Fraction B denominator
//	 */
//	public static void testMult(int inNumA, int inDenA,int inNumB, int inDenB) {
//		int testNumA = inNumA;
//		int testDenA = inDenA;
//		int testNumB = inNumB;
//		int testDenB = inDenB;
//
//		Fraction testFracA = new Fraction(testNumA,testDenA);
//		Fraction testFracB = new Fraction(testNumB,testDenB);
//		Fraction testFracSum = testFracA.multiply(testFracB);
//
//		System.out.println("\n===========================================");
//		System.out.println(".multiply() TEST");
//		System.out.print("Fraction A = ");
//		testFracA.print();
//		System.out.println();	
//		System.out.print("Fraction B = ");
//		testFracB.print();
//		System.out.println();
//		System.out.print("A * B = ");
//		testFracSum.print();
//		System.out.println("\n===========================================");
//	}
//
//	/* testDiv
//	 * Test that .divide() actually divides Fractions A over B
//	 * @param inNumA Desired Fraction A numerator
//	 * @param inDenA Desired Fraction A denominator
//	 * @param inNumB Desired Fraction B numerator
//	 * @param inDenB Desired Fraction B denominator
//	 */
//	public static void testDiv(int inNumA, int inDenA,int inNumB, int inDenB) {
//		int testNumA = inNumA;
//		int testDenA = inDenA;
//		int testNumB = inNumB;
//		int testDenB = inDenB;
//
//		Fraction testFracA = new Fraction(testNumA,testDenA);
//		Fraction testFracB = new Fraction(testNumB,testDenB);
//		Fraction testFracSum = testFracA.divide(testFracB);
//
//		System.out.println("\n===========================================");
//		System.out.println(".divide() TEST");
//		System.out.print("Fraction A = ");
//		testFracA.print();
//		System.out.println();	
//		System.out.print("Fraction B = ");
//		testFracB.print();
//		System.out.println();
//		System.out.print("A * B = ");
//		testFracSum.print();
//		System.out.println("\n===========================================");	
//	}
//
//	/*testCreateArray
//	 * NOT IMPLEMENTED
//	 */
//	public static void testCreateArray(int inNum, int inDen) {
//	}
//	/*testSort
//	 * NOT IMPLEMENTED
//	 */
//	public static void testSort(int inNum, int inDen) {
//	}
//	/*testCompare
//	 * NOT IMPLEMENTED
//	 */
//	public static void testCompare(int inNum, int inDen) {
//	}
//	/*testArrayMin
//	 * NOT IMPLEMENTED
//	 */
//	public static void testArrayMin(int inNum, int inDen) {
//	}
//	/*testArrayMax
//	 * NOT IMPLEMENTED
//	 */
//	public static void testArrayMax(int inNum, int inDen) {	
//	}
//}
