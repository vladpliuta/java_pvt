package homeTask3;
/** work with array 
 *<ul>
 *  <li> development and fill array 
 *  <li> transposition zero in array  
 *<ul>
 *@author Vladimir Pliuta
 */
public class ArrayTranspasitZero {

	public static void main(String[] args) {
		int [] array = new int [10];//development array
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random()*20-10); // fill array random value from -10 to 10
		}
		
		for (int i = 0; i < array.length; i++) { 
			if (array[i] == 0) {// search zero
				for (int j = i+1; j < array.length; j++) {// change places
					if (array [j] !=0) { //check beside zero
						array [i] = array [j]; 
						array [j] = 0;
						break;
					}
				}
			}	
		}	
		
	}
}