package entities;

public class dollarConverter {
	public static final double IOF = 1.06;
	
	public static  double amountPaid(double dollarPrice, double dollarsBought) {
		return dollarsBought * IOF *dollarPrice;
	}

}
