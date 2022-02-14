package Ferroviaria;

import Ferroviaria.personal.Especialidad;
import Ferroviaria.personal.JefeDeEstación;
import Ferroviaria.personal.Maquinista;
import Ferroviaria.personal.Mecánico;

public class PlantillaMain {
    public static void main(String[] args) {
        //Mecánico ppp=new Mecanico(pepe,fsf, Especialidad)
        //pepe.imprimirDatos();

        //Locomotora l =new Locomotora("MMD234, 350, pepe--el mecanicado asignado)




// Simulamos una estación: creamos objetos de diversos tipos:

        // dos maquinistas
        Maquinista maquinista1= new Maquinista("Pepe", "11111111P", 42000.0, 1);
        Maquinista maquinista2=new Maquinista("Marta", "22222222M", 42000.0, 1);
        // imprimimos los datos de los dos maquinistas
        System.out.println("Datos del maquinista Pepe:");
        maquinista1.mostrarDatos();
        System.out.println("Datos del maquinista Marta:");
        maquinista2.mostrarDatos();

        // un mecánico de cada especialidad
        Mecánico mecánico1=new Mecánico("F.Frenador",389177612, Especialidad.FRENOS);
        Mecánico mecánico2=new Mecánico("H.Hidráulico",389177612, Especialidad.HIDRÁULICA);
        // imprimimos los datos de cada mecánico
        System.out.println("Datos del mecánico F.Frenador"+ "\uD83D\uDD27"); //AÑADIR EMOJIS
        mecánico1.mostrarDatos();
        System.out.println("Datos del mecánico H.Hidráulico"); //AÑADIR EMOJIS
        mecánico2.mostrarDatos();


        // Un jefe de estación
        JefeDeEstación jefeDeEstación=new JefeDeEstación("El Boss",22222222D, "2019-12-01");
        // Imprimimos los datos del jefe de estación
        jefeDeEstación.mostrarDatos();
        // Una locomotora
        // imprimimos los datos de la locomotora


        // Creamos un tren con la locomotora que acabamos de crear
/*
        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");

        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n*****     Le asignamos un maquinista *****");

        // Mostramos el número de vagones del tren
        // Mostramos los datos del tren creado

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        // mostramos el número de vagones del tren

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");


 */

    }
}
