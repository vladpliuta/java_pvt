package homeTask2;
/** summer of member range
 * @author Vladimir Pliuta
*/
public class SumMemberRange {

	public static void main(String[] args) {
		int n = 0; //number of member range 
		double sum = 1;
		
		for (double i = 1; i <= n; i++)
			sum += 1 /i; //summer of member range
		System.out.println("Сумма "+n+" членов ряда равна "+sum);	
	}
}
