// Nome: Caroline Dos Santos Santana

import java.util.ArrayList;
import java.util.List;

class No {
    String descricao;
    List<No> filhos;

    public No(String descricao) {
        this.descricao = descricao;
        this.filhos = new ArrayList<>();
    }
}

class Arvore {
    No raiz;

    public Arvore(String descricaoRaiz) {
        this.raiz = new No(descricaoRaiz);
    }

    public boolean inserir(String descricaoPai, String descricaoFilho) {
        No pai = buscar(raiz, descricaoPai);
        if (pai != null) {
            pai.filhos.add(new No(descricaoFilho));
            return true;
        }
        return false;
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.descricao + " ");
            for (No filho : no.filhos) {
                preOrdem(filho);
            }
        }
    }

    public void impressaoPreOrdem() {
        System.out.println("Pre ordem:");
        preOrdem(raiz);
        System.out.println();
    }

    private void posOrdem(No no) {
        if (no != null) {
            for (No filho : no.filhos) {
                posOrdem(filho);
            }
            System.out.print(no.descricao + " ");
        }
    }

    public void impressaoPosOrdem() {
        System.out.println("Pos ordem:");
        posOrdem(raiz);
        System.out.println();
    }

    private No buscar(No no, String descricao) {
        if (no == null) return null;
        if (no.descricao.equals(descricao)) return no;

        for (No filho : no.filhos) {
            No encontrado = buscar(filho, descricao);
            if (encontrado != null) return encontrado;
        }
        return null;
    }

    public boolean buscar(String descricao) {
        return buscar(raiz, descricao) != null;
    }

    private int altura(No no) {
        if (no == null) return 0;
        int maxAltura = 0;
        for (No filho : no.filhos) {
            maxAltura = Math.max(maxAltura, altura(filho));
        }
        return 1 + maxAltura;
    }

    public int alturaArvore() {
        return altura(raiz);
    }
}

public class ArvoreGenerica {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("Pai");

        arvore.inserir("Pai", "Filho1");
        arvore.inserir("Pai", "Filho2");
        arvore.inserir("Filho1", "Neto1");
        arvore.inserir("Filho1", "Neto2");
        arvore.inserir("Filho2", "Neto1");

        arvore.impressaoPreOrdem();
        arvore.impressaoPosOrdem();

        System.out.println("Buscar Filho1: " + (arvore.buscar("Filho1") ? "Encontrado" : "Nao encontrado"));
        System.out.println("Buscar Neto3: " + (arvore.buscar("Neto3") ? "Encontrado" : "Nao encontrado"));

        System.out.println("Altura da arvore: " + arvore.alturaArvore());
    }
}
