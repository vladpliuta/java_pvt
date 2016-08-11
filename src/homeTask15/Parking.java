package homeTask15;

/**
 * запуск программы и создание потоков машин
 * 
 * @author Vladimir Pliuta
 *
 */
public class Parking {

	public static void main(String[] args) {
		// создаем рандомное количество машин, но не меньше 6
		int carNumbers = (int) (Math.random() * 8 + 6);
		for (int i = 1; i <= carNumbers; i++) {
			Thread car = new Thread(new Car(i));
			car.start();
		}
	}
}
