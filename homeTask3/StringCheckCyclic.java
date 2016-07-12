package homeTask3;
/** work with strings - check fact that second text is cyclic shift of first text
*
*@author Vladimir Pliuta
*/
public static boolean isSubstring (String s1, String s2) { //create method
		/* я бы конечно назвал бы firstString и secondString, 
		 * ведь типа цифры в названии перевеменных это не красиво - 
		 * но увы увы - таково условие задачи
		 */
		boolean resalt = false;
		//check cyclic shift
		if (s1.length() == s1.length()) {
			for(int i = 0; i < s1.length(); i++) {
				String temp = "".concat(s1.substring(i,s1.length())).concat(s1.substring(0,i)) ;
				if (s2.equals(temp)) {
					resalt = true;
					break;
				}
			}
		}
		// output results
		if (resalt) {
			System.out.println ("Строка 2 получена циклическим сдвигом строки 1");
		}
		else {
			System.out.println ("Строка 2 получена НЕ циклическим сдвигом строки 1");
		}
		return resalt;
	}
	
	
	public static void main(String[] args) {
		String firstString = new String("erbottlewat");//input first text 
		String secondString = new String("waterbottle");//input second text
		isSubstring(firstString,secondString);
			
	}	
}

