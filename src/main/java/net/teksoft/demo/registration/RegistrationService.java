package net.teksoft.demo.registration;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.transaction.Transactional;

public class RegistrationService {

	@Inject
	private Event<String> eventProducer;

	@Transactional
	public void submitRegistration(String studentName, String courseTitle) {
		System.out.println("Busy registering student: " + studentName + " in course: " + courseTitle);

		sendNotification();
	}

	private void sendNotification() {
		eventProducer.fire("You have successfully been registered.");

		System.out.println("Fired notification event.");
	}

}
