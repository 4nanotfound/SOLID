package TrabalhoDelivery.LSP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== LSP: Liskov Substitution Principle ===\n");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Pizza("Margherita", 30.0));
        produtos.add(new Hamburguer("Cheese", 22.0));
        produtos.add(new Bebida("Coca-Cola", 6.0));

        System.out.println("Produtos do cardápio:");
        for (Produto p : produtos) {
            System.out.println("  - " + p.obterNome() + ": R$" + p.obterPreco());
        }

        double total = produtos.stream().mapToDouble(Produto::obterPreco).sum();
        System.out.println("\nTotal: R$" + total);
        System.out.println("\n✓ Pizza, Hamburguer e Bebida substituem Produto perfeitamente!");
    }
}
