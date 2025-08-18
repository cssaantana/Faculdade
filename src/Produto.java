/* Nome: Caroline Dos Santos Santana
1.2 Crie uma classe Produto
* 1.3 Defina 4 atributos para Produto onde: 1 dos atributos deve ser Categoria.*/

class Produto {
    String nomeProduto;
    Double preco;
    Integer estoque;
    Categoria categoria;

    public Produto(String nomeProduto, Double preco, Integer estoque, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }
}
