/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

/**
 *
 * @author VEL-JOSUE
 */
import java.util.Random;

public class Guerrero extends Personaje {
    public int fuerza;
    public Random random;

    public Guerrero(int puntosDeVida, int nivelDeExperiencia, int fuerza) {
        super(puntosDeVida, nivelDeExperiencia);
        this.fuerza = fuerza;
        this.random = new Random();
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dano = fuerza + random.nextInt(10); // Variación en ataque
        enemigo.puntosDeVida -= dano;
    }

    @Override
    public void defender() {
        puntosDeVida += 5 + random.nextInt(5); // Variación en defensa
    }

    @Override
    public String getTipo() {
        return "Guerrero";
    }
}

