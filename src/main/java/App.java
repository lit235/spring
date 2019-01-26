import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private EventLogger eventLogger;
private App(Client client,EventLogger eventLogger){
    this.client=client;
    this.eventLogger=eventLogger;
}

    public static void main(String[] args) {
        /*App app = new App();

        app.client = new Client("1", "Jon");
        app.eventLogger = new ConsoleEventLogger();
        app.logEvent("Some event for user 1");*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        Event event = ctx.getBean(Event.class);
        app.logEvent(event,"Sooof 1");
        app.logEvent(event,"Soof 2");
    }

    private void logEvent(Event event, String msg) {
        String message = msg.replaceAll(
                client.getId(), client.getFullName());
        event.setMsg(message);
        eventLogger.logEvent(event);
    }
}
