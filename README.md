# Sample Asynchronous Notifications in JavaEE 7
Asynchronous notification process in JavaEE 7 using CDI events.

You can read the article at:
* [Asynchronous notification process in JavaEE 7 using CDI events](https://www.linkedin.com/pulse/asynchronous-notifications-javaee-7-jannie-louwrens)

### Requirements

* Java 7 or above
* Maven

### Installation
In the directory where the code was installed, execute the CLI command:

* mvn test

##### Expected results
In the console you should see the following messages:

```sh
Jun 01, 2017 10:57:20 AM org.apache.deltaspike.testcontrol.api.junit.CdiTestSuiteRunner$LogRunListener testStarted
INFO: [run] net.teksoft.demo.registration.RegistrationServiceTest#testWebOrderEvent
Busy registering student: Roxy in course: Science 101
Sleep for a while to clearly show the effect of asynchronous.
Sending notification now:
You have successfully been registered.
Fired notification event.
Jun 01, 2017 10:57:30 AM org.apache.deltaspike.testcontrol.api.junit.CdiTestSuiteRunner$LogRunListener testFinished
INFO: [finished] net.teksoft.demo.registration.RegistrationServiceTest#testWebOrderEvent
```
