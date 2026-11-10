package Questao3;

public class Bebida implements Prototype<Bebida> {
    private String nome;
    private double preco;

    public Bebida(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor da cópia
    public Bebida(Bebida origem){
        this.nome = origem.nome;
        this.preco = origem.preco;
    }

    @Override
    public Bebida clonar(){
        return new Bebida(this);
    }

    public String descricao(){
        return nome;
    }

    public double preco(){
        return preco;
    }
}
