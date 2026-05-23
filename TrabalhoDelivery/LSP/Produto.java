package TrabalhoDelivery.LSP;

public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String obterNome(){ return nome; }
    public double obterPreco(){ return preco; }
}
