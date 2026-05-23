package TrabalhoDelivery.ISP;

import TrabalhoDelivery.SRP.Pedido;
import TrabalhoDelivery.DIP.ServicoNotificacao;

public class GerenciadorEntregaSimples implements GerenciadorEntrega {
    private ServicoNotificacao notificacao;

    public GerenciadorEntregaSimples(ServicoNotificacao notificacao){
        this.notificacao = notificacao;
    }

    @Override
    public void agendarEntrega(Pedido pedido, String endereco){
        System.out.println("Entrega agendada para: " + endereco);
        notificacao.notificar("Seu pedido foi agendado para entrega em: " + endereco);
    }
}
