package homeTask3;
/** work with array 
 *<ul>
 *  <li> development and fill array 
 *  <li> search max at array
 *  <li> search index of max
 * <ul>
 *@author Vladimir Pliuta
 */
public class ArrayMaxIndex {

	public static void main(String[] args) {
		int [] array = new int [15];//development array
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random()*2000-1000); // fill array random value from -1000 to 1000
		}
		int max = array [0], ind = 0;	
		for (int i = 0; i < array.length; i++) {
			if (max < array [i]) { // search max
				max = array [i];
				ind = i; //search index of max
			}
		}
	}
}
