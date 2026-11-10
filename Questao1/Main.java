package Questao1;

public class Main {
    public static void main(String args[]){
        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        Produto redePesca = new Produto("Rede de Pesca", 6);

        redePesca.inscrever(compras);
        redePesca.inscrever(vendas);
        redePesca.inscrever(auditoria);

        redePesca.setQtd(12);
        redePesca.setQtd(3);
        redePesca.setQtd(0);
        redePesca.setQtd(9);

        Produto iscas = new Produto("Isca de peixe", 2);

        iscas.inscrever(compras);
        iscas.inscrever(vendas);
        iscas.inscrever(auditoria);

        iscas.remover(auditoria);

        iscas.setQtd(0);
        iscas.setQtd(9);

        
    }
}
