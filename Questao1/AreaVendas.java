package Questao1;

public class AreaVendas extends AbsObservador{
    @Override 
    public void atualizar(String nomeProduto, int qtd, int qtdAnterior){
        if (qtdAnterior == 0 && qtd > 0){
            System.out.printf("\nATENÇÃO - VENDAS: produto %s voltou ao estoque com %d unidades !!!", nomeProduto, qtd);
        }
    }
    
}
