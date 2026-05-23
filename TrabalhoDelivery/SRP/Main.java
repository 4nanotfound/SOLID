package TrabalhoDelivery.SRP;

import TrabalhoDelivery.LSP.Pizza;
import TrabalhoDelivery.SRP.Pedido;
import TrabalhoDelivery.SRP.ImpressoraPedido;
import TrabalhoDelivery.SRP.RepositorioPedido;

public class Main {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Pizza("Margherita", 30.0));

        RepositorioPedido repositorio = new RepositorioPedido();
        repositorio.salvar(pedido);

        ImpressoraPedido impressora = new ImpressoraPedido();
        impressora.imprimir(pedido);

        System.out.println("\n=== SRP: Single Responsibility ===");
        System.out.println("✓ Pedido: gerencia itens");
        System.out.println("✓ RepositorioPedido: persiste dados");
        System.out.println("✓ ImpressoraPedido: exibe informações");
    }
}
