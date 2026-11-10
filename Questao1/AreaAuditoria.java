package Questao1;

public class AreaAuditoria extends AbsObservador{
    @Override 
    public void atualizar(String nomeProduto, int qtd, int qtdAnterior){
        System.out.printf("\nATENÇÃO - AUDITORIA: %s: %d -> %d", nomeProduto, qtdAnterior, qtd);
    }
}
