package homeTask3;
/** work with array 
 *<ul>
 *  <li> development and fill matrix n*n 
 *  <li> output elements of main and secondary diagonals
 *  <li>if it necessary development new array with elements of main and secondary diagonals  
 *<ul>
 *@author Vladimir Pliuta
 */
public class ArrayDiagonals {

	public static void main(String[] args) {
		int n = 5; //size of matrix
		int [][] array = new int [n][n];//development matrix
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++){
				array [i][j] = (int) (Math.random()*20-10); // fill matrix random value from -10 to 10
			}
		}	
		
		System.out.print ("Главная диагональ "); //elements of main diagonal
		for (int i = 0; i < n; i++) { 
			System.out.print (array[i][i]+" | ");
		}
		System.out.print ("\nПобочная диагональ ");//elements of secondary diagonals
		for (int i = 0; i < n; i++) { 
			System.out.print (array[i][(n-1-i)]+" | ");
		}
		int [] newArray = new int[2*n]; //if it necessary development new array with elements of main and secondary diagonals
		for (int i = 0; i < n; i++) { 
			newArray [i] = array[i][i];
			newArray [n+i] = array[i][n-1-i];
		}
	}
}