package homeTaskOop.insurance.responsibility;

/**
 * страхование гражданской ответственности профессий
 * 
 * @author Vladimir Pliuta
 *
 */
public class ProfessionResponsibility extends Responsibility {
	private int experience;

	// конструктор c расширением от родительского
	public ProfessionResponsibility(String insurer, String insurant, int validity, double contribution,
			boolean designedness, int experience) {
		super(insurer, insurant, validity, contribution, designedness);
		this.experience = experience;
	}

	// переопределенные методы
	@Override
	public double riskPower() {
		double firstRisk = (double) (Math.random() * 20) + super.riskPower();
		double riskPower = firstRisk;
		for (int i = 0; i <= experience; i++) {
			riskPower -= (double) (i * 0.01);
		}
		return riskPower;
	}

	@Override
	public double payout() {
		double firstPayout = super.getContribution() * 5 + super.payout();
		double payout = firstPayout / this.riskPower();
		return payout;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		if (experience > 0) {// проверка соответствия данных
			this.experience = experience;
		} else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
}
