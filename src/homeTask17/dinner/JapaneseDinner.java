package homeTask17.dinner;
/**
 * японское меню на основе строителя
 * @author Vladimir Pliuta
 *
 */
public class JapaneseDinner extends DinnerBuilder {

	@Override
	public void createFirst(String first) {
		menu.append(" - ичи: ");
		menu.append(first);
		menu.append(".\n");
	}

	@Override
	public void createSecond(String second) {
		menu.append(" - ни: ");
		menu.append(second);
		menu.append(".\n");
	}

	@Override
	public void createDesert(String desert) {
		menu.append(" - сан: ");
		menu.append(desert);
		menu.append(".\n");
	}
}
