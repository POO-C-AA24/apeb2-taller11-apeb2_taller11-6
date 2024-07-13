/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

/**
 *
 * @author VEL-JOSUE
 */
public class SistemaCombate {
    public Personaje evaluarCombate(Personaje p1, Personaje p2) {
        while (p1.getPuntosDeVida() > 0 && p2.getPuntosDeVida() > 0) {
            p1.atacar(p2);
            if (p2.getPuntosDeVida() > 0) {
                p2.atacar(p1);
            }
        }
        return p1.getPuntosDeVida() > 0 ? p1 : p2;
    }
}
