package homeTask4.homeTaskClass;

import java.util.List;
/*
 * this class contains methods which work with bus base 
 */
public class BusMethods {
	//create method that generate table header 
	public static void header () {
		System.out.printf ("%-20s%11s%10s%10s%12s%11s%n","Ф.И.О. водителя","№ автобуса ","№ маршрута","  Марка  "," Год начала ","Пробег, км.");
		System.out.printf ("%-20s%11s%10s%10s%12s%11s%n","","","","","эксплуатации","");
	}	
	//method that output list string on the condition 
	public void busRouteNumber(List <BusInfo> busBase, int routeNumber){
		header ();
		int k = 0;
		for (BusInfo buss : busBase){
			if (buss.getRouteNumber()==routeNumber) {//condition
				System.out.printf ("%-20s%11d%10d%10s%12d%11d%n",buss.getDriverName(),buss.getBusNumber(),buss.getRouteNumber(),buss.getBrend(),buss.getYear(),buss.getMileage());
			k++;
			}
		}	
		if (k==0) {	
				System.out.println ("Такого маршрута нет в базе.");
		}
	}
	//method that output list string on the condition 
	public void busWorkingTime(List <BusInfo> busBase, int workingTime){
		header ();
		int k = 0;
		for (BusInfo buss : busBase){
			if (buss.getYear()<workingTime) {//condition
				System.out.printf ("%-20s%11d%10d%10s%12d%11d%n",buss.getDriverName(),buss.getBusNumber(),buss.getRouteNumber(),buss.getBrend(),buss.getYear(),buss.getMileage());
				k++;
			}
		}	
		if (k==0) {	
				System.out.println ("Такого маршрута нет в базе.");
		}
	}
	//method that output list string on the condition 
	public void busMileage(List <BusInfo> busBase, int mileage){
		header ();
		int k = 0;
		for (BusInfo buss : busBase){
			if (buss.getMileage()>mileage) {//condition
				System.out.printf ("%-20s%11d%10d%10s%12d%11d%n",buss.getDriverName(),buss.getBusNumber(),buss.getRouteNumber(),buss.getBrend(),buss.getYear(),buss.getMileage());
				k++;
			}
		}	
		if (k==0) {	
				System.out.println ("Такого маршрута нет в базе.");
		}
	}
	
}
