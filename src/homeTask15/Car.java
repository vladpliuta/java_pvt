package homeTask15;

/**
 * класс основной логики
 * 
 * @author Vladimir Pliuta
 * 
 */
public class Car implements Runnable {
	private int carNum;

	public Car(int carNum) {
		this.carNum = carNum;
	}

	// метод паркует машину
	public synchronized void parking() {
		int parkingPlaceNumber = -1;
		for (int i = 0; i < 4; i++) {
			// проверяем на наличие свободных мест
			if (!ParkingPlaces.parkingPlaces[i]) {
				ParkingPlaces.parkingPlaces[i] = true;
				parkingPlaceNumber = i;
				System.out.printf("Машина №%d припаркована на месте #%d. \n", carNum, i + 1);
				break;
			}
		}
		// время стоянки
		int time = (int) (Math.random() * 50);
		try {
			Thread.sleep(time * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// освобождаем машиноместо
		ParkingPlaces.parkingPlaces[parkingPlaceNumber] = false;
		System.out.printf("       Место #%d свободно.\n", parkingPlaceNumber + 1);
	}

	@Override
	public void run() {
		System.out.printf("Машина №%d подъезжает к автостоянке.\n", carNum);
		try {
			if (ParkingPlaces.parking.availablePermits() > 0) {
				ParkingPlaces.parking.acquire();
				parking();
				ParkingPlaces.parking.release();
			} else { // обеспечиваем при занятых местах время ожидания, и если
						// места не освободились уезжаем
				System.out.printf("Машина №%d ждет.\n", carNum);
				Thread.sleep(1000);
				if (ParkingPlaces.parking.availablePermits() > 0) {
					ParkingPlaces.parking.acquire();
					parking();
					ParkingPlaces.parking.release();
				} else {
					System.out.printf("Машина №%d не дождалась и уехала.\n", carNum);
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
