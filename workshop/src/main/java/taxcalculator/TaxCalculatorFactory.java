package taxcalculator;

import java.util.Set;

public class TaxCalculatorFactory {
	public TaxCalculator build() {
		final var taxes = Set.of(
				new TenOrTwentyPercent(),
				new FifteenOrTwentyFivePercent()
		);
		return new TaxCalculator(taxes);
	}
}
