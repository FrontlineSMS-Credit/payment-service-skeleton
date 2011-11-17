package net.frontlinesms.plugins.payment.service.${sub:package};

import java.util.List;

import net.frontlinesms.junit.BaseTestCase;
import net.frontlinesms.plugins.payment.service.PaymentService;
import net.frontlinesms.plugins.payment.service.PaymentServiceImplementationLoader;

public class ServiceLoaderTest extends BaseTestCase {
	public void testPersonalServiceLoading() {
		List<Class<? extends PaymentService>> services = new PaymentServiceImplementationLoader().getAll();
		assertTrue(services.contains(${sub:class}PaymentService.class));
	}
}
