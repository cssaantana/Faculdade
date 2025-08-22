class No {
    int valor;
    No esquerdo, direito;

    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }
}

class Arvore {
    No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public No inserir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        } else if (valor < no.valor) {
            no.esquerdo = inserir(no.esquerdo, valor);
        } else {
            no.direito = inserir(no.direito, valor);
        }
        return no;
    }

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.println(no.valor + " ");
            preOrdem(no.esquerdo);
            preOrdem(no.direito);
        }
    }

    public void impressaoPreOrdem() {
        System.out.println("Pre ordem:");
        preOrdem(raiz);
    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerdo);
            System.out.println(no.valor + " ");
            emOrdem(no.direito);
        }
    }

    public void impressaoEmOrdem() {
        System.out.println("Em ordem:");
        emOrdem(raiz);

    }

    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerdo);
            posOrdem(no.direito);
            System.out.println(no.valor + " ");
        }
    }

    public void impressaoPosOrdem() {
        System.out.println("Pos ordem:");
        posOrdem(raiz);

    }

    public boolean buscar(No no, int valor) {
        if (no == null) {
            return false;
        } else if (no.valor == valor) {
            return true;
            
        } else if (valor < no.valor) {
            return buscar(no.esquerdo, valor);
        } else {
            return buscar(no.direito, valor);
        }
    }

    public boolean buscar(int valor) {
        return buscar(raiz, valor);
    }

    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        int altEsq = altura(no.esquerdo);
        int altDir = altura(no.direito);
        return 1 + Math.max(altEsq, altDir);
    }

    public int alturaArvore() {
        return altura(raiz);
    }
}

public class ArvoreBinaria {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(7);
        arvore.inserir(13);

        arvore.impressaoPreOrdem();

        arvore.impressaoEmOrdem();

        arvore.impressaoPosOrdem();

        int valorBuscado = 6;
        System.out.println("Buscar " + valorBuscado + ": " + (arvore.buscar(valorBuscado) ? "Encontrado" : "Não encontrado"));
    
        System.out.println("Altura da arvore: " + arvore.alturaArvore());
    }
}
