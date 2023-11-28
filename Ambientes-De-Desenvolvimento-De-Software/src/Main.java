import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Classe Main, onde será adicionada, posteriormente, todas as demais classes que irão se entregar em um exemplo relacionados ao sistema/gerenciamento
        de pedidos de um Restaurante*/


        //Criação pedido Artur utilizando a primeira forma de realizar pedidos
        Cliente artur = new Cliente ("Artur", "Rua Mário Mamede, 555, Bloco 1");

        Restaurante restauranteADS = new Restaurante("RestauranteADS");
        restauranteADS.imprimirMenu();

        ItemPedido pizzaArtur = new ItemPedido("Pizza", 15.0, 1);
        ItemPedido refrigeranteArtur = new ItemPedido("Refrigerante", 6.0, 2);

        List<ItemPedido> itensPedidoArtur = new ArrayList<>();
        itensPedidoArtur.add(pizzaArtur);
        itensPedidoArtur.add(refrigeranteArtur);

        artur.fazerPedido(restauranteADS, itensPedidoArtur);
        restauranteADS.listarPedidos();

        artur.avaliarAtendimento(8);

    }

}
