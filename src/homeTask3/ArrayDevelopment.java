package homeTask3;
/** work with array - development and fill array
 * 
 *@author Vladimir Pliuta
 */
public class ArrayDevelopment {

	public static void main(String[] args) {
		int [] array1 = new int [15];//development array
		// fill array
		array1 [0] = 125;
		array1 [1] = 11;
		array1 [2] = -120; 
		array1 [3] = 34; 
		array1 [4] = 47; 
		array1 [5] = 0;
		array1 [6] = -39; 	
		array1 [7] = 15;	
		array1 [8] = -88;	
		array1 [9] = -39;
		array1 [10] = -30;
		array1 [11] = -16;	
		array1 [12] = 88; 	
		array1 [13] = 205;	
		array1 [14] = 19;
		
		int [] array2 = {11, 25, 39, -24, -56, 11, 16, 88, 14, -66, 89, 0, 5, 9, -100};//development and fill array
		
		int [] array3 = new int [15];//development array
		for (int i = 0; i < array3.length; i++) {
			array3 [i] = (int) (Math.random()*2000-1000); // fill array random value from -1000 to 1000
		}
	}
}
