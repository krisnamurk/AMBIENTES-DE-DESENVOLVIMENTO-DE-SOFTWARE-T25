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
        System.out.println("\nItem adicionado ao pedido #" + numeroPedido);
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

    //Artur Cavalcante
    public void mostrarItens(){
        System.out.println("Itens do Pedido #" + numeroPedido + ":");
        for (ItemPedido item : itens){
            System.out.println("- " + item.getNome() + " - Preço: R$ " + item.getPreco() + " - Quantidade: " + item.getQuantidade());
        }
    }
}
