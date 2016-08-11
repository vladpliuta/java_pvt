package homeTask15;

/**
 * создание паркинга-семафора и мест на паркинге
 * @author Vladimir Pliuta
 */
import java.util.concurrent.Semaphore;

public class ParkingPlaces {
	// количество мест на паркинге
	public static boolean[] parkingPlaces = new boolean[4];
	public static Semaphore parking = new Semaphore(4);

}
