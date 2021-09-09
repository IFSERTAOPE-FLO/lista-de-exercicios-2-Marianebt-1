package questao19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”
*/

public class Pedido {

    private int id;
    private Itens[] itens;
    private String formaPagamento;
    private int qtdItens;

    public Pedido(int id, String formaPagamento, int qtdItens) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.itens = new Itens[qtdItens];
    }

    public void adicionarItem(Itens item) {
        this.itens[item.getId()] = item;
    }

    public int getId() {
        return id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (int i = 0; i < itens.length; i++) {
            // valorTotal = valorTotal + itens[i].getPreco();
            valorTotal += itens[i].getPreco();
        }
        return valorTotal;
    }

    public void imprimir() {
        System.out.println("Pedido: " + this.id);
        System.out.println("Forma de pagamento: " + this.formaPagamento);
        System.out.println("Itens: ");
        for (int i = 0; i < this.itens.length; i++) {
            System.out.println(
                    "\t" + this.itens[i].getId() + " - " + this.itens[i].getNome() + " - " + this.itens[i].getPreco());
            System.out.println("Digite os itens escolhidos:");
              this.quantidadeEstoque = quantidade;
              public int getQuantidade() {
        return this.quantidadeEstoque;
    }
             
            
        }
        System.out.println("Total: " + this.getValorTotal());
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("( 1 ) - Cartão");
        System.out.println("( 2 ) - Dinheiro");
        System.out.println("( 3 ) - Cheque");
        if (Opção == 2) {
            System.out.println(" Qual o valor do pagamento?");
            Troco == valorTotal+Itens[qtdItens];
        }
    }
}