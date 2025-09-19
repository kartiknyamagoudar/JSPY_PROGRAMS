package task;

public class Starpat {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 5; i++) {
            // Print left stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }

//            // Print spaces in the middle
            int spaces = 2 * (i - 1) - 1;
            if (spaces >= 0) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("   ");
                }
            }

            // Print right stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}