package julianaAtividade;

public class Baralho {

    private PilhaObj <Carta> baralho;

    public Baralho(PilhaObj<Carta> baralho) {
        this.baralho = baralho;
        baralho = new PilhaObj<>(52);
        String[] faces = {"As","2","3","4","5","6","7","8","9","10", "Valete", "Dama", "Rei"};
        String[] naipes = {"Copas", "Paus", "Ouros", "Espadas"};
        PilhaObj<Carta> objpilha = new PilhaObj<>(1);
       this.baralho = objpilha;
//       Carta carta1 = new Carta("As",2,"Copas");
//       Carta carta2 = new Carta("2",3,"Copas");
//       Carta carta3 = new Carta("3",8,"Copas");
//       Carta carta4 = new Carta("Rei",8,"Copas");
//       Carta carta5 = new Carta("As",8,"Paus");
//       Carta carta6 = new Carta("2",8,"Paus");
//       Carta carta7 = new Carta("3",8,"Paus");
//       Carta carta8 = new Carta("Rei",8,"Paus");
//       Carta carta9 = new Carta("As",8,"Ouros");
//       Carta carta10 = new Carta("2",8,"Ouros");
//       Carta carta11 = new Carta("3",8,"Ouros");
//       Carta carta12 = new Carta("Rei",8,"Ouros");
//       Carta carta13 = new Carta("As",8,"Espadas");
//       Carta carta14 = new Carta("2",8,"Espadas");
//       Carta carta15 = new Carta("3",8,"Espadas");
//       Carta carta16 = new Carta("Rei",8,"Espadas");
//
//       baralho.push(carta1,carta2,carta3,carta4,carta5,carta6,carta7,carta8,carta9,
//               carta10,carta11,carta12,carta13,carta14,carta15,carta16);
//
        int cont=0;
        while (!baralho.isFull()){
        baralho.push(new Carta(faces[cont%13], cont%13 + 1, naipes[cont/13]));
        cont++;
        }

        public void removeCarta(int indice){

        }








    }

    public PilhaObj<Carta> getBaralho() {
        return baralho;
    }

    public PilhaObj<Carta> setBaralho() {
        return baralho;
    }




 String teste = "====================" +
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "|                   |"+
                "=====================";
}
