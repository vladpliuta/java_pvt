package homeTask2;
/** count sum of members
 * <ul>
 *  <li> first method - general formula
 *  <li> second method - by Gauss formula
 * </ul>
 * @author Vladimir Pliuta
  */
public class SumOfNumbers {

	public static void main(String[] args) {
		// general formula
		int n=0, sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println ("Сумма = "+sum);
		// Gauss formula
		int nG=0;
		int sumG = (nG*(nG+1))/2;
		System.out.println ("Сумма по Гауссу = "+sumG);
	}
}
