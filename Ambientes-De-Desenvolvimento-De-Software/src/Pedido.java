import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido (int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(ItemPedido item){
        itens.add(item);
        System.out.println("Item adicionado ao pedido #" + numeroPedido);
    }
    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
}
