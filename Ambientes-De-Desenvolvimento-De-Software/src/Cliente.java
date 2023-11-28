import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void fazerPedido(Restaurante restaurante, List<ItemPedido> itens) {
        Pedido novoPedido = restaurante.fazerPedidoRestaurante(this, itens);
        System.out.println("Novo pedido feito pelo cliente " + nome + " : Pedido #" + novoPedido.getNumeroPedido());

        double totalPedidos = restaurante.calcularTotalPedidos();
        System.out.println("Valor total, em R$, de pedidos do cliente " + nome + " no restaurante "
                + restaurante.getNome() + " ': R$ " + totalPedidos);

        System.out.print("\n");
        novoPedido.mostrarItens();
    }
    public void realizarPagamento(Pedido pedido) {
        double total = pedido.calcularTotal();
        System.out.println("Cliente " + nome + " realizou o pagamento do Pedido #" + pedido.getNumeroPedido() + " no valor de R$" + total);
    }

    public String getNome() {
        return nome;
    }
}