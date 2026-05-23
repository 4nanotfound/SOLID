package TrabalhoDelivery.ISP;

import TrabalhoDelivery.SRP.Pedido;
import TrabalhoDelivery.SRP.ImpressoraPedido;
import TrabalhoDelivery.SRP.RepositorioPedido;

public class GerenciadorPedidoSimples implements GerenciadorPedido {
    private RepositorioPedido repositorio;
    private ImpressoraPedido impressora;

    public GerenciadorPedidoSimples(RepositorioPedido repositorio, ImpressoraPedido impressora){
        this.repositorio = repositorio;
        this.impressora = impressora;
    }

    @Override
    public Pedido criarPedido(){
        return new Pedido();
    }

    @Override
    public void salvarPedido(Pedido pedido){
        repositorio.salvar(pedido);
    }

    @Override
    public void mostrarPedido(Pedido pedido){
        impressora.imprimir(pedido);
    }
}
