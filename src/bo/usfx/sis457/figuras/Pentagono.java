/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author pablo
 */
public class Pentagono {
    private double lado;


    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getPerimetro(){
        return this.lado*5;
    }
    public double getArea(){
     return (((getPerimetro() *this.lado)/(2*0.73))/2);
    }
}
