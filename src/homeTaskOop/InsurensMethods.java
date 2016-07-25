package homeTaskOop;


import java.util.List;

import homeTaskOop.insurance.Insurance;

public class InsurensMethods {

	public static double sumPayout (List <Insurance> insuranceBase) {
		 double sum = 0;
		 for (Insurance i :insuranceBase){
			sum+= i.payout();
		 }		
		return sum;
	}
	public static void findByPayout(List <Insurance> insuranceBase, double firstPayout, double endPayout) {
        int count = 0;
        for (Insurance i : insuranceBase) {
            if (i.payout() > firstPayout && i.payout() < endPayout) {
            count++;
            System.out.println(i);
            }
        }
        if (count == 0){
            System.out.println("В базе нет подходящих страховок");
        }
	}
}