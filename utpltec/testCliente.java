package com.utpltec;

import java.util.ArrayList;

public class testCliente {
    public static void main(String[] args) {
        
        ArrayList<cliente> coleccionCliente = new ArrayList<>();

        cliente cliente1 = new cliente("Carlos", 22, 7, "LeagueOfLegends");
        cliente cliente2 = new clienteHabitual("JavierR", 22, 7, "Dota2", "Viernes", 9);
        cliente cliente3 = new clienteSuscripcion("DavidH", 20, 6, "PUBG", "Sábado", 15, 0);
        cliente cliente4 = new clienteNuevo("CamilaH", 21, 5, "LeagueOfLegends", "Sábado", 6); 
            
        //agregamos a la colección
        coleccionCliente.add(cliente1);
        coleccionCliente.add(cliente2);
        coleccionCliente.add(cliente3);
        coleccionCliente.add(cliente4);


        for (int i = 0; i < coleccionCliente.size(); i++) {

            cliente cliente = coleccionCliente.get(i);
            System.out.println("cliente" + " " + cliente.getNombreCliente());
            
        }




    }
}
