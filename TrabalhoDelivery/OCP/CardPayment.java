package TrabalhoDelivery.OCP;

public class PagamentoCartao implements EstrategiaPagamento {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean pagar(double valor){
        System.out.println("Processando pagamento com CARTÃO: R$" + valor);
        return true;
    }
}
