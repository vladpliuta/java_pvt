package homeTaskOop.insurance.property;

import homeTaskOop.insurance.Insurance;

public class PropertyInsurance extends Insurance {
	private int coast;
	private int propertyQuality;
	//конструктор c расширением от родительского
	public PropertyInsurance(String insurer, String insurant, int validity, double contribution, int coast, int propertyQuality) {
		super(insurer, insurant, validity, contribution);
		this.coast = coast;
		this.propertyQuality = propertyQuality;
	}
	//гетторы
	public int getCoast (){
		return coast;
	}
	public int getPropertyQuality (){
		return propertyQuality;
	}
	//сетторы
	public void setCoast (int coast) {
		if (coast > 0) {// проверка соответствия данных
			this.coast = coast;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	public void setPropertyQuality (int propertyQuality) {
		if (propertyQuality > 0 && propertyQuality < 10 ) {// проверка соответствия данных
			this.propertyQuality = propertyQuality;
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
		for (int i = 10; i <= propertyQuality; i--){
			riskPower += (double) (i* 0.05);
		}
		return riskPower;
	}
	@Override
	public double payout() {
		double firstPayout = super.getContribution()*10;
		double payout = (firstPayout + coast)/this.riskPower();
		return payout;
	}
}
