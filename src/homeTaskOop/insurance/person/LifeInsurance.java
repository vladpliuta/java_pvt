package homeTaskOop.insurance.person;

import homeTaskOop.insurance.Rent;

public class LifeInsurance extends PersonInsurance implements Rent{
	private int lifeQuality;
	//конструктор c расширением от родительского
	public LifeInsurance(String insurer, String insurant, int validity, double contribution, int age, int lifeQuality) {
		super(insurer, insurant, validity, contribution, age);
		this.lifeQuality = lifeQuality;
	}
	//гетторы
	public int getLifeQuality () {
		return lifeQuality;
	}
	//сетторы
	public void setLifeQuality (int lifeQuality) {
		if (lifeQuality > 0 && lifeQuality < 10 ) {// проверка соответствия данных
			this.lifeQuality = lifeQuality;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	//переопределенные методы
	@ Override
	public double riskPower() {
		double firstRisk= (double) (Math.random()*10);
		double riskPower = firstRisk+super.riskPower();
		for (int i = 10; i <= lifeQuality; i--){
			riskPower += (double) (i* 0.05);
		}
		return riskPower;
	}
	@Override
	public double payout() {
		double firstPayout = super.getContribution()*30 + super.payout();
		double payout = firstPayout/this.riskPower();
		return payout;
	}
	// методы интерфейса
	@Override
	public double getTimeRent() {
		double timeRent = 12;
		return timeRent;
	}
	@Override
	public double getPayoutRent() {
		double payoutRent = payout()/getTimeRent(); 
		return payoutRent;
	}
}

