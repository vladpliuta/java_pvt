package homeTask3;
/** work with array + formatting
 * <ul>
 *  <li> development and fill array 
 *  <li> search min at array
 *  <li> search max at array
 *  <li> formatting results
 * <ul>
 * 
 * @author Vladimir Pliuta
  */
public class ArrayMinMax {

	public static void main(String[] args) {
		int [] array = new int [10]; //development array - size 10 elements
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int)(Math.random()*100);//fill array from 0 to 100
		}
		
		int min = array [0], max = array [0];	
		for (int i = 0; i < array.length; i++) {
			if (min > array [i]) { // search min
				min = array [i];
			}
			if (max < array [i]) { // search max
				max = array [i];
			}
		}
		// formatting
		System.out.printf ("%12s%2s%10s%n","","|","Значение");
		System.out.printf ("------------------------\n");
		System.out.printf ("%12s%2s%10s%n","min value =","|",min);
		System.out.printf ("%12s%2s%10s%n","max value =","|",max);
	}
}
