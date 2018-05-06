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
public class Elipse {
    private double RadioMenor;
    private double RadioMayor;

    public Elipse(double RadioMenor, double RadioMayor) {
        this.RadioMenor = RadioMenor;
        this.RadioMayor = RadioMayor;
    }

    public double getRadioMenor() {
        return RadioMenor;
    }

    public void setRadioMenor(double RadioMenor) {
        this.RadioMenor = RadioMenor;
    }

    public double getRadioMayor() {
        return RadioMayor;
    }

    public void setRadioMayor(double RadioMayor) {
        this.RadioMayor = RadioMayor;
    }
    
    public double getArea(){
        return Math.PI*this.RadioMayor*this.RadioMenor;
    }
    public double getPerimetro(){
        return Math.PI*(3*(this.RadioMayor + this.RadioMenor)-Math.sqrt((3*this.RadioMayor+this.RadioMenor)*(this.RadioMayor + 3*this.RadioMenor)));
    }
}
