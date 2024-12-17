class MessageApp {

    // Method to send a text message
    public void Type_Message(String text) {
        System.out.println("Sending text message: " + text);
    }

    // Method to send an image message
    public void Type_Message(String imagePath, String caption) {
        System.out.println("Sending image message:");
        System.out.println("Image Path: " + imagePath);
        System.out.println("Caption: " + caption);
    }

    // Method to send a video message
    public void Type_Message(String videoPath, int duration, String description) {
        System.out.println("Sending video message:");
        System.out.println("Video Path: " + videoPath);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Description: " + description);
    }
}

public class Message_App {
    public static void main(String[] args) {
        MessageApp m1 = new MessageApp();

        m1.Type_Message("Hello World!...");
        m1.Type_Message("/images/picture.jpg", "Check out this pic");
        m1.Type_Message("/video/gallary.mp4", 120, "Video");
    }
}
