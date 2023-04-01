package taxcalculator;

import java.util.Set;

import static taxcalculator.Role.DEVELOPER;

public class FifteenOrTwentyFivePercent extends AbstractTaxStrategy {

	protected FifteenOrTwentyFivePercent() {
		super(Set.of(DEVELOPER), 2000.0, 0.75, 0.85);
	}

}
