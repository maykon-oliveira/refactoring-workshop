package taxcalculator;

public interface TaxStrategy {

	boolean hasRequiredRoles(Employee employee);
	double calculate(Employee employee);
}
