import java.util.Scanner;

public class RecursividadeEx3 {
    public static int fibonacci(int numero) {
        return (numero == 0) ? 0 : (numero == 1) ? 1 : fibonacci(numero - 1) + fibonacci(numero - 2);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número: ");
        int fibonacci = scanner.nextInt();

        int resultado = fibonacci(fibonacci);
        System.out.println(resultado);
        scanner.close(); 
    }   
}