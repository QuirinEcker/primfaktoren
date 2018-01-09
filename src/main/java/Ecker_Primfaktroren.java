import java.util.Scanner;

public class Ecker_Primfaktroren {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 100;
        int primfactor;
        boolean loop = true;

        System.out.println("Ganze Zahl: ");
        inputNumber =scanner.nextInt();

        /*while (inputNumber > 1){
            if ((inputNumber % 2 )== 0){
                inputNumber /= 2;
                System.out.print(" 2 * ");
            } else if ((inputNumber % 3 == 0)){
                inputNumber /= 3;
                System.out.println(" 3 * ");
            } else if ((inputNumber % 5) == 0){
                inputNumber /= 5;
                System.out.print(" 5 *");
            }
        }
        System.out.println(" = " + inputNumber);
        */

        for (primfactor = 2; inputNumber > 1; primfactor++){
            while ((inputNumber % primfactor) == 0) {
                inputNumber = inputNumber / primfactor;
                System.out.println(" * " + primfactor + " ");
            }
        }
    }
}
