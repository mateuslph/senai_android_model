public class Main {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos();
        produto1.setDescricao("Azeite");
        produto1.setPreco(7.5f);
        produto1.setUnidade("Litro");

        Produtos produto2 = new Produtos();
        produto2.setDescricao("Banana");
        produto2.setPreco(3.2f);
        produto2.setUnidade("kg");

        Produtos produto3 = new Produtos();
        produto3.setDescricao("Carne");
        produto3.setPreco(36.8f);
        produto3.setUnidade("kg");

        System.out.println("Produto: " + produto1.getDescricao() + " / Preço: R$ " + produto1.getPreco() +
                " / Unidade: " + produto1.getUnidade());

        System.out.println("Produto: " + produto2.getDescricao() + " / Preço: R$ " + produto2.getPreco() +
                " / Unidade: " + produto2.getUnidade());

        System.out.println("Produto: " + produto3.getDescricao() + " / Preço: R$ " + produto3.getPreco() +
                " / Unidade: " + produto3.getUnidade());
    }
}