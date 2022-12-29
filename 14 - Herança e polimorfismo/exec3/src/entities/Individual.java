package entities;

public class Individual extends TaxPlayer {

	private Double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		if (getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 15.0 / 100;
		} else {
			basicTax = getAnualIncome() * 25.0 / 100;
		}
		basicTax -= getHealthExpenditures() * 50.0 / 100;
		if(basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
