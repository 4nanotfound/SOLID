package TrabalhoDelivery.OCP;

public class Main {
    public static void main(String[] args) {
    
        double valor = 100.0;

        System.out.println("=== OCP: Open/Closed Principle ===\n");

        EstrategiaPagamento pagamentoCartao = new PagamentoCartao("1234-5678-9012-3456");
        System.out.println("Estratégia 1:");
        pagamentoCartao.pagar(valor);

        EstrategiaPagamento pagamentoPix = new PagamentoPix("meu-pix-123");
        System.out.println("\nEstratégia 2:");
        pagamentoPix.pagar(valor);

        EstrategiaPagamento pagamentoDinheiro = new PagamentoDinheiro();
        System.out.println("\nEstratégia 3:");
        pagamentoDinheiro.pagar(valor);

        System.out.println("\n✓ Novas formas de pagamento sem alterar código existente!");
    }
}
