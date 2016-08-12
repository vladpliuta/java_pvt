package homeTask17.dinner;
/**
 * белорусское меню на основе строителя
 * @author Vladimir Pliuta
 *
 */
public class BelarusDinner extends DinnerBuilder {
	
	@Override
	public void createFirst(String first) {
		menu.append(" - первое: ");
		menu.append(first);
		menu.append(".\n");
	}
	@Override
	public void createSecond(String second) {
		menu.append(" - второе: ");
		menu.append(second);
		menu.append(".\n");
	}

	@Override
	public void createDesert(String desert) {
		menu.append(" - десерт: ");
		menu.append(desert);
		menu.append(".\n");
	}

	
}
