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
    private Queue BDD;

    public Empresa() {
        this.cola1 = new Queue(11);
        this.cola2 = new Queue(11);
        this.cola3 = new Queue(11);
        this.cola4 = new Queue(10);
        this.Refuerzo = new Queue(10);
        this.Ganadores = new Queue(10);
        this.BDD = new Queue(11);
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

    public Queue getBDD() {
        return BDD;
    }

    public void setBDD(Queue BDD) {
        this.BDD = BDD;
    }
    
    public void llenarBDD(String empresa){
        
        if(empresa=="Nintendo"){
            Personaje nuevo1= new Personaje(1,"Link",empresa);
            BDD.enQueue(nuevo1);
            Personaje nuevo2= new Personaje(2,"Zelda",empresa);
            BDD.enQueue(nuevo2);
            Personaje nuevo3= new Personaje(3,"Ganondorf",empresa); 
            BDD.enQueue(nuevo3);
            Personaje nuevo4= new Personaje(4,"Kass",empresa);
            BDD.enQueue(nuevo4);
            Personaje nuevo5= new Personaje(5,"Malon",empresa);
            BDD.enQueue(nuevo5);
            Personaje nuevo6= new Personaje(6,"Sidon",empresa);
            BDD.enQueue(nuevo6);
            Personaje nuevo7= new Personaje(7,"Rey de Hyrule",empresa);
            BDD.enQueue(nuevo7);
            Personaje nuevo8= new Personaje(8,"Navi",empresa);
            BDD.enQueue(nuevo8);
            Personaje nuevo9= new Personaje(9,"Medli",empresa);
            BDD.enQueue(nuevo9);
            Personaje nuevo10= new Personaje(10,"Nabooru",empresa);
            BDD.enQueue(nuevo10);
            
            
            for (int i = 0; i < 10; i++) {
               
                if (BDD.items[i].getPriority()==4) {
                    cola1.enQueue(BDD.items[i]);
                }else if(BDD.items[i].getPriority()==3 ){
                    cola2.enQueue(BDD.items[i]);
                }else{
                    cola3.enQueue(BDD.items[i]);
                }
            }
            
        }else{
            Personaje nuevo1= new Personaje(1,"Ryu",empresa);
            BDD.enQueue(nuevo1);
            Personaje nuevo2= new Personaje(2,"M.Bison",empresa);
            BDD.enQueue(nuevo2);
            Personaje nuevo3= new Personaje(3,"Guile",empresa); 
            BDD.enQueue(nuevo3);
            Personaje nuevo4= new Personaje(4,"Zangief",empresa);
            BDD.enQueue(nuevo4);
            Personaje nuevo5= new Personaje(5,"Chun-Li",empresa);
            BDD.enQueue(nuevo5);
            Personaje nuevo6= new Personaje(6,"Akuma",empresa);
            BDD.enQueue(nuevo6);
            Personaje nuevo7= new Personaje(7,"Blanka",empresa);
            BDD.enQueue(nuevo7);
            Personaje nuevo8= new Personaje(8,"Dhalsim",empresa);
            BDD.enQueue(nuevo8);
            Personaje nuevo9= new Personaje(9,"Gouken",empresa);
            BDD.enQueue(nuevo9);
            Personaje nuevo10= new Personaje(10,"Q",empresa);
            BDD.enQueue(nuevo10);
            
            for (int i = 0; i < 9; i++) {
               
                if (BDD.items[i].getPriority()==4) {
                    cola1.enQueue(BDD.items[i]);
                }else if(BDD.items[i].getPriority()==3 ){
                    cola2.enQueue(BDD.items[i]);
                }else{
                    cola3.enQueue(BDD.items[i]);
                }
            }
            
        }
        
        
    }
    
    
    
 
    
}
