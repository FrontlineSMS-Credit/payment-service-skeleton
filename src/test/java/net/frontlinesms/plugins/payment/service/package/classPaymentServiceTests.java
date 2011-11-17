package net.frontlinesms.plugins.payment.service.${sub:package};

import org.creditsms.plugins.paymentview.data.domain.OutgoingPayment;

import net.frontlinesms.data.domain.PersistableSettings;
import net.frontlinesms.junit.BaseTestCase;
import net.frontlinesms.plugins.payment.service.PaymentJob;
import net.frontlinesms.plugins.payment.service.PaymentService;

import static org.mockito.Mockito.*;

public class ${sub:class}PaymentServiceTests extends BaseTestCase {
	/** The {@link PaymentService} under test. */
	private ${sub:class}PaymentService s;

	@Override
	protected void setUp() throws Exception {
		s = new ${sub:class}PaymentService();
		s.startService();
	}
	
	@Override
	protected void tearDown() throws Exception {
		s.stopService();
	}
	
	public void testMakePayment() throws Exception {
		// given
		// TODO set up test scenario
		
		// when
		// TODO make a payment
		
		// then
		// TODO verify expected result(s)
	}
	
	public void testMakePaymentFailure() throws Exception {
		// given
		// TODO set up test scenario
		
		// when
		// TODO make a payment
		
		// then
		// TODO verify expected result(s)
	}
	
	public void testBalance() throws Exception {
		// given
		// TODO set up test scenario
		
		// when
		// TODO check balance
		
		// then
		// TODO wait for balance update if it's asynchronous
		// TODO verify expected result(s)
	}
	
	public void testCheckBalanceFailure() throws Exception {
		// given
		// TODO set up test scenario
		
		// when
		// TODO check balance
		
		// then
		// TODO verify expected result(s)
	}

	public void testIsOutgoingPaymentEnabled() {
		// TODO implement this if necessary
	}

	public void testIncomingPaymentProcessing() throws Exception {
		// given
		// TODO set up test scenario
		
		// when
		// TODO initiate incoming payment processing
		
		// then
		// TODO wait for payment processing to complete
		// TODO verify expected result(s)
	}

	public void testIncomingPaymentProcessingFailure() throws Exception {
		// given
		// TODO set up test scenario
		
		// when
		// TODO initiate incoming payment processing
		
		// then
		// TODO verify expected result(s)
	}
}
