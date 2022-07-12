package Automóvel;

public class Automóvel {

    public static void main(String[] args) {
        Caminhão caminhao = new Caminhão();
        caminhao.setCaminhao("Diesel");

        Esportivo esportivo= new Esportivo();
        esportivo.setEsportivo("Gasolina");


        if (caminhao) {
            System.out.println("O automóvel utilizará diesel.");
        }
        if(esportivo) {
            System.out.println("O automóvel utilizará gasolina.");
        }

    }
}
