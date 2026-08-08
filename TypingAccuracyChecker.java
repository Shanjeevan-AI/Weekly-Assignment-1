import java.util.Scanner;

public class TypingAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {

        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = ((double) matched / original.length()) * 100;

        System.out.println("Matched Characters: " + matched);
        System.out.println("Accuracy: " + accuracy + "%");

        if (firstMismatch == -1) {
            System.out.println("No Mismatches Found");
        } else {
            System.out.println("First Mismatch Position: " + (firstMismatch + 1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original passage: ");
        String original = sc.nextLine();

        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Both strings must have equal length.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}