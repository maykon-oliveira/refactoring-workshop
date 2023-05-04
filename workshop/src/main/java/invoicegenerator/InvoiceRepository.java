package invoicegenerator;

public interface InvoiceRepository extends InvoiceConsumer {
    void persist(Invoice invoice);
}