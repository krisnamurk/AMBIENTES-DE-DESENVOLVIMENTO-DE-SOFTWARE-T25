import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Classe Main, onde será adicionada, posteriormente, todas as demais classes que irão se entregar em um exemplo relacionados ao sistema/gerenciamento
        de pedidos de um Restaurante*/

        Cliente artur = new Cliente ("Artur", "Rua Mário Mamede, 555");
        Restaurante restauranteADS = new Restaurante();
        ItemPedido pizza = new ItemPedido("Pizza", 15.0, 1);
        ItemPedido refrigerante = new ItemPedido("Refrigerante", 6.0, 2);

        List<ItemPedido> itensPedidoArtur = new ArrayList<>();
        itensPedidoArtur.add(pizza);
        itensPedidoArtur.add(refrigerante);

        artur.fazerPedido(restauranteADS, itensPedidoArtur);

        restauranteADS.listarPedidos();
    }

}
