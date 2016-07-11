package homeTask3;
/** work with strings - check fact that second text is cyclic shift of first text
*
*@author Vladimir Pliuta
*/
public class StringCheckCyclic {

	public static void main(String[] args) {
		String firstString = new String("erbottlewat");//input first text 
		String secondString = new String("waterbottle");//input second text
		boolean resalt = false;
		//check cyclic shift
		if (firstString.length() == secondString.length()) {
			for(int i = 0; i < firstString.length(); i++) {
				String temp = "".concat(firstString.substring(i,firstString.length())).concat(firstString.substring(0,i)) ;
				if (secondString.equals(temp)) {
					resalt = true;
					break;
				}
			}
		}
		if (resalt) {
			System.out.println ("Строка 2 получена циклическим сдвигом строки 1");
		}
		else {
			System.out.println ("Строка 2 получена НЕ циклическим сдвигом строки 1");
		}
		//return resalt;
	
	}	
}
