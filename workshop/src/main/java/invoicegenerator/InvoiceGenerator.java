package invoicegenerator;

import java.util.List;

public class InvoiceGenerator {

    private final List<InvoiceConsumer> invoiceConsumers;

    public InvoiceGenerator(List<InvoiceConsumer> invoiceConsumers) {
        this.invoiceConsumers = invoiceConsumers;
    }

    public Invoice generate(ProvidedService providedService) {

        double amount = providedService.getMonthlyAmount();

        Invoice nf = new Invoice(amount, simpleTax(amount));

        for (InvoiceConsumer consumer : invoiceConsumers) {
            consumer.accept(nf);
        }

        return nf;
    }

    private double simpleTax(double value) {
        return value * 0.06;
    }
}
