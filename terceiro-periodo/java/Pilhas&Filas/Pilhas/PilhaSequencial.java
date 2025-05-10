public class PilhaSequencial {
    private String[] pilha;
    private int topo;
    private int tamanho;

    public PilhaSequencial(int capacidade) {
        tamanho = capacidade;
        pilha = new String[tamanho];
        topo = -1;
    }

    void push(String elemento) {
        if (topo == tamanho - 1) {
            System.out.println("pilha cheia.");
        } else {
            pilha[++topo] = elemento;
            System.out.println(elemento + " inserido.");
        }
    }

    String pop() {
        if (topo == -1) {
            System.out.println("pilha vazia");
            return null;
        }
        else {
            String removido = pilha[topo];
            System.out.println(removido + " removido.");
            topo--;
            return removido;
            }
        } 
    
    String peek() {
        if (topo == -1) {
            System.out.println("pilha vazia");
            return null;
        } else {
            return pilha[topo];
        }
    }

    void mostrarPilha() {
        if (topo == -1) {
            System.out.println("pilha vazia.");
        } else {
            System.out.println("Pilha:");
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        PilhaSequencial pilha = new PilhaSequencial(5);

        pilha.push("teste um");
        pilha.push("teste dois");
        pilha.push("teste tres");

        pilha.pop();

        System.out.println("Topo da lista: " + pilha.peek());
    }

}