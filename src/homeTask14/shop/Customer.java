package homeTask14.shop;

/**
 * основная логика
 * 
 * @author Vladimir Pliuta
 *
 */
public class Customer implements Runnable {
	private int customerNumber;

	public Customer(int customerNumber) {
		this.customerNumber = customerNumber;

	}

	@Override
	public void run() {
		System.out.printf("Покупатель №%d подходит к кассам.\n", customerNumber);

		try {
			Producer.prod.acquire();
			int producerPlaceNumber = -1;

			synchronized (Producer.producerPlaces) {
				for (int i = 0; i < Producer.producerNumbers; i++) {
					// проверяем на наличие свободных касс
					if (!Producer.producerPlaces[i]) {
						Producer.producerPlaces[i] = true;
						producerPlaceNumber = i;
						System.out.printf("Касса №%d обслуживает покупателя N%d. ", i + 1, customerNumber);
						Goods.goodsList();
						break;
					}
				}
			}
			// рандомно тупим на кассе
			int time = (int) (Math.random() * 50);
			Thread.sleep(time * 100);
			// освобождаем кассу
			synchronized (Producer.producerPlaces) {
				Producer.producerPlaces[producerPlaceNumber] = false;
				System.out.printf("Касса №%d свободна.\n", producerPlaceNumber + 1);
			}

			Producer.prod.release();
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
