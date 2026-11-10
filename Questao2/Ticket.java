package Questao2;

public class Ticket {
    private String placa;
    private int minutos;
    private PerfilCobranca perfilCobranca;

    //
    public Ticket(String placa, int minutos, PerfilCobranca perfil){
        this.placa = placa;
        this.minutos = minutos;
        this.perfilCobranca = perfil;
    }
    
    public void setPerfil(PerfilCobranca perfil){
        this.perfilCobranca = perfil;
    }

    public double calcularValor(){
        return perfilCobranca.calcular(minutos);
    }

    public void exibir(){
        System.out.printf("Placa: %s\nTipo de cobrança: %s\nMinutos de permanência: %d\nValor pago: R$ %.2f\n\n", placa, perfilCobranca.descrever(), minutos, calcularValor());
    }
}
