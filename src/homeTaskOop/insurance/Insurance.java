package homeTaskOop.insurance;

public abstract class Insurance {
	private static int idCount;
	private int idPolice;
	private String insurer;
	private String insurant;
	private int validity;
	private double contribution;
	//конструктор родительский
	public Insurance(String insurer, String insurant, int validity,double contribution) {
		this.idPolice = ++idCount;
		this.insurer = insurer;
		this.insurant = insurant;
		this.validity = validity;
		this.contribution = contribution;
	}
	//гетторы
	public int getIdPolice (){
		return idPolice;
	}
	public String getInsurer (){
		return insurer;
	}
	public String getInsurant (){
		return insurant;
	}
	public int getValidity (){
		return validity;
	}
	public double getContribution (){
		return contribution;
	}
	//сетторы
	public void setIdPolice (int idPolice) {
		this.idPolice = ++idCount;
	}
	public void setInsurer (String  insurer) {
		this.insurer = insurer;
	}
	public void setInsurant (String  insurant) {
		this.insurant = insurant;
	}
	public void setValidity (int validity) {
		if (validity > 0 ) { // проверка соответствия данных
			this.validity = validity;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	public void setContribution (double contribution) {
		if (contribution > 0 ) {// проверка соответствия данных
			this.contribution = contribution;
		}
		else {
			throw new IllegalArgumentException("Некорректные данные");
		}
	}
	// abstract methods
	public abstract double riskPower();
	
	public abstract double payout();
	//переопределение метода toString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Страховка");
		sb.append(" №").append(idPolice);
		sb.append(", Страховщик: ").append(insurer);
		sb.append(", Страхователь: ").append(insurant);
		sb.append(", Срок действия: ").append(validity).append(" мес.");
		sb.append(", Взнос ").append(contribution).append("}");
		return sb.toString();
	}	
}
