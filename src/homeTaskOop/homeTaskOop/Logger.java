package homeTaskOop;

/**
 * логгер на основе Singleton
 * @author Vladimir Pliuta
 */
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public enum Logger {
	INSTANCE;

	public void getLog(String info) {
		try (FileWriter log = new FileWriter("log.txt", true)) {
			Date now = new Date();
			DateFormat df = DateFormat.getDateTimeInstance();
			log.write(df.format(now) + " " + info + "\n");
		} catch (IOException ex) {
			System.out.println("File not found.");
		}
	}
}
