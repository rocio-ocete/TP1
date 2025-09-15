import java.util.Scanner;
public class ConversionesDeTipo {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

        int resultado = a / b;
        System.out.println("Resultado (int): " + resultado);
    }
 
}
