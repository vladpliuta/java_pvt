package homeTask3;
/** work with array 
 * 
 * <ul>
 *  <li> development array with 10 float values
 *  <li> output this array 
 *  <li> output average value
 * </ul>
 * 
 * @author Vladimir Pliuta
 */
public class ArrayAverage {

	public static void main(String[] args) {
		float [] array = new float [10]; //development array - size 10 elements 
		
		int n = 100; // variable, that determine random values
		double sum = 0, average = 0;
		
		for (int i = 0; i < 10; i++) {
			array [i] = (float) (Math.random()*2*n-n); // fill array from -n to n
			System.out.print(array [i]+"|"); //output array elements 
			sum += array [i]; //sum all values
		}
		
		average = sum/10; //calculation of average value
		System.out.println("\naverage value = "+average);// output average value
	}
}
