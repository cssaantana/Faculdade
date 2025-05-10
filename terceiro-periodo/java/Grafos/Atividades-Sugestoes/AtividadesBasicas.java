import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Grafo {
    private Map<String, List<String>> grafo;

    public Grafo() {
      grafo = new HashMap<>();
    }

    public void adicionarVertice(String vertice) {
        if(!grafo.containsKey(vertice)) {
            grafo.put(vertice, new ArrayList<>());
        }
    }
    
    public void adicionarAresta(String origem, String destino) {
        if (grafo.containsKey(origem) && grafo.containsKey(destino)) {
            grafo.get(origem).add(destino);
        }
    }

    public void mostrarGrafo(){
        for(String chave : grafo.keySet()) {
            System.out.println(chave + "->" + grafo.get(chave));
        }
    }

    //2. "Tansformar o grafo direcionado em não direcionado."
    public void naoDirecionado() {
        for(String origem : grafo.keySet()) {
            for(String destino : grafo.get(origem)) {
                if (!grafo.get(destino).contains(origem)) {
                    grafo.get(destino).add(origem);
                }
            }
        }
    }

    //3. "Mostrar os vizinhos de um vértice informado por um usuário."
    public void mostrarVizinhos(Scanner sc) {
        System.out.println("Mostrar Vizinhos.");
        System.out.println("Digite o vertice:");
        String vertice = sc.nextLine().toUpperCase();

        if (grafo.containsKey(vertice)) {
            List<String> vizinhos = grafo.get(vertice);
            System.out.println(vertice + " -> " + vizinhos);
        } else {
            System.out.println(vertice + " nao encontrado no grafo.");
        }
    }

    //4. "Verificar ligação entre dois vértices."
    public void verificarLigacao(Scanner sc) {
        System.out.println("Verificar Ligaçao.");
        System.out.println("Digite o vertice de origem:");
        String origem = sc.nextLine().toUpperCase();
        System.out.println("Digite o vertice de destino:");
        String destino = sc.nextLine().toUpperCase();

        if(!grafo.containsKey(origem) || !grafo.containsKey(destino)) {
            System.out.println("Origem/Destino nao existe.");
            return;
        }

        if(grafo.get(origem).contains(destino)) {
            System.out.println("Existe ligacao: " + origem + " -> " + destino);
        } else {
            System.out.println("Nao existe ligacao entre " + origem + " e " + destino);
        }
    }

    //5. "Remover um vértice e todas as suas conexões."
    public void removerVertice(Scanner sc) {
        System.out.println("Remover Vertice.");
        System.out.println("Digite o vertice para remocao:");
        String vertice = sc.nextLine().toUpperCase();

        if(!grafo.containsKey(vertice)) {
            System.out.println("vertice nao encontrado.");
            return;
        }

        for(List<String> vizinhos : grafo.values()) {
            vizinhos.remove(vertice);
        }

        grafo.remove(vertice);
        System.out.println(vertice + " removido.");
    }
}

public class AtividadesBasicas{
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        Scanner sc = new Scanner(System.in);

        //1."Criar um grafo com 5 vértices e 6 arestas."
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");

        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("B", "A");
        grafo.adicionarAresta("B", "C");
        grafo.adicionarAresta("C", "D");
        grafo.adicionarAresta("D", "E");
        grafo.adicionarAresta("E", "A");

        grafo.mostrarGrafo();

        //grafo.naoDirecionado();
        //grafo.mostrarGrafo();
        grafo.mostrarVizinhos(sc);
        grafo.verificarLigacao(sc);
        grafo.removerVertice(sc);
        grafo.mostrarGrafo();
    }
}