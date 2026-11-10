package Questao2;

public class PerfilMensalista implements PerfilCobranca{
    private static final double VALOR_FIXO = 120.00;

    @Override 
    public double calcular(int minutos){
        return VALOR_FIXO;
    }

    @Override
    public String descrever(){
        return "Mensalista";
    }
    
}
