package homeTask3;
/** work with strings 
 *<ul>
 *  <li> input english text
 *  <li> determine number of letters and output them
  *<ul>
 *@author Vladimir Pliuta
 */
public class StringDetermineNumber {

	public static void main(String[] args) {
		//input english text
		String firstString = new String("Vadim Radchikov excruciates us, but for our profit and advantage");
		
		char[] arrayFirstString = firstString.toCharArray();// format into array of chars
		int[] arrayNumberChars = new int[arrayFirstString.length];////development array which size = array of chars
		
		for (int i = 0; i <arrayFirstString.length; i++){// output formatted string 
			System.out.printf ("%-3s",arrayFirstString[i]);
			
		}
		System.out.println("");
		//determine number of letters and output them
		for (int i = 0; i <arrayFirstString.length; i++){
			arrayNumberChars [i] = (int) arrayFirstString [i]; //determine number of letters in  UTF 
			if (arrayNumberChars [i] >= 65 &&  arrayNumberChars [i] <= 90 ) { //if letter is big english
				arrayNumberChars [i] = arrayNumberChars [i] - 64;
				System.out.printf ("%-3d",arrayNumberChars [i]);
			} else if (arrayNumberChars [i] >= 97 &&  arrayNumberChars [i] <= 122) { //if letter is small english
				arrayNumberChars [i] = arrayNumberChars [i] - 96;
				System.out.printf ("%-3d",arrayNumberChars [i]);
			} else { //if symbol is not english
				System.out.print ("   ");
			}
		}	
	}

}
