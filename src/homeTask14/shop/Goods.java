package homeTask14.shop;

/**
 * список товаров и создание случайного списка
 * 
 * @author Vladimir Pliuta
 *
 */
public enum Goods {
	MILK, BREAD, MEAT, POTATOES, RICE, FISH, BEER, FRUIT, VEGETABLES, BUTTER, SUGAR, SALT, SAUSAGE, SNAG, CAKE, COFFEE, TEA, JUICE, WATER, WHISKEY, CANDY, CHOCOLATE;
	
	// создание списка из немение чем 3 случайных товаров
	public static synchronized void goodsList() {

		int numberGoods = (int) (Math.random() * 6 + 2);

		StringBuffer goodsString = new StringBuffer();
		for (int i = 0; i <= numberGoods; i++) {
			int goodNumber = (int) (Math.random() * 22);
			goodsString.append(Goods.values()[goodNumber]).append(" ");
		}
		System.out.println("Список покупок: " + goodsString);
	}
}
