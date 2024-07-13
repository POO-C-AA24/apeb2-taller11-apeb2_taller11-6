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

public class Mago extends Personaje {
    public int poderMagico;
    public Random random;

    public Mago(int puntosDeVida, int nivelDeExperiencia, int poderMagico) {
        super(puntosDeVida, nivelDeExperiencia);
        this.poderMagico = poderMagico;
        this.random = new Random();
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dano = poderMagico + random.nextInt(15); // Variación en ataque
        enemigo.puntosDeVida -= dano;
    }

    @Override
    public void defender() {
        puntosDeVida += 3 + random.nextInt(7); // Variación en defensa
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}


