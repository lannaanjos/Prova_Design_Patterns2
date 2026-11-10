package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Bebida bebida;
    private List<Complemento> complementos = new ArrayList<>();

    public Pedido(Bebida bebida){
        this.bebida = bebida;
    }

    // o mesmo complemento pode ser adicionado mais de uma vez
    public void adicionar(Complemento c){
        complementos.add(c);
    }

    public String descricao(){
        StringBuilder texto = new StringBuilder(bebida.descricao());
        for (Complemento c : complementos){
            texto.append(" + ").append(c.descricao());
        }
        return texto.toString();
    }

    public double preco(){
        double total = bebida.preco();
        for (Complemento c : complementos){
            total += c.preco();
        }
        return total;
    }

    public void exibir(){
        System.out.printf("Pedido: %s\nValor a pagar: R$ %.2f\n\n", descricao(), preco());
    }
}
