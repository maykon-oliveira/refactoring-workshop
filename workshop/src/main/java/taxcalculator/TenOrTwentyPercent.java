package taxcalculator;

import static taxcalculator.Role.DBA;
import static taxcalculator.Role.TESTER;

public class TenOrTwentyPercent implements TaxStrategy {
	@Override
	public boolean hasRequiredRoles(Employee employee) {
		return DBA.equals(employee.getRole()) || TESTER.equals(employee.getRole());
	}

	@Override
	public double calculate(Employee employee) {
		if (employee.getBaseSalary() > 3000.0) {
			return employee.getBaseSalary() * 0.8;
		} else {
			return employee.getBaseSalary() * 0.9;
		}
	}
}
