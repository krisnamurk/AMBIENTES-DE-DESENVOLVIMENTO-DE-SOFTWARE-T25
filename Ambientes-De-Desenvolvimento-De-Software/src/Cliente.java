import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void fazerPedido(Restaurante restaurante, List<ItemPedido> itens) {
        Pedido novoPedido = restaurante.fazerPedido(this, itens);
        System.out.println("Novo pedido feito pelo cliente: #" + novoPedido.getNumeroPedido());
    }

    public String getNome() {
        return nome;
    }
}
