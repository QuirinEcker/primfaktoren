import java.util.Scanner;

public class Ecker_Primfaktroren {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber;
        int outputNumber;
        int primfactor;

        System.out.print("Ganze Zahl: ");
        inputNumber = scanner.nextInt();
        outputNumber = inputNumber;

        for (primfactor = 2; inputNumber > 1; primfactor++){
            while ((inputNumber % primfactor) == 0) {
                inputNumber = inputNumber / primfactor;
                System.out.print(" * " + primfactor + " ");
            }
        }
        System.out.print(" = " + outputNumber);
    }
}
