package homeTaskOop.insurance.responsibility;

/**
 * страхование гражданской ответственности 
 * 
 * @author Vladimir Pliuta 
 */
import homeTaskOop.insurance.Insurance;

public class Responsibility extends Insurance {
	private boolean designedness;

	// конструктор c расширением от родительского
	public Responsibility(String insurer, String insurant, int validity, double contribution, boolean designedness) {
		super(insurer, insurant, validity, contribution);
		this.designedness = designedness;
	}

	// переопределенные методы
	@Override
	public double riskPower() {
		double firstRisk = (double) (Math.random() * 10);
		double riskPower = firstRisk;
		if (designedness) {
			riskPower = firstRisk * 5;
		}
		return riskPower;
	}

	@Override
	public double payout() {
		double firstPayout = super.getContribution() * 50;
		double payout = firstPayout / this.riskPower();
		return payout;
	}

	public boolean getDesignedness() {
		return designedness;
	}

	public void setDesignedness(boolean designedness) {
		this.designedness = designedness;
	}
}
