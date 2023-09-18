/*
 * CLASS Fraction
 * Create fraction objects with numerator and denominator inputs.
 * Perform arithmetic with fraction objects that behaves like traditional arithmetic
 * 
 * @author Ben Sweeney, Jere Perisic, Abby Pitcairn, Esther Mugish
 * 
 * @version 20230913
 * 
 * TODO: add a private method to reduce fractions
 */

public class Fraction implements INumber <Fraction>, Comparable<Fraction>{

	private int n;
	private int d;




	/*************Functional Methods**************/

	/* PUBLIC METHOD plus
	 * Add two Fraction objects together and produce a non-reduced Fraction
	 * Author: Ben Sweeney
	 * @param input Fraction object to add to this fraction
	 */
	public Fraction plus(Fraction input) {
		int convFracDen = 0;
		int convFracNum = 0;
		int inputConvertNum = 0;
		
		if ((this.d != input.getD()) && (this.n!=0) && (input.getNum()!=0)) {
			convFracDen = this.d * input.getD();
			convFracNum = this.n * input.getD();

			//int inputConvertDen = input.getD() * this.d;
			inputConvertNum = input.getNum() * this.d;
		}
		else {
			convFracDen = this.d;
			convFracNum = this.n;
			inputConvertNum = input.getNum();
		}

		int plusNum = convFracNum + inputConvertNum;

		Fraction newPlusFrac = new Fraction(plusNum, convFracDen);
		return newPlusFrac;
	}

	/* PUBLIC METHOD minus 
	 * Subtract a fraction object from this fraction object and produce a non-reduced Fraction
	 * Author: Ben Sweeney
	 * @param input Fraction object to subtract from this fraction
	 */
	public Fraction minus(Fraction input) {
		int convFracDen = 0;
		int convFracNum = 0;
		int inputConvertNum = 0;
		
		if ((this.d != input.getD()) && (this.n!=0) && (input.getNum()!=0)) {
			convFracDen = this.d * input.getD();
			convFracNum = this.n * input.getD();

			//int inputConvertDen = input.getD() * this.d;
			inputConvertNum = input.getNum() * this.d;
		}
		else {
			convFracDen = this.d;
			convFracNum = this.n;
			inputConvertNum = input.getNum();
		}
		
		int minusNum = convFracNum - inputConvertNum;

		Fraction newPlusFrac = new Fraction(minusNum, convFracDen);
		return newPlusFrac;
	}

	/* PUBLIC METHOD divide 
	 * Subtract a fraction object from this fraction object and produce a non-reduced Fraction
	 * Author: 
	 * @param input Fraction object to subtract from this fraction
	 */
	public Fraction divide(Fraction input) {
		return new Fraction((this.n * input.getD()), (this.d * input.getNum()));
	}

	/* PUBLIC METHOD multiply
	 * Subtract a fraction object from this fraction object and produce a non-reduced Fraction 
	 * Author:
	 * @param input Fraction object to subtract from this fraction
	 */
	public Fraction multiply(Fraction input) {
		return new Fraction((this.n * input.getNum()), (this.d * input.getD()));
	}



	/* compare method	
	 * Author:Abby Pitcairn
	 * @param num Input fraction object being compared to this Fraction
	 * @return Return a -1 if this fraction is smaller than the input. Return a 1 if larger. Otherwise, return 0.
	 */
	public int compare(Fraction num){
		double firstNum =  (double)this.n / (double)this.d;
		double secondNum = (double)num.getNum() /num.getD();

		//System.out.println("this.n = " + this.n + " this.d = "+ this.d);
		//System.out.println("num.getNum() = " + num.getNum() + " num.getD() = "+ num.getD());

		//System.out.println("firstnum: " + firstNum + ", secondnum: " + secondNum);
		
		if(firstNum<secondNum){
			return -1;
		}else if(firstNum>secondNum){
			return 1;
		}else{
			return 0;
		}
	}

	/* compare method	
	 * Author:Abby Pitcairn
	 * @param num Input fraction object being compared to this Fraction
	 * @return Return a -1 if this fraction is smaller than the input. Return a 1 if larger. Otherwise, return 0.
	 */
	public int compareTo(Fraction num){
		double firstNum =  (double)this.n / (double)this.d;
		double secondNum = (double)num.getNum() /num.getD();

		//System.out.println("this.n = " + this.n + " this.d = "+ this.d);
		//System.out.println("num.getNum() = " + num.getNum() + " num.getD() = "+ num.getD());

		//System.out.println("firstnum: " + firstNum + ", secondnum: " + secondNum);
		
		if(firstNum<secondNum){
			return -1;
		}else if(firstNum>secondNum){
			return 1;
		}else{
			return 0;
		}
	}

	
	/*************Constructors, getters, setters, print**************/
	/**
	 * Constructor for Fraction objects
	 * Authors: Ben Sweeney, Abby Pitcairn
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public Fraction(int newNumerator, int newDenominator) {
		//super();
		if (newDenominator == 0)
			throw new IllegalArgumentException("Denominator cannot be zero");
		this.n = newNumerator;
		this.d = newDenominator;
	}
	/**
	 * Default constructor
	 * Author: Ben Sweeney
	 * @param numerator
	 * @param denominator
	 */
	public Fraction() {
		this.n = 0;
		this.d = 1;
	}

	/*
	 * PUBLIC METHOD setNum
	 * @param The new numerator value
	 */
	public void setNum(int n) {
		this.n = n;
	}

	/* PUBLIC METHOD getNum
	 * @return The value of this Fraction's numerator
	 */
	public int getNum() {
		return n;
	}

	/*
	 * PUBLIC METHOD getD
	 * @return The value of this Fraction's denominator
	 */
	public int getD() {
		return d;
	}

	/*
	 * PUBLIC METHOD setD
	 * @param The new denominator value
	 */
	public void setD(int d) {
		this.d = d;
	}
	/*
	 * PUBLIC METHOD print
	 * Interface-specified void print method
	 */
	public void print() {
		System.out.print(this.n + "/" + this.d);
	}
	
	/*
	 * PUBLIC METHOD toPrint
	 * Custom printing string for easier in-line use
	 */
	public String toPrint() {
		return this.n + "/" + this.d;
	}
}
