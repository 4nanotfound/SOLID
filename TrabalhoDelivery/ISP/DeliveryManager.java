package TrabalhoDelivery.ISP;

import TrabalhoDelivery.SRP.Pedido;

public interface GerenciadorEntrega {
    void agendarEntrega(Pedido pedido, String endereco);
}
