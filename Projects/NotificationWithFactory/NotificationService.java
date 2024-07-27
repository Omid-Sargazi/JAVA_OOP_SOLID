package Projects.NotificationWithFactory;

public class NotificationService {
    private NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void sendNotification(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
