package taxcalculator;

import java.util.Set;

public abstract class AbstractTaxStrategy implements TaxStrategy {
	private final Set<Role> roles;
	private final double baseSalary;
	private final double greaterPercentage;
	private final double lowerPercentage;

	protected AbstractTaxStrategy(Set<Role> roles, double baseSalary, double greaterPercentage, double lowerPercentage) {
		this.roles = roles;
		this.baseSalary = baseSalary;
		this.greaterPercentage = greaterPercentage;
		this.lowerPercentage = lowerPercentage;
	}

	@Override
	public boolean hasRequiredRoles(Employee employee) {
		return roles.stream().anyMatch(role -> employee.getRole().equals(role));
	}

	@Override
	public double calculate(Employee employee) {
		if (!this.hasRequiredRoles(employee)) {
			throw new UnsupportedOperationException();
		}

		if (employee.getBaseSalary() > baseSalary) {
			return employee.getBaseSalary() * greaterPercentage;
		} else {
			return employee.getBaseSalary() * lowerPercentage;
		}
	}
}
