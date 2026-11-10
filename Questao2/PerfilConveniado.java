package Questao2;

public class PerfilConveniado implements PerfilCobranca{
    private static final int MIN_GRATIS = 30;
    private double valorHora = 7.50;
    private double desconto = 0.13;

    @Override
    public double calcular(int minutos){
        if (minutos <= MIN_GRATIS){
            return 0.0;
        }
        int minCobrados = minutos - MIN_GRATIS;
        int horas = (int) Math.ceil(minCobrados / 60.0);

        return horas * valorHora * (1 - desconto);
    }

    @Override
    public String descrever(){
        return "Conveniado";
    }
    
}
