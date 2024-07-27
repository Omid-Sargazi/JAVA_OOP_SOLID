package Projects.Notification;

public class NotificationService {
    public Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
