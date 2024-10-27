import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte geben Sie eine positive ganze Zahl für die Größe des Schachbretts ein:");
            String input = scanner.nextLine();


            if (!isPositiveInteger(input)) {
                System.out.println("ERROR: Bitte eine gültige positive ganze Zahl eingeben.");
                continue;
            }

            int n = Integer.parseInt(input);


            if (n <= 0) {
                System.out.println("ERROR: Die Zahl muss positiv und größer als 0 sein.");
                continue;
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }


            System.out.println("Möchten Sie ein weiteres Schachbrett erstellen? (ja/nein)");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("ja")) {
                break;
            }
        }


        scanner.close();
    }


    public static boolean isPositiveInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
