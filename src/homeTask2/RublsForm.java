package homeTask2;
/** output right form of rubl in range 1 - 999
 * @author Vladimir Pliuta
*/
import java.util.Scanner;
public class RublsForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число рублей в диапазоне от 1 до 999: ");
		int rubl=sc.nextInt(); //input rubl number
		
		//output right form of rubl
		if (rubl >= 1 && rubl <= 999) { // check of range
			if (rubl%10 == 1 && rubl%100 != 11) { // if ends into 1, except for 11 
				System.out.println(rubl + " рубль");
			}
			else { 
				if (rubl%10 >= 2 && rubl%10 <= 4 && (rubl%100 < 10 || rubl%100 > 20)) {
				// 	if ends into 2,3,4 except 12,13,14
					System.out.println(rubl + " рубля");
				}
				else {
				// remaining	
					System.out.println(rubl + " рублей");
				}
			}
		}	
		else {
			System.out.println("Неверный диапазон");
		}
		
	}
}
