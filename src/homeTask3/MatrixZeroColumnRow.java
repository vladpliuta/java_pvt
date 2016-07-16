package homeTask3;
/** work with matrix - if element mn matrix A  = 0  create matrix B, in which the column n and row m = 0 
 *
 *@author Vladimir Pliuta
 */
public class MatrixZeroColumnRow {

	public static void main(String[] args) {
		int n = 5, m = 3; //size of matrix
		
		int [][] firstArray = new int [n][m];//development matrix A
		int [][] endArray = new int [n][m];	//development matrix B	
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				firstArray [i][j] = (int) (Math.random()*20-10); // fill matrix A random value from -10 to 10	
				endArray [i][j] = firstArray [i][j];// fill matrix B by elements matrix A
			}
		}
					
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				if (firstArray [i][j] == 0) {// element mn matrix A  = 0
					for (int l = 0; l < m; l++){//fill column by 0
						endArray [i][l] = 0;
					}
					for (int l = 0; l < n; l++){//fill row by 0
						endArray [l][j] = 0;
					}
				}
			}
		}
	}		
}
