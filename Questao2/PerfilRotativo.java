package Questao2;

public class PerfilRotativo implements PerfilCobranca{
    private double valorHora = 7.50;

    @Override 
    public double calcular(int minutos){
        int horas = (int) Math.ceil(minutos / 60.0);

        return horas * valorHora;
    }

    @Override
    public String descrever(){
        return "Rotativo";
    }
}
