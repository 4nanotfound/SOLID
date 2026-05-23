package TrabalhoDelivery.SRP;

public class ImpressoraPedido {
    public void imprimir(Pedido pedido){
        System.out.println("--- Pedido ---");
        pedido.obterItens().forEach(p -> System.out.println(p.obterNome() + " - R$" + p.obterPreco()));
        System.out.println("Total: R$" + pedido.totalizar());
    }
}
