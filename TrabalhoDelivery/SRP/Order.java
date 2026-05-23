package TrabalhoDelivery.SRP;

import TrabalhoDelivery.LSP.Produto;
import TrabalhoDelivery.OCP.EstrategiaPagamento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> itens = new ArrayList<>();
    private EstrategiaPagamento pagamento;
    private boolean pago = false;

    public void adicionarItem(Produto p){ itens.add(p); }
    public List<Produto> obterItens(){ return itens; }

    public double totalizar(){
        return itens.stream().mapToDouble(Produto::obterPreco).sum();
    }

    public void definirEstrategiaPagamento(EstrategiaPagamento estrategia){ this.pagamento = estrategia; }

    public boolean pagar(){
        if(pagamento == null) throw new IllegalStateException("Pagamento não configurado");
        pago = pagamento.pagar(totalizar());
        return pago;
    }
}
