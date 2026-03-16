package scr.ArrayList;

import java.util.ArrayList;

public class ejercicio10 {


//Ejercicio #10
    public static void liga(){
        String datos = "Celta de vigo::Almeria::2::2 "
                + "Villareal::Mallorca::4::3 "
                + "Osasuna::Mallorca::3::2 "
                + "Granada::Valencia::0::4 "
                + "Barcelona::Girona::0::4 ";
        
        ArrayList<String> partidos = new ArrayList<>();

        String[] lista = datos.split(" ");
        for(String p : lista){
            partidos.add(p);
        }

        int victorias_del_Barcelona = 0;
        int victorias_local = 0;

        System.out.println("Partidos donde gano el equipo visitante:\n");
        for(String partido : partidos){
            String[] datos_del_partido = partido.split("::");

            String local = datos_del_partido[0];
            String visitante = datos_del_partido[1];

            int goles_local = Integer.parseInt(datos_del_partido[2]);
            int goles_visitante = Integer.parseInt(datos_del_partido[3]);

            if(goles_visitante > goles_local){
                System.out.println(local +" "+goles_local + " - "
                        + goles_visitante + " " + visitante);
            }

            if(local.equals("Barcelona ") && goles_local > goles_visitante){
                victorias_del_Barcelona++;
            }

            if(visitante.equals("Barcelona ") && goles_visitante > goles_local){
                victorias_del_Barcelona++;
            }

            if (goles_local > goles_visitante) {
                victorias_local++;
                
            }
        }

        System.out.println("\n Veces que gano el Barcelona: " + victorias_del_Barcelona );
        ArrayList<String> empates = new ArrayList<>();

        for(String partido : partidos){
            String[] datos_partido = partido.split(" :: ");

            int goles_local = Integer.parseInt(datos_partido[2]);
            int goles_visitante = Integer.parseInt(datos_partido[3]);
            
            if(goles_local == goles_visitante){
                empates.add(partido);
            }
        }
        System.out.println("\n Partidos que terminaron en empate:\n ");

        for(String empate : empates){
            System.out.println(empate);
        }

        System.out.println("\n Partidos ganados por el local: " + victorias_local);
    }
        public static void main(String[] args){
            liga();
        }


}
