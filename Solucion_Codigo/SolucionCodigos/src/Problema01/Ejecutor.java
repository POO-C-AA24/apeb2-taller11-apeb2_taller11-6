/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

/**
 *
 * @author VEL-JOSUE
 */
public class Ejecutor {
    public static void main(String[] args) {
         Personaje guerrero = new Guerrero(100, 1, 20);
        Personaje mago = new Mago(80, 1, 25);
        Personaje arquero = new Arquero(90, 1, 22);

        SistemaCombate sistemaCombate = new SistemaCombate();

        Personaje ganador1 = sistemaCombate.evaluarCombate(guerrero, mago);
        System.out.println("Ganador de la batalla 1: " + ganador1.getTipo());

        Personaje ganador2 = sistemaCombate.evaluarCombate(mago, arquero);
        System.out.println("Ganador de la batalla 2: " + ganador2.getTipo());

        Personaje ganador3 = sistemaCombate.evaluarCombate(arquero, guerrero);
        System.out.println("Ganador de la batalla 3: " + ganador3.getTipo());
    }
}
