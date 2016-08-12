package homeTask17.dinner;
/**
 * класс-директор создающий конкретные меню
 * @author Vladimir Pliuta
 *
 */
public class Director {
	public static void standartBelMenu() {
		DinnerBuilder standartBelMenu = new BelarusDinner();
		standartBelMenu.createHeader("Стандартное");
		standartBelMenu.createFirst("борщ");
		standartBelMenu.createSecond("драники");
		standartBelMenu.createDesert("кампот");
		standartBelMenu.createChef("Иванов");
		standartBelMenu.getMenu();
	}

	public static void extendedBelMenu() {
		DinnerBuilder extendedBelMenu = new BelarusDinner();
		extendedBelMenu.createHeader("Расширенное");
		extendedBelMenu.createFirst("щи");
		extendedBelMenu.createSecond("отбивная");
		extendedBelMenu.createSecond("отварной картофель");
		extendedBelMenu.createDesert("пиво");
		extendedBelMenu.createDesert("кальмары");
		extendedBelMenu.createDesert("рыба");
		extendedBelMenu.createChef("Плюта");
		extendedBelMenu.getMenu();
	}

	public static void standartJapMenu() {
		DinnerBuilder standartJapMenu = new JapaneseDinner();
		standartJapMenu.createHeader("Японское");
		standartJapMenu.createFirst("вода с суши");
		standartJapMenu.createSecond("суши без воды");
		standartJapMenu.createDesert("вода без суши");
		standartJapMenu.createChef("Токугава");
		standartJapMenu.getMenu();
	}

	public static void extendedJapMenu() {
		DinnerBuilder standartJapMenu = new JapaneseDinner();
		standartJapMenu.createHeader("Экстремальное");
		standartJapMenu.createFirst("вода с суши");
		standartJapMenu.createFirst("мисо-суп");
		standartJapMenu.createSecond("суши без воды");
		standartJapMenu.createSecond("какие-то водоросли");
		standartJapMenu.createDesert("саке");
		standartJapMenu.createDesert("саке");
		standartJapMenu.createDesert("саке");
		standartJapMenu.createChef("Токугава-сама");
		standartJapMenu.getMenu();
	}
}
