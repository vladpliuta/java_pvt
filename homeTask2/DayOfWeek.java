package homeTask2;
/** output name of day on the week
* @author Vladimir Pliuta
*/
import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите номер дня недели: ");
		int numday=sc.nextInt(); //input number of day
		
		//output name of day on the week
		switch (numday) {
		  case 1:
		  System.out.println("Понедельник");
		  break;
		  case 2:
		  System.out.println("Вторник");
		  break;
		  case 3:
		  System.out.println("Среда");
		  break;
		  case 4:
		  System.out.println("Четверг");
		  break;
		  case 5:
		  System.out.println("Пятница");
		  break;
		  case 6:
		  System.out.println("Суббота");
		  break;
		  case 7:
		  System.out.println("Воскресенье");
		  break;
		  default:
		  System.out.println("Ошибка! Такого дня недели не существует");
		}
	}
}
