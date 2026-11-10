package Questao2;

public class Main {
    public static void main(String args[]){
        Ticket rotativo = new Ticket("AXE5956", 50, new PerfilRotativo());
        rotativo.exibir();

        Ticket mensalista = new Ticket("ABY7I90", 20, new PerfilMensalista());
        mensalista.exibir();

        Ticket conveniado = new Ticket("LAN5A11", 15, new PerfilConveniado());   
        conveniado.exibir();


        System.out.println();

        rotativo.setPerfil(new PerfilMensalista());
        rotativo.exibir();

        mensalista.setPerfil(new PerfilRotativo());
        mensalista.exibir();

    }
    
}
