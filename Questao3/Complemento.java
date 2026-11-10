package Questao3;

public class Complemento implements Prototype<Complemento> {
    private String nome;
    private double preco;

    public Complemento(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor da cópia
    public Complemento(Complemento origem){
        this.nome = origem.nome;
        this.preco = origem.preco;
    }

    @Override
    public Complemento clonar(){
        return new Complemento(this);
    }

    public String descricao(){
        return nome;
    }

    public double preco(){
        return preco;
    }
}