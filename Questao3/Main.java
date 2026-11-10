package Questao3;

public class Main {
    public static void main(String[] args){
        Cardapio cardapio = new Cardapio();

        cardapio.registrarBebida("Espresso", new Bebida("Espresso", 6.00));
        cardapio.registrarBebida("Cha", new Bebida("Chá", 5.00));

        cardapio.registrarComplemento("Leite", new Complemento("Leite", 2.50));
        cardapio.registrarComplemento("Canela", new Complemento("Canela", 2.00));
        cardapio.registrarComplemento("Desenho", new Complemento("Desenho na espuma", 3.50));
        cardapio.registrarComplemento("Gelo", new Complemento("Cubos de gelo", 0.50));

        Pedido pedido1 = new Pedido(cardapio.criarBebida("Espresso"));
        pedido1.adicionar(cardapio.criarComplemento("Canela"));
        pedido1.adicionar(cardapio.criarComplemento("Desenho"));

        Pedido pedido2 = new Pedido(cardapio.criarBebida("Cha"));
        pedido2.adicionar(cardapio.criarComplemento("Canela"));
        pedido2.adicionar(cardapio.criarComplemento("Gelo"));
        pedido2.adicionar(cardapio.criarComplemento("Gelo"));
        pedido2.adicionar(cardapio.criarComplemento("Gelo"));

        // mesmo complemento repetido
        Pedido pedido3 = new Pedido(cardapio.criarBebida("Espresso"));
        pedido3.adicionar(cardapio.criarComplemento("Leite"));
        pedido3.adicionar(cardapio.criarComplemento("Canela"));
        pedido3.adicionar(cardapio.criarComplemento("Desenho"));

        pedido1.exibir();
        pedido2.exibir();
        pedido3.exibir();
    }
}
