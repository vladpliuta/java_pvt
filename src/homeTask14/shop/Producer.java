package homeTask14.shop;

/**
 * управление числом касс
 * 
 * @author Vladimir Pliuta
 */
import java.util.concurrent.Semaphore;

public class Producer {
	public static int producerNumbers = 3;
	public static boolean[] producerPlaces = new boolean[producerNumbers];
	public static Semaphore prod = new Semaphore(producerNumbers);
}