package homeTaskOop.insurance.person;

/**
 * страхование здоровья личности
 * 
 * @author Vladimir Pliuta
 *
 */
public class HealthInsurance extends PersonInsurance {
	private int healthQuality;

	// конструктор c расширением от родительского
	public HealthInsurance(String insurer, String insurant, int validity, double contribution, int age,
			int healthQuality) {
		super(insurer, insurant, validity, contribution, age);
		this.healthQuality = healthQuality;
	}

	// переопределенные методы
	@Override
	public double riskPower() {
		double firstRisk = (double) (Math.random() * 10) + super.riskPower();
		double riskPower = firstRisk;
		for (int i = 20; i <= healthQuality; i--) {
			riskPower += (double) (i * 0.05);
		}
		return riskPower;
	}

	@Override
	public double payout() {
		double firstPayout = super.getContribution() * 25 + super.payout();
		double payout = firstPayout / this.riskPower();
		return payout;
	}

	public int getHealthQuality() {
		return healthQuality;
	}

	public void setHealthQuality(int healthQuality) {
		// проверка соответствия данных
		if (healthQuality > 0 && healthQuality < 20) {

			this.healthQuality = healthQuality;
		} else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
}
