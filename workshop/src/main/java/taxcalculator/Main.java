package taxcalculator;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		final var calculator = new TaxCalculator();

		calculator.calculateTax(new Employee(1, "Maykon", Role.DBA, Calendar.getInstance(), 1.500));
	}
}
