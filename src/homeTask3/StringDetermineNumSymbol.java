package homeTask3;
/** work with strings - determines whether all symbols found once 
 *
 *@author Vladimir Pliuta
 */
public class StringDetermineNumSymbol {

	public static void main(String[] args) {
		//original text
		String firstString = new String("Pliuta");
		int k = 0;
		
		for (int i = 0; i < firstString.length(); i++){//determines whether all symbols found once 
			k = 0;
			for (int j = 0; j < firstString.length(); j++){
				if (firstString.charAt(i) == firstString.charAt(j)) {
					k++;
				}
				if (k > 1) {
					System.out.println("Не все символы встречаются один раз");
					break;
				}
			}
			if (k > 1) {
				break;
			}
		}
		if (k == 1) {
			System.out.println("Все символы встречаются один раз");
		}
	}	
}
