package encapsulation;

class Qtalk {
    private String message = "Hello, this is my first message!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class Encapsulation6 {
    public static void main(String[] args) {
        Qtalk qt = new Qtalk();

        System.out.println("Current Message: " + qt.getMessage());

        qt.setMessage("How are you?");
        System.out.println("Updated Message: " + qt.getMessage());

        qt.setMessage("Let’s catch up soon.");
        System.out.println("Updated Message: " + qt.getMessage());
    }
}
