package TrabalhoDelivery.DIP;

public class EnviadorWhatsApp implements EnviadorNotificacao {
    private String telefone;
    public EnviadorWhatsApp(String telefone){ this.telefone = telefone; }
    public void enviar(String mensagem){
        System.out.println("Enviando WhatsApp para " + telefone + ": " + mensagem);
    }
}
