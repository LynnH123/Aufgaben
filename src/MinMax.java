import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Bitte geben Sie eine Liste von ganzen Zahlen ein (mit Leerzeichen getrennt):");
        String input = scanner.nextLine();
        scanner.close();

        String[] inputNumbers = input.split(" ");
        for (String numberStr : inputNumbers) {
            if (isInteger(numberStr.trim())) {
                int number = Integer.parseInt(numberStr.trim());
                numbers.add(number);
            } else {
                System.out.println("ERROR 1: Bitte nur ganze Zahlen eingeben.");
                return;
            }
        }


        if (numbers.isEmpty()) {
            System.out.println("ERROR 1: Bitte mindestens eine Zahl eingeben.");
            return;
        }


        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println(min);
        System.out.println(max);
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && (c != '-' || str.indexOf(c) != 0)) {
                return false;
            }
        }
        return true;
    }
}
