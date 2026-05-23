package TrabalhoDelivery.OCP;

public class PagamentoPix implements EstrategiaPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix){
        this.chavePix = chavePix;
    }

    @Override
    public boolean pagar(double valor){
        System.out.println("Processando pagamento via PIX: R$" + valor);
        return true;
    }
}
