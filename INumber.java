/*
 * INTERFACE INumber
 * Defines methods for INumber objects
 * 
 * @author Behrooz Mansouri, Ben Sweeney
 * @version 20230917
 */

public interface INumber<T> {
T plus(T input);
T minus(T input);
T divide(T input);
T multiply(T input);
void print();
}
