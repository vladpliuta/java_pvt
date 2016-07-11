package homeTask2;
/** output factorial of number
* @author Vladimir Pliuta
*/
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число: "); 
		int number=sc.nextInt(); //input number 
		long fact = 1; //и все равно при number=21 уже начинается бег по кругу никакого long не хватает
		
		if (number > 0) {
			for (int i = 2; i <= number; i++)
				fact *= i; //factorial of number
			System.out.println("Факториал "+number+" равен "+fact);
		}
		else {
			System.out.println("Вы ввели отрицательное число, а гамма-функция это явно не второе занятие!");
		}
	}
}
