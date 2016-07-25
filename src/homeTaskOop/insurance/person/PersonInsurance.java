package homeTaskOop.insurance.person;

import homeTaskOop.insurance.Insurance;

public class PersonInsurance extends Insurance {
	private int age; 
	//конструктор c расширением от родительского
	public PersonInsurance (String insurer, String insurant, int validity, double contribution, int age) {
		super (insurer, insurant, validity, contribution);
		this.age = age;
	}
	//гетторы
	public int getAge (){
		return age;
	}
	//сетторы
	public void setAge (int age) {
		if (age > 0 && age < 130 ) {// проверка соответствия данных
			this.age = age;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	//переопределенные методы
	@ Override
	public double riskPower() {
		double firstRisk= (double) (Math.random()*10);
		double riskPower = firstRisk;
		if (age > 50) {
			for (int i = age - 50; i <= age; i++){
				riskPower += (double) (i* 0.05);
			}
		}
		return riskPower;
	}
	@ Override
	public double payout() {
		double firstPayout = super.getContribution()*100;
		double payout = firstPayout/this.riskPower();
		return payout;
	}
}
