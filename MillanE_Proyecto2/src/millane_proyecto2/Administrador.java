/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;


/**
 *
 * @author enriq
 */
public class Administrador extends Thread  {
    
    
    
    private Semaphore mutex;
    
    private Personaje personaje1;
    private Personaje personaje2;
    public AI inteligencia;
    private Empresa nintendo;
    private Empresa capcom;
    private int colaP1;
    private int colaP2;

    public Administrador(Semaphore mutex,Empresa nintendo,Empresa capcom, AI inteligencia) {
        this.mutex = mutex;
        this.inteligencia = inteligencia;
        this.nintendo = nintendo;
        this.capcom = capcom;
        this.colaP1=0;
        this.colaP2=0;
        
    }

    public int getColaP1() {
        return colaP1;
    }

    public void setColaP1(int colaP1) {
        this.colaP1 = colaP1;
    }

    public int getColaP2() {
        return colaP2;
    }

    public void setColaP2(int colaP2) {
        this.colaP2 = colaP2;
    }

    
    
    
    
    
    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }

    public Empresa getNintendo() {
        return nintendo;
    }

    public void setNintendo(Empresa nintendo) {
        this.nintendo = nintendo;
    }

    public Empresa getCapcom() {
        return capcom;
    }

    public void setCapcom(Empresa capcom) {
        this.capcom = capcom;
    }
    
    
    public void run(){
       hola();
    }
    
   public void hola(){
       
       while(true){
           
      
        try {
            mutex.acquire();
            
           escoger(nintendo,capcom);
           colas();
           crear();
           
            //CREAR NUEVO PERSONAJE
            
            
            mutex.release();
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
       
   }
   
   
   
   public void escoger(Empresa nintendo, Empresa capcom){
       //NINTENDO
      
       if (nintendo.getCola1().isEmpty()){
               if (nintendo.getCola2().isEmpty()){
                   if (nintendo.getCola3().isEmpty()){
                       if (nintendo.getCola4().isEmpty()){
               
            }else{
                this.inteligencia.nintendoPersonaje=nintendo.getCola4().owo();
                personaje1=nintendo.getCola4().owo();
                this.colaP1=4;
            }
            }else{
                this.inteligencia.nintendoPersonaje=nintendo.getCola3().owo();
                personaje1=nintendo.getCola3().owo();
                this.colaP1=3;
            }
            }else{
                this.inteligencia.nintendoPersonaje=nintendo.getCola2().owo();
                personaje1=nintendo.getCola2().owo();
                this.colaP1=2;
            }
            }else{
                this.inteligencia.nintendoPersonaje=nintendo.getCola1().owo();
                personaje1=nintendo.getCola1().owo();
                this.colaP1=1;
            }
       
            
            
            
            //Capcom
            if (capcom.getCola1().isEmpty()){
               
               if (capcom.getCola2().isEmpty()){
                   if (capcom.getCola3().isEmpty()){
                       if (capcom.getCola4().isEmpty()){
               
            }else{
                this.inteligencia.capcomPersonaje=capcom.getCola4().owo();
                personaje2=capcom.getCola4().owo();
                this.colaP2=4;
            }
            }else{
                this.inteligencia.capcomPersonaje=capcom.getCola3().owo();
                personaje2=capcom.getCola3().owo();
                this.colaP2=3;
            }
            }else{
                this.inteligencia.capcomPersonaje=capcom.getCola2().owo();
                personaje2=capcom.getCola2().owo();
                this.colaP2=2;
            }
            }else{
                this.inteligencia.capcomPersonaje=capcom.getCola1().owo();
                personaje2=capcom.getCola1().owo();
                this.colaP2=1;
            }
            
            
            
            
   }
    
    public void crear(){
                Random rand = new Random();

        int num=rand.nextInt(11);
        if(inteligencia.cont==2){
            
            inteligencia.cont=0;
            if(num>2){
                System.out.println("porfin");
                Personaje NIN=nintendo.getBDD().deQueue();
                Personaje CAP=capcom.getBDD().deQueue();
                nintendo.getBDD().enQueue(NIN);
                capcom.getBDD().enQueue(CAP);
                
                Personaje nuevoN= new Personaje(NIN.getIdNumber(),NIN.getNombre(),"Nintendo");
                Personaje nuevoC= new Personaje(CAP.getIdNumber(),CAP.getNombre(),"Capcom");
                
                if (nuevoN.getDesignator()==4) {
                    nintendo.getCola1().enQueue(nuevoN);
                }else if(nuevoN.getDesignator()==3 ){
                    nintendo.getCola2().enQueue(nuevoN);
                }else{
                    nintendo.getCola3().enQueue(nuevoN);
                }
                
                
                if (nuevoC.getDesignator()==4) {
                    capcom.getCola1().enQueue(nuevoC);
                }else if(nuevoC.getDesignator()==3 ){
                    capcom.getCola2().enQueue(nuevoC);
                }else{
                    capcom.getCola3().enQueue(nuevoC);
                }
        }
       
    }
    }
    
    
    public void colas(){
        if(inteligencia.una==1){
        if ("Empate".equals(this.inteligencia.estadoCombate)) {
            System.out.println("empate");
            if (colaP1==1){
                Personaje personajea=nintendo.getCola1().deQueue();
                nintendo.getCola1().enQueue(personajea);
            }else if(colaP1==2){
                Personaje personajea=nintendo.getCola2().deQueue();
                nintendo.getCola2().enQueue(personajea);
            }else if(colaP1==3){
                Personaje personajea=nintendo.getCola3().deQueue();
                nintendo.getCola3().enQueue(personajea);
            }
            
            if (colaP2==1){
                Personaje personajea=capcom.getCola1().deQueue();
                capcom.getCola1().enQueue(personajea);
            }else if(colaP2==2){
                Personaje personajea=capcom.getCola2().deQueue();
                capcom.getCola2().enQueue(personajea);
            }else if(colaP2==3){
                Personaje personajea=capcom.getCola3().deQueue();
                capcom.getCola3().enQueue(personajea);
            }
            
        }else if("Ganador".equals(this.inteligencia.estadoCombate)) {
            
            
            Personaje hola= inteligencia.getGanador();
            
            
            if (colaP1==1){
                nintendo.getCola1().deQueue();
                
            }else if(colaP1==2){
               nintendo.getCola2().deQueue();
                
            }else if(colaP1==3){
              nintendo.getCola3().deQueue();
           
            }
            
            if (colaP2==1){
                capcom.getCola1().deQueue();
               
            }else if(colaP2==2){
            capcom.getCola2().deQueue();
               
            }else if(colaP2==3){
               capcom.getCola3().deQueue();
               
            }
            
            
//            if(hola.getNameGames()=="Nintendo"){
//                nintendo.getGanadores().enQueue(hola);
//            }else{
//                capcom.getGanadores().enQueue(hola);
//            }d
            
        }else{
            System.out.println("refuerzo");
            if (colaP1==1){
                Personaje personajea=nintendo.getCola1().deQueue();
                nintendo.getCola4().enQueue(personajea);
            }else if(colaP1==2){
                Personaje personajea=nintendo.getCola2().deQueue();
                nintendo.getCola4().enQueue(personajea);
            }else if(colaP1==3){
                Personaje personajea=nintendo.getCola3().deQueue();
                nintendo.getCola4().enQueue(personajea);
            }else{
                Personaje personajea=nintendo.getCola4().deQueue();
                nintendo.getCola4().enQueue(personajea);
            }
            
            if (colaP2==1){
                Personaje personajea=capcom.getCola1().deQueue();
                capcom.getCola4().enQueue(personajea);
            }else if(colaP2==2){
                Personaje personajea=capcom.getCola2().deQueue();
                capcom.getCola4().enQueue(personajea);
            }else if(colaP2==3){
                Personaje personajea=capcom.getCola3().deQueue();
                capcom.getCola4().enQueue(personajea);
            }else{
                Personaje personajea=capcom.getCola4().deQueue();
                capcom.getCola4().enQueue(personajea);
                    
                    }
            
            
        }
        
        //refuerzo
        
        
        refuerzo();
        
        inteligencia.una=0;
        }
    
}
    
      public void refuerzo(){
            
        Random rand = new Random();
        
        int num=rand.nextInt(11);
        if(num>6){
            System.out.println("REFUERZO");
            
            if(!nintendo.getCola4().isEmpty()){
                System.out.println("nintendo");
               Personaje refuerzo1 = nintendo.getCola4().deQueue();
               nintendo.getCola1().enQueue(refuerzo1);
            }
            
            if(!capcom.getCola4().isEmpty()){
                System.out.println("capcpm");
               Personaje refuerzo2 = capcom.getCola4().deQueue();
               capcom.getCola1().enQueue(refuerzo2);
            }
            
        }
            
    
}
  
}
