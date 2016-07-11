package homeTask3;
/** work with strings - compression
 *
 *@author Vladimir Pliuta
 */
public class StringCompression {

	public static void main(String[] args) {
		
		String firstString = new String("waaaddddddyyyuuuuurt");//input text
		String secondString = new String("");
		
		char lastChar = firstString.charAt(0);
		int count = 1;
		
		//compression
		for (int i = 1; i < firstString.length(); i++) {
			if ( firstString.charAt(i)== lastChar){//symbol which repeat
				count ++;
			}
			else {
				secondString += lastChar;
				secondString += count;
				count = 1;
				lastChar = firstString.charAt(i);
			}
		}
		secondString += lastChar;
		secondString += count;
		
		if (secondString.length() < firstString.length()) {
			//return secondString;
			System.out.println ("Строка после сжатия: "+secondString);
		}
		else {
			//return firstString;
			System.out.println ("В сжатии данным способом нет смысла");
		}
			
	}
}
