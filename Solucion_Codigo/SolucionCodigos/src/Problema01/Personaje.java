/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

/**
 *
 * @author VEL-JOSUE
 */
public abstract class Personaje {
    protected int puntosDeVida;
    protected int nivelDeExperiencia;

    public Personaje(int puntosDeVida, int nivelDeExperiencia) {
        this.puntosDeVida = puntosDeVida;
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public abstract void atacar(Personaje enemigo);
    public abstract void defender();
    public abstract String getTipo();

    public void subirDeNivel() {
        nivelDeExperiencia++;
        puntosDeVida += 10; // Ejemplo de cómo podría aumentar los puntos de vida al subir de nivel
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }
}

