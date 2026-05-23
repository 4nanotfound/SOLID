package TrabalhoDelivery.OCP;

public class PagamentoDinheiro implements EstrategiaPagamento {
    @Override
    public boolean pagar(double valor){
        System.out.println("Pagamento em DINHEIRO recebido: R$" + valor);
        return true;
    }
}
