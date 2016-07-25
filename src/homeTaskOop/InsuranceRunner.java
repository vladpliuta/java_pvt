package homeTaskOop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
		List <Insurance> insuranceBase = new ArrayList <> ();
						
		insuranceBase.add(new HealthInsurance("Белгосстрах", "Иванов", 12, 12500, 35, 7));
		insuranceBase.add(new LifeInsurance("Белгосстрах", "Петров", 12, 15000, 40, 5));
		insuranceBase.add(new PersonInsurance("Белгосстрах", "Сидоров", 24, 10000, 25));
		insuranceBase.add(new PropertyInsurance("Страхстрах", "Васечкина", 12, 1000, 100000, 9));
		insuranceBase.add(new CarInsurance("Нефтестрах", "Березин", 12, 3200, 89000, 8, 1, 1800));
		insuranceBase.add(new RealtyInsurance("Страхстрах", "Широкава", 36, 57000, 9000000, 8, 20));
		insuranceBase.add(new Responsibility ("Страхужасстрах", "Лаптев", 6, 90000, true));
		insuranceBase.add(new CarResponsibility ("РосМосСтрах", "Жукова", 3, 2000, false, 22, 3000, 1));
		insuranceBase.add(new ProfessionResponsibility ("Перестрах", "Тряпочкина", 6, 500, false, 2));
		
		System.out.printf("Сумма всех страховок равна %,.2f \n",InsurensMethods.sumPayout(insuranceBase));
		
		/*System.out.println("Возростание степени риска");
		Collections.sort(insuranceBase, new Comparator<Insurance>() {//сортировка по возростанию степени риска
	        @Override
	        public int compare (Insurance arg0, Insurance arg1) {
	        	if(arg0.riskPower() == arg1.riskPower()) return 0;
	        	if(arg0.riskPower()<arg1.riskPower()) return 1;
	        	if(arg0.riskPower()>arg1.riskPower()) return -1;
	        	return (int) arg0.riskPower();
	        }
		});  
		 for (Insurance i : insuranceBase) {
	         System.out.println("степень риска"+i.riskPower());
	     }
		*/   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите минимальную сумму страховки");
		double firstPayout	= sc.nextInt();
		
		System.out.println("Введите максимальную сумму страховки");
		double endPayout	= sc.nextInt();
		
		InsurensMethods.findByPayout(insuranceBase,firstPayout,endPayout);
		
	}
}

	


