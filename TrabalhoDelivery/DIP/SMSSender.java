package TrabalhoDelivery.DIP;

public class EnviadorSMS implements EnviadorNotificacao {
    private String telefone;
    public EnviadorSMS(String telefone){ this.telefone = telefone; }
    public void enviar(String mensagem){
        System.out.println("Enviando SMS para " + telefone + ": " + mensagem);
    }
}
