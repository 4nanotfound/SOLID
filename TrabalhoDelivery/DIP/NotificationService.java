package TrabalhoDelivery.DIP;

public class ServicoNotificacao {
    private EnviadorNotificacao enviador;

    public ServicoNotificacao(EnviadorNotificacao enviador){
        this.enviador = enviador;
    }

    public void notificar(String mensagem){
        enviador.enviar(mensagem);
    }
}
