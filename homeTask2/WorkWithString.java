package homeTask2;
/** working with string 
 * <ul>
 * 	<li>create string's variable
 *  <li>output number of symbols
 *	<li>output half of length
 * </ul>
 * @author Vladimir Pliuta
 */
public class WorkWithString {

	public static void main(String[] args) {
		
		String str1 = new String("Vadim Radchikov excruciates us but for our profit and advantage");
		//create string variable
		
		int length = str1.length(); //determine number of symbols
		
		System.out.println("Длина строки = " + length); //output number of symbols
		
		String str2 = str1.substring(0,length/2); //create new string variable = first 1/2 initial string
		String str3 = str1.substring(length/2); //create new string variable = end 1/2 initial string
		
		//output half of length
		System.out.println(str2);
		System.out.println(str3);
	}
}