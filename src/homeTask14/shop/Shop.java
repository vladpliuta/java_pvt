package homeTask14.shop;

/**
 * запуск программы
 * 
 * @author Vladimir Pliuta
 *
 */
public class Shop {
	public static void main(String args[]) {

		// создаем рандомное количество покупателей, но не меньше 7
		int customerNumbers = (int) (Math.random() * 8 + 7);
		for (int i = 1; i <= customerNumbers; i++) {
			Thread customer = new Thread(new Customer(i));
			customer.start();
		}
	}
}
