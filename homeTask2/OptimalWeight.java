package homeTask2;
/** calculates optimal weight by height
*@author Vladimir Pliuta
*/
import java.util.Scanner;
public class OptimalWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите свой вес в кг.: ");
		int weight=sc.nextInt(); //input a weight
		
		System.out.println("Введите свой рост в см.: ");
		int height=sc.nextInt(); //input a height

		int optimal = height - 100;
		//calculates optimal weight by height
		if (weight==optimal)	{ 
			System.out.println("Ваш вес оптимален"); 
		}
		else {
			if (weight>optimal) {
				System.out.println("Вам надо похудеть");
			}
			else {
				System.out.println("Вам надо поправиться");
			}
		}
	}

}
