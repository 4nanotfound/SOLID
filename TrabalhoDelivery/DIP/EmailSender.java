package TrabalhoDelivery.DIP;

public class EnviadorEmail implements EnviadorNotificacao {
    private String email;
    public EnviadorEmail(String email){ this.email = email; }
    public void enviar(String mensagem){
        System.out.println("Enviando EMAIL para " + email + ": " + mensagem);
    }
}
