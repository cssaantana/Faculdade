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
        if (!grafo.containsKey(vertice)) {
            grafo.put(vertice, new ArrayList<>());
        }
    }

    public void adicionarAresta(String origem, String destino) {
        if(grafo.containsKey(origem) && grafo.containsKey(destino)) {
            grafo.get(origem).add(destino);
        }
    }

    public void mostrarGrafo() {
        for(String chave : grafo.keySet()) {
            System.out.println(chave + " -> " + grafo.get(chave));
        }
    }

    //"6. Contar o número de vértices e o número total de arestas."
    public void contarVertices() {
        int numVertices = grafo.size();
        System.out.println("Numero de Vertices: " + numVertices);
    }

    public void contarArestas() {
        int numArestas = 0;

        for(List<String> vizinhos : grafo.values()) {
            numArestas += vizinhos.size();
        }
        System.out.println("Numero de Arestas: " + numArestas);
    }

    //"7. Encontrar vértice sem vizinhos."
    public void mostrarVerticesSemVizinhos() {
        System.out.println("Vertices sem Vizinhos: ");
        for(String vertices : grafo.keySet()) {
            if(grafo.get(vertices).isEmpty()) {
                System.out.println(vertices);
            }
        }
    }

    //"8. Permitir usuário remover uma aresta."
    public void removerAresta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remover Aresta.");
        System.out.print("Digite o vertice de origem: ");
        String origem = scanner.nextLine().toUpperCase();
        System.out.print("Digite o vertice de destino: ");
        String destino = scanner.nextLine().toUpperCase();

        if (!grafo.containsKey(origem) || !grafo.containsKey(destino)) {
            System.out.println("Origem ou destino nao encontrados no grafo.");
            return;
        }

        if(grafo.get(origem).contains(destino)){
            grafo.get(origem).remove(destino);
            System.out.println("Aresta removida.");
        } else {
            System.out.println("Aresta Inexistente.");
        }
    }
}

public class AtividadesIntermediarias{
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        
        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("A", "C");
        grafo.adicionarAresta("B", "D");
        grafo.adicionarAresta("C", "D");
        grafo.adicionarAresta("D", "E");

        grafo.mostrarGrafo();
        grafo.contarVertices();
        grafo.contarArestas();
        grafo.mostrarVerticesSemVizinhos();
        grafo.removerAresta();

    }
}