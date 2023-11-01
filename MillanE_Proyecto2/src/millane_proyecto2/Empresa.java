/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

/**
 *
 * @author enriq
 */
public class Empresa {
     private Queue cola1;
    private Queue cola2;
    private Queue cola3;
    private Queue cola4;
    private Queue Refuerzo;
    private Queue Ganadores;

    public Empresa(Queue cola1, Queue cola2, Queue cola3, Queue cola4, Queue Refuerzo, Queue Ganadores) {
        this.cola1 = cola1;
        this.cola2 = cola2;
        this.cola3 = cola3;
        this.cola4 = cola4;
        this.Refuerzo = Refuerzo;
        this.Ganadores = Ganadores;
    }

    public Queue getCola1() {
        return cola1;
    }

    public void setCola1(Queue cola1) {
        this.cola1 = cola1;
    }

    public Queue getCola2() {
        return cola2;
    }

    public void setCola2(Queue cola2) {
        this.cola2 = cola2;
    }

    public Queue getCola3() {
        return cola3;
    }

    public void setCola3(Queue cola3) {
        this.cola3 = cola3;
    }

    public Queue getCola4() {
        return cola4;
    }

    public void setCola4(Queue cola4) {
        this.cola4 = cola4;
    }

    public Queue getRefuerzo() {
        return Refuerzo;
    }

    public void setRefuerzo(Queue Refuerzo) {
        this.Refuerzo = Refuerzo;
    }

    public Queue getGanadores() {
        return Ganadores;
    }

    public void setGanadores(Queue Ganadores) {
        this.Ganadores = Ganadores;
    }
    
    
}
