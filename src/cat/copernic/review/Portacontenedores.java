/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author Reda
 */
public class Portacontenedores extends BarcoDeMercancias {
    
    private int contenedores;

    public Portacontenedores(int contenedores, int capacidadDeCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(capacidadDeCarga, motor, eslora, manga, nudos, peso);
        this.contenedores = contenedores;
    }

   
      @Override
    public void arranca() {
        // ...
        System.out.println("Arrancando Portacontenedores...");
    }

    @Override
    public void atraca() {
        // ...
        System.out.println("Atracando Portacontenedores...");
    }
}
