class MessageApp {

    // Method to send a text message
    public void sendMessage(String text) {
        System.out.println("Sending text message: " + text);
    }

    // Method to send an image message
    public void sendMessage(String imagePath, String caption) {
        System.out.println("Sending image message:");
        System.out.println("Image Path: " + imagePath);
        System.out.println("Caption: " + caption);
    }

    // Method to send a video message
    public void sendMessage(String videoPath, int duration, String description) {
        System.out.println("Sending video message:");
        System.out.println("Video Path: " + videoPath);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Description: " + description);
    }
}

public class Message_App {
    public static void main(String[] args) {
        MessageApp m1 = new MessageApp();

        m1.sendMessage("Hello World!...");
        m1.sendMessage("/images/picture.jpg", "Check out this pic");
        m1.sendMessage("/video/gallary.mp4", 120, "Video");
    }
}
