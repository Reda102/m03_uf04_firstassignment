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
public abstract class BarcoDeMercancias  extends Barco{
    
    private int capacidadDeCarga;

    public BarcoDeMercancias(int capacidadDeCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.capacidadDeCarga = capacidadDeCarga;
    }
    

    
    
        @Override
    public void arranca() {
        // ...
        System.out.println("Arrancando barco de mercancias...");
    }

    @Override
    public void atraca() {
        // ...
        System.out.println("Atracando barco de mercancias...");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonamos el barco con orden.");
    }

    @Override
    public void comportamiento() {
        System.out.println("Mantener limpia la cubierta del barco.");
    }
    
    
    
    
}
