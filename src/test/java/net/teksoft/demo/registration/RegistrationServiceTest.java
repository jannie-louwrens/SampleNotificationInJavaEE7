package net.teksoft.demo.registration;
import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.teksoft.demo.notifications.ejb.NotificationService;

@RunWith(Arquillian.class)
public class RegistrationServiceTest {

	@Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
				.addClasses(RegistrationService.class, NotificationService.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
	
	@Inject
	private RegistrationService registrationService;

	@Test
	public void testWebOrderEvent() {
		registrationService.submitRegistration("Roxy", "Science 101");
    }

}
