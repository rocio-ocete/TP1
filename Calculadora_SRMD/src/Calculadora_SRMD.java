   import java.util.Scanner;

   public class Calculadora_SRMD {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = input.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
}
