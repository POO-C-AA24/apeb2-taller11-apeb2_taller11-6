/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *
 * @author VEL-JOSUE
 */
public class MenuEconomico extends Menu {
       double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu, double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento / 100);
    }
}
