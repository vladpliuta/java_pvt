package homeTask3;
/** work with strings 
 *<ul>
 *  <li> input text
 *  <li> search symbol and if not letter delete 
  *<ul>
 *@author Vladimir Pliuta
 */
public class StringDeleteSymbols {

	public static void main(String[] args) {
		//input text
		String firstString = "В м-*вол25ом WA;LKD[PQKFJc клавO'AGJиату**ры. Ес4811234536/.'.,,ли k больше длины слова,";
		String endString ="";
		
		for (int i = 0; i < firstString.length(); i++) {//search a latter and add it 
			
			if(firstString.charAt(i) >= 65 && firstString.charAt(i) <= 90||
			   firstString.charAt(i) >= 97 && firstString.charAt(i) <= 122||
			   firstString.charAt(i) >= 1040 && firstString.charAt(i) <= 1103||
			   firstString.charAt(i) == ' ') {
				endString +=firstString.charAt(i);//
			}
		}
		System.out.println(firstString);
		System.out.println(endString);
	}
}
