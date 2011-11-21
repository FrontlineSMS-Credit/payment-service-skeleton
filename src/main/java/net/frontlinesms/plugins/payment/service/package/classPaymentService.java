package net.frontlinesms.plugins.payment.service.${sub:package};

import org.creditsms.plugins.paymentview.data.domain.*;
import org.creditsms.plugins.paymentview.data.domain.OutgoingPayment.Status;
import org.creditsms.plugins.paymentview.data.repository.*;

import net.frontlinesms.data.domain.PersistableSettings;
import net.frontlinesms.plugins.payment.service.*;
import net.frontlinesms.serviceconfig.*;

@ConfigurableServiceProperties(name="${sub:service}", icon="/icons/example_icon.png")
public class ${sub:class}PaymentService implements PaymentService {
	/** Prefix attached to every property name. */
	private static final String PROPERTY_PREFIX = "plugins.payment.${sub:package}.";

	/** The general convention for specifying property keys. */
	static final String PROPERTY_? = PROPERTY_PREFIX + "?";
	/** An example property you may or may not use. */
	static final String PROPERTY_PASSWORD = PROPERTY_PREFIX + "password";

	/** A convenient way of storing settings - this object is also persisted in the database. */
	private PersistableSettings settings;

	/** Processor for asynchronous payment jobs.  Using this is not necessary, but likely useful. */
	private PaymentJobProcessor jobProcessor;

	public StructuredProperties getPropertiesStructure() {
		// The configuration screen is generated from these properties, and default
		// values are specified here.
		StructuredProperties defaultSettings = new StructuredProperties();
		defaultSettings.put(PROPERTY_?, "defaultValue");
		defaultSettings.put(PROPERTY_PASSWORD, new PasswordString("secret"));
		defaultSettings.put(PROPERTY_BALANCE, new BigDecimal("0")); // FIXME this should be a hidden setting
		return defaultSettings;
	}

	public PersistableSettings getSettings() {
		return settings;
	}

	public void setSettings(PersistableSettings settings) {
		this.settings = settings;
	}

	public Class<? extends ConfigurableService> getSuperType() {
		return PaymentService.class;
	}

	public void makePayment(final OutgoingPayment payment)
			throws PaymentServiceException {
		jobProcessor.queue(new PaymentJob() {
			public void run() {
				try {
					// TODO implement asynchronous payment
				} catch(Exception ex) {
					payment.setStatus(Status.ERROR);
					// FIXME log the exception
				}
			}
		});
	}

	public void checkBalance() throws PaymentServiceException {
		jobProcessor.queue(new PaymentJob() {
			public void run() {
				try {
					// TODO implement asynchronous balance check
				} catch(Exception ex) {
					// FIXME log the exception
				}
			}
		});
	}

	public BigDecimal getBalanceAmount() {
		return getPropertyValue(PROPERTY_BALANCE, BigDecimal.class);
	}

	public void startService() throws PaymentServiceException {
		this.jobProcessor = new PaymentJobProcessor(this);
		this.jobProcessor.start();

		// TODO implement any other startup code you may have here
	}

	public void stopService() {
		// TODO implement any other shutdown code you may have here

		this.jobProcessor.stop();
	}
	
	public boolean isOutgoingPaymentEnabled() {
		// Return true or false - depending if your payment service supports outgoing payments
		// or if it currently does not, or if it never does.
	}
}
