public class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEmEstoque;

    public Produto(String nome, double precoUnitario, int quantidadeEmEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getprecoUnitario() {
        return precoUnitario;
    }

    public void setprecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getquantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setquantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //calcula valor total dos produtos disponíveis no estoque
    public double calcularValorTotal() {
        return precoUnitario * quantidadeEmEstoque;
    }

    @param quantidade Quantidade a ser adicionada deve ser positiva
    public void adicionarEstoque(int quantidade) {
         if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }//adiciona quantidade de produtos ao estoque

    @param quantidade Quantidade a ser removida
    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para remoção.");
            return;
        }

        if (quantidade > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente para remover " + quantidade + " unidades.");
            return;
        }

        quantidadeEmEstoque -= quantidade;
    }//remove quantidade de produtos do estoque

    @Override
    public String toString() {
        return String.format(
            "%s | R$ %.2f | %d unidades | Total: R$ %.2f",
            nome, precoUnitario, quantidadeEmEstoque, calcularValorTotalEmEstoque()
        );    
    }
