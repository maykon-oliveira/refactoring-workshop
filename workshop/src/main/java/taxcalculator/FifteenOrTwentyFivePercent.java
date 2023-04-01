package taxcalculator;

import static taxcalculator.Role.DEVELOPER;

public class FifteenOrTwentyFivePercent implements TaxStrategy {
	@Override
	public boolean hasRequiredRoles(Employee employee) {
		return DEVELOPER.equals(employee.getRole());
	}

	@Override
	public double calculate(Employee employee) {
		if (employee.getBaseSalary() > 2000.0) {
			return employee.getBaseSalary() * 0.75;
		} else {
			return employee.getBaseSalary() * 0.85;
		}
	}
}
