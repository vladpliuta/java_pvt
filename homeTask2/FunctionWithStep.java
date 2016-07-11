package homeTask2;
/** Output function from -4 to 4 with step 0.5
 * @author Vladimir Pliuta
 */
public class FunctionWithStep {

	public static void main(String[] args) {
		double y, x;
		for (x = -4; x <= 4; x = x + 0.5) {
			y = 2*x*x - 5*x - 8;
			System.out.println ("При x= "+x+" y= "+y);
		}
	}
}
