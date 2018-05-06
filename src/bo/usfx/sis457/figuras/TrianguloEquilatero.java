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
public class TrianguloEquilatero {
    private double l;

    public TrianguloEquilatero(double l) {
        this.l = l;
    }

    public double getl() {
        return l;
    }

    public void setl(double l) {
        this.l = l;
    }
    public double getArea(){
        return ((Math.sqrt(Math.pow(this.l,2)-Math.pow(this.l/2,2)))*l)/2;
    }
    /**
     *
     * @return
     */
    public double getPerimetro(){
        return (this.l*3);
    }
}
