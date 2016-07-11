package homeTask2;
/** output name of day of the week if input date
*@author Vladimir Pliuta
*/
import java.util.Scanner;
public class NameOfDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int day=sc.nextInt(); //input number of day
		
		System.out.println("Введите номер месяца: ");
		int month=sc.nextInt(); //input number of month
		
		System.out.println("Введите год: ");
		int year=sc.nextInt(); //input number of year
		
		
		if ((day >= 1 && day <= 31) || (month >= 1 && month <= 12) || (year >= 1582) ) { //check of date format 
			int month2;
			if (month > 2) {  //month in Roma system
				month2 = month - 2;
			}
			else {
				month2 = month + 10;
			}
			int yearnum = year % 100; //number of year in century
			int century = year / 100; //number of century
			
			//output name of day of the week if input date
			int numday = (day+((13*month2-1)/5)+yearnum+(yearnum/4)+(century/4)-2*century+777)%7;
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
			  case 0:
			  System.out.println("Воскресенье");
			  break;
			}
		}
		else {
			System.out.println("Неверный формат даты");
		}
	}

}
