public class FilaSequencial {
    private String[] fila;
    private int começo;
    private int fim;
    private int tamanho;

    public FilaSequencial(int capacidade) {
        tamanho = capacidade;
        fila = new String[tamanho];
        começo = 0;
        fim = -1;
    }

    void enqueue(String elemento) {
        if (fim == tamanho - 1) {
            System.out.println("Fila Cheia!!!");
        } else {
            fila[++fim] = elemento;
            System.out.println("Enfileirando: " + elemento);
        }
    }

    String dequeue() {
        if (começo > fim) {
            System.out.println("Fila Vazia.");
            return null;
        } else {
            String removido = fila[começo];
            System.out.println("Desenfileirando: " + removido);

            for (int i = começo; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
            fim--;
            return removido;
        }
    }

    void expand() {
        int novaCapacidade = tamanho * 2;
        String[] novaFila = new String[novaCapacidade];

        for (int i = começo; i <= fim; i++) {
            novaFila[i] = fila[i];
        }

        fila = novaFila;
        tamanho = novaCapacidade;

        System.out.println("Capacidade da fila dobrada para: " + tamanho);
    }

    void mostrarFila() {
        if (começo > fim) {
            System.out.println("Fila Vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = começo; i <= fim; i++) {
                System.out.print(fila[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FilaSequencial fila = new FilaSequencial(5);

        fila.enqueue("teste um");
        fila.enqueue("teste dois");
        fila.enqueue("teste tres");

        fila.mostrarFila();

        fila.dequeue();

        fila.mostrarFila();

        fila.enqueue("teste um");

        fila.mostrarFila();
    }
}