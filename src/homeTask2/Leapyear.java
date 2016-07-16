package homeTask2;
/** determines if year leapyear or not
*@author Vladimir Pliuta
*/
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите год: ");
		int year = sc.nextInt(); //input a year
		
		//determines if year leapyear or not
		if (year % 4 == 0) {
		   if(year % 100 == 0) {
		      if(year % 400 == 0) {
		         System.out.println("Год високосный");
		      }
		      else {
		         System.out.println("Год не високосный");
		      }
		   }
		   else {
		      System.out.println("Год високосный");
		   }
		}
		else {
		   System.out.println("Год не високосный");
		}
	}
}
