package TrabalhoDelivery.ISP;

import TrabalhoDelivery.SRP.Pedido;
import TrabalhoDelivery.SRP.RepositorioPedido;
import TrabalhoDelivery.SRP.ImpressoraPedido;
import TrabalhoDelivery.LSP.Pizza;

public class Main {
    public static void main(String[] args) {
    
        System.out.println("=== ISP: Interface Segregation Principle ===\n");

        GerenciadorPedido gerenciador = new GerenciadorPedidoSimples(
            new RepositorioPedido(),
            new ImpressoraPedido()
        );

        Pedido pedido = gerenciador.criarPedido();
        pedido.adicionarItem(new Pizza("Calabresa", 35.0));

        System.out.println("Gerenciador de Pedidos:");
        gerenciador.mostrarPedido(pedido);
        gerenciador.salvarPedido(pedido);

        GeradorRelatorio relatorio = new GeradorRelatorioSimples();
        System.out.println("\nGerando Relatório:");
        relatorio.gerar(pedido);

        System.out.println("\n✓ Cada classe implementa apenas interfaces que precisa!");
    }
}
