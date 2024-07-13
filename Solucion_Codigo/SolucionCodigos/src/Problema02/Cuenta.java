/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VEL-JOSUE
 */
public class Cuenta {
     String nombreCliente;
    List<Menu> listadoMenus;
    double valorTotal;
    double subtotal;
    double iva;

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        listadoMenus.add(menu);
    }

    public void calcularSubtotal() {
        subtotal = 0;
        for (Menu menu : listadoMenus) {
            subtotal += menu.valorMenu;
        }
    }

    public void calcularIva() {
        iva = subtotal * 0.12; 
    }

    public void calcularValorTotal() {
        valorTotal = subtotal + iva;
    }

    public void generarCuenta() {
        calcularSubtotal();
        calcularIva();
        calcularValorTotal();
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Valor Total: " + valorTotal);
    }
}
