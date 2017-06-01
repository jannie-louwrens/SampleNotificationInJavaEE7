package net.teksoft.demo.registration;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class RegistrationServiceTest {

	@Inject
	private RegistrationService registrationService;

	@Test
	public void testWebOrderEvent() {
		registrationService.submitRegistration("Roxy", "Science 101");
    }

}
