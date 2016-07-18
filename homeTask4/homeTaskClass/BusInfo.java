package homeTask4.homeTaskClass;
/*
 * 
 */
public class BusInfo {
	//
	private String driverName;
	private int busNumber;
	private int routeNumber;
	private String brend;
	private int year;
	private int mileage;
	
	//MethodDeclaration конструктор1
	public BusInfo (String driverName, int busNumber, int routeNumber, String brend, int year, int mileage) {
		this.driverName = driverName;
		this.busNumber = busNumber;
		this.routeNumber = routeNumber;
		this.brend = brend;
		this.year = year;
		this.mileage =mileage;
	}
	//конструктор2
	public BusInfo (int busNumber, int routeNumber, String brend){
		this.busNumber = busNumber;
		this.routeNumber = routeNumber;
		this.brend = brend;
	}
	
	//гетторы
	public String getDriverName (){
		return driverName;
	}
	public int getBusNumber () {
		return busNumber;
	}
	public int getRouteNumber () {
		return routeNumber;
	}
	public String getBrend () {
		return brend;
	}
	public int getYear () {
		return year;
	}
	public int getMileage () {
		return mileage;
	}
	//сетторы
	public void setDriverName (String driverName) {
		this.driverName = driverName;
	}
	public void setBusNumber (int busNumber) {
		this.busNumber = busNumber;
	}
	public void seRouteNumber (int routeNumber) {
		this.routeNumber = routeNumber;
	}
	public void setBrend (String brend) {
		this.brend = brend;
	}
	public void setYear (int year) {
		this.year = year;
	}
	public void setMileage (int mileage) {
		this.mileage =mileage;
	}
	//переопределение метода toString
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("Ф.И.О. водителя: ").append(driverName);
        sb.append(", № автобуса ").append(busNumber);
        sb.append(", № маршрута").append(routeNumber);
        sb.append(", Марка:  ").append(brend);
        sb.append(", Год начала эксплуатации ").append(year);
        sb.append(", Пробег ").append(mileage).append(" км.}");
        return sb.toString();
    }

}
