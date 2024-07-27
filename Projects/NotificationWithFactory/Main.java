package Projects.NotificationWithFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationService emailService = new NotificationService(emailFactory);
        emailService.sendNotification("Hello via Email!");

        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationService smsService = new NotificationService(smsFactory);
        smsService.sendNotification("Hello via SMS!");
    }
}
