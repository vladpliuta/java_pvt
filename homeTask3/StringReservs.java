package homeTask3;
/** work with strings - determine if first text is revers of second
 *
 *@author Vladimir Pliuta
 */
public class StringReservs {
	
	public static void main(String[] args) {
		//original text
		String firstString = new String("KOT");//input first text
		String secondString = new String("TOK");//input second text
		
		if ( firstString.length() == secondString.length()){//compares string length
			char[] arrayFirstString = firstString.toCharArray();// format into array of chars first text
			char[] arraySecondString = secondString.toCharArray();// format into array of chars second text
			//arrange letters of first text in order
			for (int i = arrayFirstString.length-1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (arrayFirstString[j] >arrayFirstString[j+1]) {
						char stakan = arrayFirstString[j];
						arrayFirstString[j] = arrayFirstString[j+1];
						arrayFirstString[j+1] = stakan;
					}
				}
			}
			//arrange letters of first text in order
			for (int i = arraySecondString.length-1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (arraySecondString[j] >arraySecondString[j+1]) {
						char stakan = arraySecondString[j];
						arraySecondString[j] = arraySecondString[j+1];
						arraySecondString[j+1] = stakan;
					}
				}
			}
			boolean revers = true;
			//compare first text to second text
			for (int i = 0; i < arrayFirstString.length; i++) {
				if(arrayFirstString[i] != arraySecondString[i])	{
					revers = false;
					break;
				}
			}
			if (revers) {
				System.out.println ("Строки являются перестановкой друг друга");
			}	
			else {
				System.out.println ("Строки не являются перестановкой друг друга");
			}
		}
		else {
			System.out.println ("Строки не сопадают");
		}
	}
}
