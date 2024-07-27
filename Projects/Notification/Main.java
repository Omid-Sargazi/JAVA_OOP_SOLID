package Projects.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification emailNotification = service.createNotification("email");
        emailNotification.send("Hello via Email!");

        Notification smsNotification = service.createNotification("sms");
        smsNotification.send("Hello via SMS!");
    }
}
