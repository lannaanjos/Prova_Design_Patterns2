package Questao3;

// é o equivalente do registry

import java.util.HashMap;
import java.util.Map;

public class Cardapio {
    private final Map<String, Bebida> bebidas = new HashMap<>();
    private final Map<String, Complemento> complementos = new HashMap<>();

    public void registrarBebida(String chave, Bebida b){
        bebidas.put(chave, b);
    }

    public void registrarComplemento(String chave, Complemento c){
        complementos.put(chave, c);
    }

    public Bebida criarBebida(String chave){
        Bebida modelo = bebidas.get(chave);
        if (modelo == null){
            throw new IllegalArgumentException("Bebida não cadastrada: " + chave);
        }
        return modelo.clonar();
    }

    public Complemento criarComplemento(String chave){
        Complemento modelo = complementos.get(chave);
        if (modelo == null){
            throw new IllegalArgumentException("Complemento não cadastrado: " + chave);
        }
        return modelo.clonar();
    }
}
