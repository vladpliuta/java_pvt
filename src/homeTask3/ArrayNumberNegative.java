package homeTask3;
/** work with array 
 *<ul>
 *  <li> development and fill array 
 *  <li> count number of negative elements 
 *<ul>
 *@author Vladimir Pliuta
 */
public class ArrayNumberNegative {

	public static void main(String[] args) {
		int [] array = new int [10];//development array
		int countNegative = 0;
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random()*2000-1000); // fill array random value from -1000 to 1000
			if (array[i] < 0) {
				countNegative ++;
			}
		}
	}
}