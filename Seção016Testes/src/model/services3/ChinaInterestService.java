package model.services3;

public class ChinaInterestService implements InterestService{
	
	private double interestRate;

	public ChinaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	
}
