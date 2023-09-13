package invoicegenerator;

import java.util.List;

public class InvoiceGenerator {
    private InvoiceTax invoiceTax;
    private final List<InvoiceConsumer> invoiceConsumers;

    public InvoiceGenerator(InvoiceTax invoiceTax, List<InvoiceConsumer> invoiceConsumers) {
        this.invoiceTax = invoiceTax;
        this.invoiceConsumers = invoiceConsumers;
    }

    public Invoice generate(ProvidedService providedService) {

        double amount = providedService.getMonthlyAmount();

        Invoice nf = new Invoice(amount, invoiceTax.apply(amount));

        for (InvoiceConsumer consumer : invoiceConsumers) {
            consumer.accept(nf);
        }

        return nf;
    }
}
