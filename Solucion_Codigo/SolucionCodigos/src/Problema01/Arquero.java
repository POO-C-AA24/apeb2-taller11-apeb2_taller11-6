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

public class Arquero extends Personaje {
    public int precision;
    public Random random;

    public Arquero(int puntosDeVida, int nivelDeExperiencia, int precision) {
        super(puntosDeVida, nivelDeExperiencia);
        this.precision = precision;
        this.random = new Random();
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dano = precision + random.nextInt(12); // Variación en ataque
        enemigo.puntosDeVida -= dano;
    }

    @Override
    public void defender() {
        puntosDeVida += 4 + random.nextInt(6); // Variación en defensa
    }

    @Override
    public String getTipo() {
        return "Arquero";
    }
}
