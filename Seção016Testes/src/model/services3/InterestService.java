package model.services3;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
	
	default double paymentUsa(double amountUsa, int monthsUsa) {
		if (monthsUsa < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amountUsa * Math.pow(1.0 + getInterestRate() / 100.0, monthsUsa);
	}
	
	default double paymentChina(double amountChi, double monthsChi) {
		if (monthsChi < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amountChi * Math.pow(1.0 + getInterestRate() / 100.00, monthsChi);
	}	
		
}