package invoicegenerator;

public class Main {
	private static EmailSender email;
	private static InvoiceRepository invoiceRepository;
	private static ProvidedService providedService;

	public static void main(String[] args) {
		InvoiceGenerator invoiceGenerator = new InvoiceGeneratorFactory(email, invoiceRepository).build();

		Invoice invoice = invoiceGenerator.generate(providedService);

	}
}
