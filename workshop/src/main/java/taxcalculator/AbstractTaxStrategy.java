package taxcalculator;

public abstract class AbstractTaxStrategy implements TaxStrategy {
	private final double baseSalary;
	private final double greaterPercentage;
	private final double lowerPercentage;

	protected AbstractTaxStrategy(double baseSalary, double greaterPercentage, double lowerPercentage) {
		this.baseSalary = baseSalary;
		this.greaterPercentage = greaterPercentage;
		this.lowerPercentage = lowerPercentage;
	}

	@Override
	public double calculate(Employee employee) {
		if (employee.getBaseSalary() > baseSalary) {
			return employee.getBaseSalary() * greaterPercentage;
		} else {
			return employee.getBaseSalary() * lowerPercentage;
		}
	}
}
