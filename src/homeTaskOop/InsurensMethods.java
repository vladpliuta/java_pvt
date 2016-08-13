package homeTaskOop;
/**
 * методы для работы с готовой базой страховок
 * @author Vladimir Pliuta
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import homeTaskOop.insurance.Insurance;

public class InsurensMethods {
	// вычисление суммы всех страховок базы
	public static double sumPayout(List<Insurance> insuranceBase) {
		double sum = 0;
		for (Insurance i : insuranceBase) {
			sum += i.payout();
		}
		return sum;
	}

	// выводим страховки соответствующие критериям выбора стоимости
	public static void findByPayout(List<Insurance> insuranceBase, double firstPayout, double endPayout) {
		int count = 0;
		for (Insurance i : insuranceBase) {
			if (i.payout() > firstPayout && i.payout() < endPayout) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("В базе нет подходящих страховок");
		}
	}

	// вывод страховок по степени риска
	public static void sortByRiskPower(List<Insurance> insuranceBase) {
		List<Double> riskPowerBase = new ArrayList<>();
		for (Insurance i : insuranceBase) {
			riskPowerBase.add(i.riskPower());
		}
		Collections.sort(riskPowerBase, new Comparator<Double>() {
			public int compare(Double o1, Double o2) {
				return (int) (o1 - o2);
			}
		});
		for (Double i : riskPowerBase) {
			System.out.println("степень риска   " + i);
		}
	}
}