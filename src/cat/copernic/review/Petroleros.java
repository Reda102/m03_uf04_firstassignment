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
public class Petroleros extends BarcoDeMercancias {
    
    private int cisterna;

    public Petroleros(int cisterna, int capacidadDeCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(capacidadDeCarga, motor, eslora, manga, nudos, peso);
        this.cisterna = cisterna;
    }

    @Override
    public void abandonenElBarco() {
        super.abandonenElBarco(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Abandonen usando protocolo enboscada... ");
    }

    @Override
    public void atraca() {
        super.atraca(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void arranca() {
        super.arranca(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   
}
