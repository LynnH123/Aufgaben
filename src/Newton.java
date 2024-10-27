import java.util.Scanner;

public class Newton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine nicht-negative Zahl ein: ");


        double c;
        if (scanner.hasNextDouble()) {
            c = scanner.nextDouble();


            if (c < 0) {
                System.out.println("ERROR: ungültiges Argument");
                return;
            }
        } else {
            System.out.println("ERROR: ungültiges Argument");
            return;
        }


        double t = c;
        double previousT;


        do {
            previousT = t;
            t = (previousT + (c / previousT)) / 2;
        } while (Math.abs(t * t - c) >= 0.0001);


        System.out.println("Die Quadratwurzel von " + c + " ist ungefähr: " + t);

        scanner.close();
}
