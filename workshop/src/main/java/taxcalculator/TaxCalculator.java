package taxcalculator;

import java.util.Set;

public class TaxCalculator {

	private final Set<TaxStrategy> taxes;

	public TaxCalculator(Set<TaxStrategy> taxes) {
		this.taxes = taxes;
	}

	public double calculateTax(Employee employee) {
		for (TaxStrategy tax : taxes) {
			if (tax.hasRequiredRoles(employee)) {
				return tax.calculate(employee);
			}
		}

		throw new RuntimeException("invalid employee");
	}

}