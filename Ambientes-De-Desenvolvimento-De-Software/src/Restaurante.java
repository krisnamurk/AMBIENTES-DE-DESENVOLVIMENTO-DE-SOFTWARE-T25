import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    /*Esta classe é fazendo alusão ao Restaurante em si. Onde, a principio, teremos dois métodos que será um para fazer o pedido (para isso, será necessário
     utilizarmos um método referente a outra classe, que será da classe Pedido, o método de adicionar item/pedido) neste restaurante e outro para listar os pedidos do Restaurante*/

    private List<Pedido> pedidos;
    private String nome;
    public Restaurante(String nome){
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    //Utilizamos dois métodos fazerPedido, para dar a possibilidade de criar tanto pelo Cliente, como pelo Restaurante
    public Pedido fazerPedidoRestaurante (Cliente cliente, List<ItemPedido> itens){
        int novoNumeroPedido = pedidos.size() + 1;
        Pedido novoPedido = new Pedido(novoNumeroPedido, cliente);
        for (ItemPedido item : itens){
            novoPedido.adicionarItem(item);
        }
        pedidos.add(novoPedido);
        return novoPedido;
    }

    public void listarPedidos(){
        System.out.println("\nPedidos no " + nome);
        for (Pedido pedido : pedidos){
            System.out.println("Pedido #" + pedido.getNumeroPedido() + " - Total: R$ " + pedido.calcularTotal());
        }
    }

    public double calcularTotalPedidos(){
        double total = 0;
        for (Pedido pedido : pedidos){
            total = total + pedido.calcularTotal();
        }
        return total;
    }

    public void imprimirMenu() {
        System.out.println("Menu do Restaurante:");
        System.out.println("- Pizza - Preço: R$15.00");
        System.out.println("- Refrigerante - Preço: R$6.00");
    }

    public String getNome() {
        return nome;
    }

}
