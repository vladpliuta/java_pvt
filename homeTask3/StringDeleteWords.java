package homeTask3;
/** work with strings - delete words, that have need length and need first letter 
 *
 *@author Vladimir Pliuta
 */
public class StringDeleteWords {

	public static void main(String[] args) {
		//original text
		String firstString = new String("Vadim Radchikov excruciates us but for our profit and advantage");
		int needLenght = 3; //input need length
		String endString = "";
		String [] words = firstString.split(" ");//array of words
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == needLenght && //search words that have need length 
				//search words that have need first letter
				(!words[i].startsWith("a")&&!words[i].startsWith("A")//for english letters
				&&!words[i].startsWith("e")&&!words[i].startsWith("E")
				&&!words[i].startsWith("i")&&!words[i].startsWith("I")
				&&!words[i].startsWith("o")&&!words[i].startsWith("O")
				&&!words[i].startsWith("u")&&!words[i].startsWith("U")
				&&!words[i].startsWith("y")&&!words[i].startsWith("Y")
				&&!words[i].startsWith("а")&&!words[i].startsWith("А")//for russian
				&&!words[i].startsWith("е")&&!words[i].startsWith("Е")
				&&!words[i].startsWith("и")&&!words[i].startsWith("�?")
				&&!words[i].startsWith("о")&&!words[i].startsWith("О")
				&&!words[i].startsWith("у")&&!words[i].startsWith("У")
				&&!words[i].startsWith("ы")&&!words[i].startsWith("Ы")
				&&!words[i].startsWith("э")&&!words[i].startsWith("Э")
				&&!words[i].startsWith("ю")&&!words[i].startsWith("Ю")
				&&!words[i].startsWith("я")&&!words[i].startsWith("Я"))) {}
			//смотришь на эту порнографию и думаешь: срочно надо разбираться с регулярными выражениями
			else {
				endString += " "+words[i];//sum need words
			}
		}
		endString = endString.trim();//delete spaces at beginning and end
		
		System.out.println(firstString);
		System.out.println(endString);
	}

}
