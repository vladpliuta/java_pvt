package homeTaskOop.insurance.person;

/**
 * страхование жизни личности
 * 
 * @author Vladimir Pliuta 
 */
import homeTaskOop.insurance.Rent;

public class LifeInsurance extends PersonInsurance implements Rent {
	private int lifeQuality;

	// конструктор c расширением от родительского
	public LifeInsurance(String insurer, String insurant, int validity, double contribution, int age, int lifeQuality) {
		super(insurer, insurant, validity, contribution, age);
		this.lifeQuality = lifeQuality;
	}

	// переопределенные методы
	@Override
	public double riskPower() {
		double firstRisk = (double) (Math.random() * 10);
		double riskPower = firstRisk + super.riskPower();
		for (int i = 10; i <= lifeQuality; i--) {
			riskPower += (double) (i * 0.05);
		}
		return riskPower;
	}

	@Override
	public double payout() {
		double firstPayout = super.getContribution() * 30 + super.payout();
		double payout = firstPayout / this.riskPower();
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
		double payoutRent = payout() / getTimeRent();
		return payoutRent;
	}

	public int getLifeQuality() {
		return lifeQuality;
	}

	public void setLifeQuality(int lifeQuality) {
		// проверка соответствия данных
		if (lifeQuality > 0 && lifeQuality < 10) {
			this.lifeQuality = lifeQuality;
		} else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
}
