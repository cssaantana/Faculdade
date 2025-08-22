import java.util.Scanner;

public class RecursividadeEx2 {
    public static int potencia (int base, int expoente) {
        return (expoente == 0) ? 1 : base * potencia(base, expoente - 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = potencia(base, expoente);
        System.out.println(resultado);
        scanner.close();
    }
}