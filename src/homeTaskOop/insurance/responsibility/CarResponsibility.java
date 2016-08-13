package homeTaskOop.insurance.responsibility;

/**
 * страхование гражданской ответственности автомобилей
 * 
 * @author Vladimir Pliuta
 *
 */
public class CarResponsibility extends Responsibility {
	private int lifetime;
	private int engineVolume;
	private int experience;

	// конструктор c расширением от родительского
	public CarResponsibility(String insurer, String insurant, int validity, double contribution, boolean designedness,
			int lifetime, int engineVolume, int experience) {
		super(insurer, insurant, validity, contribution, designedness);
		this.lifetime = lifetime;
		this.engineVolume = engineVolume;
		this.experience = experience;
	}

	// переопределенные методы
	@Override
	public double riskPower() {
		double firstRisk = (double) (Math.random() * 10) + super.riskPower();
		double riskPower = firstRisk;
		for (int i = 1; i <= lifetime; i++) {
			riskPower += (double) (i * 0.1);
		}
		if (engineVolume > 1600) {
			for (int i = 1600; i <= engineVolume; i += 200) {
				riskPower += (double) (i * 0.0001);
			}
		}
		if (experience <= 3) {
			riskPower *= 1.5;
		}
		return riskPower;
	}

	@Override
	public double payout() {
		double firstPayout = super.getContribution() + super.payout();
		double payout = firstPayout / this.riskPower();
		return payout;
	}

	public int getLifetime() {
		return lifetime;
	}

	public int getEngineVolume() {
		return engineVolume;
	}

	public int getExperience() {
		return experience;
	}

	public void setLifetime(int lifetime) {
		if (lifetime > 0) {// проверка соответствия данных
			this.lifetime = lifetime;
		} else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}

	public void setEngineVolume(int engineVolume) {
		if (engineVolume > 0) {// проверка соответствия данных
			this.engineVolume = engineVolume;
		} else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}

	public void setExperience(int experience) {
		if (experience > 0) {// проверка соответствия данных
			this.experience = experience;
		} else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
}