import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

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
        if(grafo.containsKey(origem) && grafo.containsKey(destino)) {
            grafo.get(origem).add(destino);
        }
    }

    //9. Detectar se o grafo tem ciclo simples.
    public boolean detectarCicloSimples() {
        Map<String, Boolean> visitado = new HashMap<>();
        
        for (String vertice : grafo.keySet()) {
            if (!visitado.containsKey(vertice)) {
                if (dfsCiclo(vertice, null, visitado)) {
                    System.out.println("Sim, o grafo contem ciclo.");
                    return true;
                }
            }
        }
        System.out.println("Nao, o grafo  nao contem ciclo.");
        return false;
    }

    private boolean dfsCiclo(String atual, String pai, Map<String, Boolean> visitado) {
        visitado.put(atual, true);

        for (String vizinho : grafo.get(atual)) {
            if (!visitado.containsKey(vizinho)) {
                if (dfsCiclo(vizinho, atual, visitado)) return true;
            } else if (!vizinho.equals(pai)) {
                return true;
            }
        }
        return false;
    }

    //10. Busca de profundidade (DFS).
    public void dfs(String inicio) {
        Map<String, Boolean> visitado = new HashMap<>(); 
        Stack<String> pilha = new Stack<>();

        pilha.push(inicio);
        System.out.println("DFS: ");

        while (!pilha.isEmpty()) {
            String atual = pilha.pop();

            if (!visitado.containsKey(atual)) {
                visitado.put(atual, true);
                System.out.println(atual + " ");

                List<String> vizinhos = grafo.get(atual);
                for (int i = vizinhos.size() - 1; i >= 0; i--) {
                    String vizinho = vizinhos.get(i);
                    if(!visitado.containsKey(vizinho)) {
                        pilha.push(vizinho);
                    }
                }
            }
        }
    }

    //11. Busca em Largura (BFS).
    public void bfs(String inicio) {
        Map<String, Boolean> visitado = new HashMap<>();
        Queue<String> fila = new LinkedList<>();

        visitado.put(inicio, true);
        fila.add(inicio);
        System.out.println("BFS: ");

        while (!fila.isEmpty()) {
            String atual = fila.poll();
            System.out.println(atual + " ");

            for(String vizinho : grafo.get(atual)) {
                if (!visitado.containsKey(vizinho)) {
                    visitado.put(vizinho, true);
                    fila.add(vizinho);
                }
            }
        }
    }

}

public class AtividadesExtras {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

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

        grafo.detectarCicloSimples();
        
    }
}