package TrabalhoDelivery.SRP;

public class RepositorioPedido {
    public void salvar(Pedido pedido){
        System.out.println("Pedido salvo com sucesso. Total: R$" + pedido.totalizar());
    }
}
