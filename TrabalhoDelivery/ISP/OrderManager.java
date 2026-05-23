package TrabalhoDelivery.ISP;

import TrabalhoDelivery.SRP.Pedido;

public interface GerenciadorPedido {
    Pedido criarPedido();
    void salvarPedido(Pedido pedido);
    void mostrarPedido(Pedido pedido);
}
