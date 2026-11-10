package Questao1;

public class AreaCompras extends AbsObservador{
    private static final int ESTOQUE_MIN = 5;

    @Override 
    public void atualizar(String nomeProduto, int qtd, int qtdAnterior){
        if (qtd < ESTOQUE_MIN){
            System.err.printf("\nCOMPRAS - ATENÇÃO: estoque de %s abaixo de %d !!!", nomeProduto, qtd);
        }
    }
}
