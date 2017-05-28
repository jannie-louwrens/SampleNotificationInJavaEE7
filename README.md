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
18:29:31,605 INFO  [stdout] (default task-2) Busy registering student: Roxy in course: Science 101

18:29:31,614 INFO  [stdout] (default task-2) Fired notification event.

18:29:31,701 INFO  [stdout] (EJB default - 1) Sleep for a while to clearly show the effect of asynchronous.

18:29:41,704 INFO  [stdout] (EJB default - 1) Sending notification now:

18:29:41,705 INFO  [stdout] (EJB default - 1) You have successfully been registered.
```
