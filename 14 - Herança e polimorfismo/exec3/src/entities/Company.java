package entities;

public class Company extends TaxPlayer {

	private Integer numberOfEmployees;

	public Company() {

	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 14.0 / 100;
		} else {
			return getAnualIncome() * 16.0 / 100;
		}

	}

}
