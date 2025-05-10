import java.util.Scanner;

public class RecursividadeEx1 {

    public static int somarDigitos(int numeros) {
        return (numeros == 0) ? 0 : (numeros == 1) ? 1 : numeros % 10 + somarDigitos(numeros / 10);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números: ");
        int digitos = scanner.nextInt();

        int resultado = somarDigitos (digitos);
        System.out.println(resultado);
        scanner.close();
    }
}
