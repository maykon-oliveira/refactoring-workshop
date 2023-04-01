package taxcalculator;

import java.util.Set;

public class TenOrTwentyPercent extends AbstractTaxStrategy {

	protected TenOrTwentyPercent() {
		super(Set.of(Role.DBA, Role.TESTER), 3000.0, 0.8, 0.9);
	}

}
