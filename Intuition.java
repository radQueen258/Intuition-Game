package intuitio;

import java.util.*;

public class Intuition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int step = 1;
        int hits = 0;
        int misses = 0;
        List<Integer> lastTenNumbers = new ArrayList<>();

        while (true) {
            int randomNumber = random.nextInt(10); // Generate random number [0-9]

            System.out.println("Step: " + step);
            System.out.print("Please enter number from 0 to 9 (q - quit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Game terminated. Goodbye!");
                break;
            }

            if (!isValidInput(userInput)) {
                System.out.println("Input error!");
                continue;
            }

            int userNumber = Integer.parseInt(userInput);
            boolean isHit = (userNumber == randomNumber);

            if (isHit) {
                hits++;
                System.out.println("Hit! My number: " + randomNumber);
            } else {
                misses++;
                System.out.println("Miss! My number: " + randomNumber);
            }

            lastTenNumbers.add(randomNumber);
            if (lastTenNumbers.size() > 10) {
                lastTenNumbers.remove(0); // Keep only the last 10 numbers
            }

            int totalAttempts = hits + misses;
            double hitPercentage = (totalAttempts > 0) ? (hits * 100.0 / totalAttempts) : 0.0;
            double missPercentage = (totalAttempts > 0) ? (misses * 100.0 / totalAttempts) : 0.0;

            System.out.printf("Hit: %.1f%% Miss: %.1f%%%n", hitPercentage, missPercentage);

            System.out.print("Numbers: ");
            for (int number : lastTenNumbers) {
                if (number == userNumber) {
                    System.out.print("\u001B[32m" + number + " \u001B[0m"); // Green for hits
                } else {
                    System.out.print("\u001B[31m" + number + " \u001B[0m"); // Red for misses
                }
            }
            System.out.println();

            step++;
        }

        scanner.close();
    }

    private static boolean isValidInput(String input) {
        if (input.length() != 1) return false;
        char ch = input.charAt(0);
        return Character.isDigit(ch) && ch >= '0' && ch <= '9';
    }
}
