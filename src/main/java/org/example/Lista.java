package org.example;

import java.util.Arrays;

public class Lista {
    private Moneda moneda [] = new Moneda[14];

    public Lista(Moneda[] moneda) {
        this.moneda = moneda;
    }
    public Lista(){
        moneda[0] = new Shiba(0.00001340,35.90,"Shiba");
        moneda[1] = new Solana(25.67,165.92,"Sol");
        moneda[2] = new Fantom(0.5176,18.52,"FTM");
        moneda[3] = new GreenMetaverse(0.4569,10.15,"GMT");
        moneda[4] = new Cosmos(14.518,10.90,"ATOM");
        moneda[5] = new Polygon(1.4565,41.94,"Matic");
        moneda[6] = new Decentraland(0.7485,6.53,"Mana");
        moneda[7] = new TheSanbox(0.8450,29.71,"Sand");
        moneda[8] = new Flow(1.402,3.32,"Flow");
        moneda[9] = new Polkadot(7.446,12.81,"DOT");
        moneda[10] = new Ripple(0.4017,45.83,"XRP");
        moneda[11] = new Cardano(0.4050,19.44,"ADA");
        moneda[12] = new OasisNetwork(0.07486,5.80,"Rose");
        moneda[13] = new Audius(0.3373,2.16,"Audio");
    }
    public void ordenVolumen(){
        Moneda volumenOrdenado= new Moneda();
        for (int i = moneda.length-1; i > -1; i--) { //Recorre el array.
            for (int j = 0; j < moneda.length-1; j++) { //Ordena el array.
                if (moneda[j].volumen<moneda[j+1].volumen){
                    volumenOrdenado = moneda[j+1];
                    moneda[j+1] = moneda[j];
                    moneda[j] = volumenOrdenado;
                }
            }
        }
        for (int i = 0; i < moneda.length; i++) { //Recorre el array y lo imprime ordenado.
            System.out.println(moneda[i]);
        }
    }
}
