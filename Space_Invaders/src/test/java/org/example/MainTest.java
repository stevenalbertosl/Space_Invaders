package org.example;

import org.junit.jupiter.api.Test;
import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void crearAlienPosicionCorrecta(){
        int valorX = 10;
        int valorY = 10;
        Alien alien = new Alien(valorX, valorY);
        boolean resultado =  alien.getX() == valorX && alien.getY() == valorY;
        assertTrue(resultado);

    }
}