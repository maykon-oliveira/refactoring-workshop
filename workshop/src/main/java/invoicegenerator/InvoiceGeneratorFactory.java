package invoicegenerator;

import java.util.Arrays;

public class InvoiceGeneratorFactory {
	private final EmailSender email;
	private final InvoiceRepository dao;

	public InvoiceGeneratorFactory(EmailSender email, InvoiceRepository dao) {
		this.email = email;
		this.dao = dao;
	}

	public InvoiceGenerator build() {
		return new InvoiceGenerator(Arrays.asList(email, dao));
	}
}
