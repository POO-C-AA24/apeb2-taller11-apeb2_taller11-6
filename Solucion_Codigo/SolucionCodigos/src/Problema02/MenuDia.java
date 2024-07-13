/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *
 * @author VEL-JOSUE
 */
public class MenuDia extends Menu {

    double valorPostre;
    double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }
}
