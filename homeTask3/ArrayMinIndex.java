package homeTask3;
/** work with array 
 *<ul>
 *  <li> development and fill array 
 *  <li> search min at array
 *  <li> search index of min
 * <ul>
 *@author Vladimir Pliuta
 */
public class ArrayMinIndex {

	public static void main(String[] args) {
		int [] array = new int [15];//development array
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random()*2000-1000); // fill array random value from -1000 to 1000
		}
		int min = array [0], ind = 0;	
		for (int i = 0; i < array.length; i++) {
			if (min > array [i]) { // search min
				min = array [i];
				ind = i; //search index of min
			}
		}
	}
}

