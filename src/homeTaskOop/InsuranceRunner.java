package homeTaskOop;

import java.text.DateFormat;
/**
 * класс запуска приложения, создания списка страховок, меню
 * @author Vladimir Pliuta
 * 
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import homeTaskOop.insurance.Insurance;
import homeTaskOop.insurance.person.HealthInsurance;
import homeTaskOop.insurance.person.LifeInsurance;
import homeTaskOop.insurance.person.PersonInsurance;
import homeTaskOop.insurance.property.CarInsurance;
import homeTaskOop.insurance.property.PropertyInsurance;
import homeTaskOop.insurance.property.RealtyInsurance;
import homeTaskOop.insurance.responsibility.CarResponsibility;
import homeTaskOop.insurance.responsibility.ProfessionResponsibility;
import homeTaskOop.insurance.responsibility.Responsibility;

public class InsuranceRunner {

	public static void main(String[] args) {
		// создаем список страховок всех возможных типов
		List<Insurance> insuranceBase = new ArrayList<>();

		insuranceBase.add(new HealthInsurance("Белгосстрах", "Иванов", 12, 12500, 35, 7));
		insuranceBase.add(new LifeInsurance("Белгосстрах", "Петров", 12, 15000, 40, 5));
		insuranceBase.add(new PersonInsurance("Белгосстрах", "Сидоров", 24, 10000, 25));
		insuranceBase.add(new PropertyInsurance("Страхстрах", "Васечкина", 12, 1000, 100000, 9));
		insuranceBase.add(new CarInsurance("Нефтестрах", "Березин", 12, 3200, 89000, 8, 1, 1800));
		insuranceBase.add(new RealtyInsurance("Страхстрах", "Широкава", 36, 57000, 9000000, 8, 20));
		insuranceBase.add(new Responsibility("Страхужасстрах", "Лаптев", 6, 90000, true));
		insuranceBase.add(new CarResponsibility("РосМосСтрах", "Жукова", 3, 2000, false, 22, 3000, 1));
		insuranceBase.add(new ProfessionResponsibility("Перестрах", "Тряпочкина", 6, 500, false, 2));

		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Locale nowLocale = Locale.getDefault();
		Locale rusLocale = new Locale("ru", "RU");
		Locale engLocale = new Locale("en", "US");

		while (!exit) {
			ResourceBundle rb = ResourceBundle.getBundle("homeTaskOop/languages", nowLocale);
			Logger.INSTANCE.getLog("programm start");
			// вывод текущей даты и времени
			Date now = new Date();
			DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, nowLocale);
			System.out.println(df.format(now));
			// работа с меню
			System.out.println(rb.getString("menu"));
			System.out.println(rb.getString("menuOne"));
			System.out.println(rb.getString("menuTwo"));
			System.out.println(rb.getString("menuThree"));
			System.out.println(rb.getString("menuFour"));
			System.out.println(rb.getString("menuFive"));

			int numMenu = sc.nextInt();
			switch (numMenu) {
			case 1:
				nowLocale = rusLocale;
				Logger.INSTANCE.getLog("select russian language");
				break;
			case 2:
				nowLocale = engLocale;
				Logger.INSTANCE.getLog("select english language");
				break;
			// выводим сумму страховок
			case 3:
				System.out.print(rb.getString("sumPayout"));
				System.out.println(InsurensMethods.sumPayout(insuranceBase) + "\n");
				Logger.INSTANCE.getLog("display the sum of all insurances");
				break;
			// выводим список страховок соответствующих выбору пользователя
			case 4:
				System.out.println(rb.getString("minsum"));
				double firstPayout = sc.nextInt();
				System.out.println(rb.getString("maxsum"));
				double endPayout = sc.nextInt();
				InsurensMethods.findByPayout(insuranceBase, firstPayout, endPayout);
				exit = true;
				Logger.INSTANCE.getLog("to display a list of insurances on the necessary criteria");
				break;
			case 5:
				exit = true;
				break;
			}
			Logger.INSTANCE.getLog("programm end");
		}
	}
}
