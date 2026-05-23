package TrabalhoDelivery.DIP;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== DIP: Dependency Inversion Principle ===\n");

        System.out.println("Notificação via Email:");
        EnviadorNotificacao enviadorEmail = new EnviadorEmail("cliente@exemplo.com");
        ServicoNotificacao servicoEmail = new ServicoNotificacao(enviadorEmail);
        servicoEmail.notificar("Seu pedido foi confirmado!");

        System.out.println("\nNotificação via SMS:");
        EnviadorNotificacao enviadorSMS = new EnviadorSMS("11999999999");
        ServicoNotificacao servicoSMS = new ServicoNotificacao(enviadorSMS);
        servicoSMS.notificar("Seu pedido foi confirmado!");

        System.out.println("\nNotificação via WhatsApp:");
        EnviadorNotificacao enviadorWhatsApp = new EnviadorWhatsApp("11999999999");
        ServicoNotificacao servicoWhatsApp = new ServicoNotificacao(enviadorWhatsApp);
        servicoWhatsApp.notificar("Seu pedido foi confirmado!");

        System.out.println("\n✓ ServicoNotificacao depende apenas de abstrações!");
    }
}
