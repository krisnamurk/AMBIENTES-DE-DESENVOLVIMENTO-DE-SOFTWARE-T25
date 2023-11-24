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
    public void AdicionarItem(ItemPedido item){
        itens.add(item);
        System.out.println("Item adicionado ao pedido #" + numeroPedido);
    }
    
}
