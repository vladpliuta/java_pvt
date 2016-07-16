package homeTask4.homeTaskClass;
/**
 * Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год начала эксплуатации, Пробег. 
 * Создать массив объектов. Вывести:
 * a) список автобусов для заданного номера маршрута;
 * b) список автобусов, которые эксплуатируются больше заданного срока;
 * c) список автобусов, пробег у которых больше заданного расстояния.
 * 
 * @author Vladimir Pliuta
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		//create new list
		List <BusInfo> busBase = new ArrayList <BusInfo> ();
		//filling list
		busBase.add(new BusInfo ("Иванов И.И.", 11, 101, "Икарус", 1990, 500000));
		busBase.add(new BusInfo ("Петров П.П.", 12, 101, "ЛИАЗ", 1980, 900000));
		busBase.add(new BusInfo ("Сидоров С.С.", 13, 303, "ЛИАЗ", 2000, 300000));
		busBase.add(new BusInfo ("Плюта В.Е.", 007, 666, "Volvo", 2016, 1));
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		BusMethods resalt = new BusMethods();//creating methods class object 
		while (!exit) {
			//user menu
			System.out.println("Выберите пунк меню:\n"
					+ "1 - список автобусов для заданного номера маршрута;\n"
					+ "2 - список автобусов, которые эксплуатируются больше заданного срока;\n"
					+ "3 - список автобусов, пробег у которых больше заданного расстояния.\n"
					+ "4 - выход из программы");
			int numberMenu	= sc.nextInt();// scan user version
			switch (numberMenu) {
			case 1:
				System.out.println ("Введите номер маршрута:");
				int routeNumber	= sc.nextInt();
				resalt.busRouteNumber(busBase, routeNumber);// reference to method  
			break;
			case 2:
				System.out.println ("Введите год эксплуатации:");// reference to method  
				int workingTime	= sc.nextInt();
				resalt.busWorkingTime(busBase, workingTime);
			break;
			case 3:
				System.out.println ("Введите пробег:");// reference to method  
				int mileage	= sc.nextInt();
				resalt.busMileage(busBase, mileage);
			break;
			case 4:
				exit = true;
				return;
			}
		}

	}
}


