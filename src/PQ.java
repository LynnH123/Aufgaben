import java.util.Scanner;

public class PQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Bitte geben Sie p und q ein (getrennt durch ein Leerzeichen): ");
            String input = scanner.nextLine();


            String[] parts = input.split(" ");


            if (parts.length != 2) {
                System.out.println("ERROR: genau zwei Argumente erwartet");
                continue;
            }

            // p und q einlesen und in double umwandeln
            double p = Double.parseDouble(parts[0]);
            double q = Double.parseDouble(parts[1]);


            double discriminant = (p * p) / 4 - q;


            if (discriminant < 0) {
                System.out.println("Es gibt 0 Nullstellen.");
            } else if (discriminant == 0) {
                double x1 = -p / 2;
                System.out.println(x1);
                System.out.println("Es gibt 1 Nullstelle.");
            } else {
                double sqrtDiscriminant = Math.sqrt(discriminant);
                double x1 = -p / 2 - sqrtDiscriminant;
                double x2 = -p / 2 + sqrtDiscriminant;


                if (x1 > x2) {
                    double temp = x1;
                    x1 = x2;
                    x2 = temp;
                }
                System.out.println(x1);
                System.out.println(x2);
                System.out.println("Es gibt 2 Nullstellen.");
            }
        }

    }
}
