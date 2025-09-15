import java.util.Scanner;

public class DivisionDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double b = sc.nextDouble();

        double resultado = a / b;
        System.out.println("Resultado (double): " + resultado);
    }
}