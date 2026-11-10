package Questao1;

public class Produto extends AbsObservado{
    private String nome;
    private int qtd;

    // construtor
    public Produto(String nome, int qtd){
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome(){
        return nome;
    }

    public int getQtd(){
        return qtd;
    }

    public void setQtd(int novaQtd){
        int qtdAnterior = qtd;
        this.qtd = novaQtd;
        notificarTodos(nome, qtd, qtdAnterior);
    }

    private void notificarTodos(String nome, int qtd, int qtdAnterior){
        for(AbsObservador observador : this.listaObservadores){
            observador.atualizar(nome, qtd, qtdAnterior);
        }
    }

    @Override
    public void inscrever(AbsObservador observador){
        listaObservadores.add(observador);
    }

    @Override
    public void remover(AbsObservador observador){
        listaObservadores.remove(observador);
    }
    
}
