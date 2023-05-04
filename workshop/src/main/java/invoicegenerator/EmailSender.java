package invoicegenerator;

public interface EmailSender extends InvoiceConsumer {

    void sendEmail(Invoice invoice);
}