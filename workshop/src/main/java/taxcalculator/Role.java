package taxcalculator;

public enum Role {
    DEVELOPER(new FifteenOrTwentyFivePercent()),
    DBA(new TenOrTwentyPercent()),
    TESTER(new TenOrTwentyPercent());

    private final AbstractTaxStrategy taxCalculator;

    Role(AbstractTaxStrategy taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public AbstractTaxStrategy getTaxCalculator() {
        return taxCalculator;
    }
}
