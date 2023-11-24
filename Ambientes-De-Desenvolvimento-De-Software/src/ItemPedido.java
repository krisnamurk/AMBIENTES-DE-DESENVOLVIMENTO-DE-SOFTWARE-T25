public class ItemPedido { 
    // atributos da classe
    private String nome;        // nome do item no pedido
    private double preco;       // preço unitário do item
    private int quantidade;     // quantidade deseja do item no pedido

    // construtor
    public ItemPedido(String nome, double preco, int quantidade) {
        // Inicializa os atributos da classe com os valores fornecidos
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // metodos de acesso

    // retorna o nome do item
    public String getNome() {
        return nome;
    }

    // retorna o preço unitário do item
    public double getPreco() {
        return preco;
    }

    // retorna a quantidade do item no pedido
    public int getQuantidade() {
        return quantidade;
    }
}