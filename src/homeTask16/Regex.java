package homeTask16;

public class Regex {

	public static void main(String[] args) {
		//System.out.println("gy <p hh> jhijhge 2d0325n1 0fnf  </p>  <tr>".replaceAll(regex, replacement));
		System.out.println(" <p  id=”p1”> gy <p hh> ioh </p> oi<pf> jhijhge 2d0325n1 0fnf  </p>  <tr>".
				replaceAll("<p([^>]*)>", "<p>"));
	}

}
