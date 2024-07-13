/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *
 * @author VEL-JOSUE
 */
public class MenuCarta extends Menu {

    double valorGuarnicion;
    double valorBebida;
    double porcentajeAdicionalServicio;

    public MenuCarta(String nombrePlato, double valorInicialMenu, double valorGuarnicion, double valorBebida, double porcentajeAdicionalServicio) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorGuarnicion + valorBebida + (valorInicialMenu * porcentajeAdicionalServicio / 100);
    }
}
