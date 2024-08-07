package ProjectsPractical.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        NotificationService notificationService = new NotificationService(emailNotification);
        notificationService.sendNotification("New book available!");

        Notification smsNotification = new SMSNotification();
        notificationService = new NotificationService(smsNotification);
        notificationService.sendNotification("Book due soon!");
    }
}
