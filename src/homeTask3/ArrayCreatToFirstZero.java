package homeTask3;
/** work with array 
 *<ul>
 *  <li> development and fill array 
 *  <li> count creation to first zero 
 *<ul>
 *@author Vladimir Pliuta
 */
public class ArrayCreatToFirstZero {

	public static void main(String[] args) {
		int [] array = new int [10];//development array
		int creat = 0;
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random()*20-10); // fill array random value from -10 to 10
		}
		if (array [0] != 0) {
			creat = 1;
		}
		for (int i = 0; i < array.length; i++) { 	
			if (array[i] != 0) {//count creation to first zero 
				creat *= array [i];
			}
			else {
				break;
			}
		}
	}
}
