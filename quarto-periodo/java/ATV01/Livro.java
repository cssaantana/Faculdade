package ATV01;//Nome: Caroline Dos Santos Santana
// 3. Criar uma classe Livro que tenha atributos como titulo, autor, anoDePublicacao e disponibilidade (se o livro está disponível ou emprestado), e métodos para emprestar, devolver e exibir as informações do livro. Crie alguns objetos de livros e interaja com eles, testando os métodos de emprestar, devolver e exibir as informações.

class Livro {
    String titulo;
    String autor;
    Integer anoDePublicacao;
    Boolean disponibilidade;

    public Livro(String titulo, String autor, Integer anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponibilidade = true;
    }

    void emprestarLivro() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro emprestado com sucesso!");
            System.out.println();
        } else {
            System.out.println("Livro indisponivel.");
            System.out.println();
        }
    }
    
    void devolverLivro() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro disponivel.");
        }
    }

    void infoLivros() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicacao: " + anoDePublicacao);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponivel" : "Emprestado"));
        System.out.println();
    }
}
