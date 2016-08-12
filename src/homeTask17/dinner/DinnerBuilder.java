package homeTask17.dinner;
/**
 * абстактный класс-строитель
 * @author Vladimir Pliuta
 *
 */
public abstract class DinnerBuilder {
	StringBuilder menu = new StringBuilder();

	public abstract void createFirst(String first);

	public abstract void createSecond(String second);

	public abstract void createDesert(String desert);

	public void createHeader(String header) {
		menu.append(header);
		menu.append(" обеденное меню: \n");
	}

	public void createChef(String chef) {
		menu.append("Шеф-повар: ");
		menu.append(chef);
	}

	public void getMenu() {
		System.out.println(menu + ". Приятного аппетита!");
	}

}
