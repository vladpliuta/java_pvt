package homeTask2;
/** quotient of 2 numbers
 * @author Vladimir Pliuta
*/
import java.util.Scanner;
public class Quotient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число: ");
		double num1 = sc.nextInt(); //input first number
		
		System.out.println("Введите второе число: ");
		double num2 = sc.nextInt(); //input second number
		
		double quot = num1/num2; //quotient of 2 numbers 
		System.out.println("Частное равно: "+quot);
	}
}
