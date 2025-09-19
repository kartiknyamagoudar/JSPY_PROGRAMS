package encapsulation;

class Telegram {
    private String displayName = "Omkar";

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}

public class Encapsulation8 {
    public static void main(String[] args) {
        Telegram tg = new Telegram();

        System.out.println("Current Display Name: " + tg.getDisplayName());

        tg.setDisplayName("Coder_Om");
        System.out.println("Updated Display Name: " + tg.getDisplayName());

        tg.setDisplayName("TechLearner");
        System.out.println("Updated Display Name: " + tg.getDisplayName());
    }
}