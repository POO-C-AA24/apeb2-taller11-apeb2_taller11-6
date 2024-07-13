/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *
 * @author VEL-JOSUE
 */
public class MenuNiños extends Menu {

    double valorHelado;
    double valorPastel;

    public MenuNiños(String nombrePlato, double valorInicialMenu, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }
}
