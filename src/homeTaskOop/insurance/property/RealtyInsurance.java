package homeTaskOop.insurance.property;

import homeTaskOop.insurance.Rent;

public class RealtyInsurance extends PropertyInsurance implements Rent {
	private int cadastre;
	///конструктор c расширением от родительского	
	public RealtyInsurance(String insurer, String insurant, int validity, double contribution, int coast, int propertyQuality, int cadastre) {
		super(insurer, insurant, validity, contribution, coast, propertyQuality);
		this.cadastre = cadastre;
	}
	//гетторы
	public int getCadastre () {
		return cadastre;
	}
	//сетторы
	public void setCadastre (int cadastre) {
		if (cadastre > 0 && cadastre < 50 ) {// проверка соответствия данных
			this.cadastre = cadastre;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	//переопределенные методы
	@ Override
	public double riskPower() {
		double riskPower = (double) (Math.random()*10)+super.riskPower();
		return riskPower;
	}
	@Override
	public double payout() {
		double firstPayout = super.getContribution()*10+super.payout();
		double payout = firstPayout*cadastre/this.riskPower();
		return payout;
	}
	// методы интерфейса
	@Override
	public double getTimeRent() {
		double timeRent = 6;
		return timeRent;
	}
	@Override
	public double getPayoutRent() {
		double payoutRent = payout()/getTimeRent(); 
		return payoutRent;
	}
}

