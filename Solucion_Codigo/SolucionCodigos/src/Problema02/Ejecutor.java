/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *
 * @author VEL-JOSUE
 */
public class Ejecutor {
    public static void main(String[] args) {
        MenuCarta menuCarta = new MenuCarta("Plato Carta", 10.0, 2.0, 1.5, 10);
        MenuDia menuDia = new MenuDia("Plato Dia", 8.0, 2.5, 1.0);
        MenuNiños menuNinos = new MenuNiños("Plato Niños", 5.0, 1.5, 2.0);
        MenuEconomico menuEconomico = new MenuEconomico("Plato Economico", 7.0, 15);

        Cuenta cuenta = new Cuenta("Josue Pardo");
        cuenta.agregarMenu(menuCarta);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuNinos);
        cuenta.agregarMenu(menuEconomico);

        cuenta.generarCuenta();
    }
}
