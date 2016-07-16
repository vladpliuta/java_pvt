package homeTask3;
/** work with strings 
 *<ul>
 *  <li> replace  kth letter by symbol in every word 
 *  <li> if k is greater than length of the words, not to carry out
 *<ul>
 *@author Vladimir Pliuta
 */
import java.util.Scanner;
public class StringReplaseLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//original text
		String firstString = "В каждом слове текста k­ю букву заменить заданным символом c клавиатуры. Если k больше длины слова,";
		int k = 3; // input K
		
		System.out.println("Введине символ замены");
		String symbol = sc.nextLine(); //input symbol
		
		String [] words = firstString.split(" ");//array of words
		
		for (int i = 0; i < words.length; i++){
			if (k  < words[i].length()) {//if k is greater than length of the words, not to carry out
				//replacement
				String temp = "".concat(words[i].substring(0, k-1)).concat(symbol).concat(words[i].substring(k, words[i].length()));
				words[i] = temp;
			}
			System.out.print(" "+words[i]);
		}
			
	}
}