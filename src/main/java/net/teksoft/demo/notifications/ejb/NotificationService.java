package net.teksoft.demo.notifications.ejb;

import javax.ejb.Asynchronous;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@Singleton
public class NotificationService {

	@Asynchronous
	@Lock(LockType.READ)
	public void handleNotificationEvent(@Observes(during = TransactionPhase.AFTER_SUCCESS) String message)
			throws InterruptedException, AddressException, MessagingException {
		System.out.println("Sleep for a while to clearly show the effect of asynchronous.");
		Thread.sleep(10000);
		System.out.println("Sending notification now:");

		System.out.println(message);
	}

}
