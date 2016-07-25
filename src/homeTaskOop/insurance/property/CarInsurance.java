package homeTaskOop.insurance.property;

public class CarInsurance extends PropertyInsurance {
	private int lifetime;
	private int engineVolume;
	//конструктор c расширением от родительского
	public CarInsurance(String insurer, String insurant, int validity, double contribution, int coast, int propertyQuality, int lifetime, int engineVolume) {
		super(insurer, insurant, validity, contribution, coast, propertyQuality);
		this.lifetime = lifetime;
		this.engineVolume = engineVolume;
	}
	//гетторы
	public int getLifetime () {
		return lifetime;
	}
	public int getEngineVolume () {
		return engineVolume;
	}
	//сетторы
	public void setLifetime (int lifetime) {
		if (lifetime > 0) {// проверка соответствия данных
			this.lifetime = lifetime;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	public void setEngineVolume (int engineVolume) {
		if (engineVolume > 0) {// проверка соответствия данных
			this.engineVolume = engineVolume;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	//переопределенные методы
	@ Override
	public double riskPower() {
		double firstRisk= (double) (Math.random()*10)+super.riskPower();
		double riskPower = firstRisk;
		//
		// надо эксепсион сунуть что б  lifeQuality > 0
		//
		for (int i = 1; i <= lifetime; i++){
			riskPower += (double) (i* 0.1);
		}
		if (engineVolume > 1600){
			for (int i = 1600; i <= engineVolume; i+=200){
				riskPower += (double) (i* 0.0001);
			}
		}
		return riskPower;
	}
	@Override
	public double payout() {
		double firstPayout = super.getContribution()*2+super.payout();
		double payout = firstPayout/this.riskPower();
		return payout;
	}
}

