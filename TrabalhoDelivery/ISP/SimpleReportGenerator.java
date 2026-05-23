package TrabalhoDelivery.ISP;

import TrabalhoDelivery.SRP.Pedido;

public class GeradorRelatorioSimples implements GeradorRelatorio {
    @Override
    public void gerar(Pedido pedido){
        System.out.println("Gerando relatório do pedido. Total R$" + pedido.totalizar());
    }
}
