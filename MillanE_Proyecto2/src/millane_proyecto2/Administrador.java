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
    
    private Empresa nintendo;
    private Empresa capcom;

    public Administrador(Semaphore mutex,Empresa nintendo,Empresa capcom) {
        this.mutex = mutex;
        
        this.nintendo = nintendo;
        this.capcom = capcom;
        
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
       
       
        try {
            mutex.acquire();
            
            escoger(nintendo,capcom);
           
            //CREAR NUEVO PERSONAJE
            
            
            mutex.release();
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   
   
   
   public void escoger(Empresa nintendo, Empresa capcom){
       //NINTENDO
      
       if (nintendo.getCola1().isEmpty()){
               if (nintendo.getCola2().isEmpty()){
                   if (nintendo.getCola3().isEmpty()){
                       if (nintendo.getCola4().isEmpty()){
               
            }else{
                personaje1=nintendo.getCola4().owo();
            }
            }else{
                personaje1=nintendo.getCola3().owo();
            }
            }else{
                personaje1=nintendo.getCola2().owo();
            }
            }else{
                personaje1=nintendo.getCola1().owo();
            }
            
            
            //Capcom
            if (capcom.getCola1().isEmpty()){
               
               if (capcom.getCola2().isEmpty()){
                   if (capcom.getCola3().isEmpty()){
                       if (capcom.getCola4().isEmpty()){
               
            }else{
                personaje2=capcom.getCola4().owo();
            }
            }else{
                personaje2=capcom.getCola3().owo();
            }
            }else{
                personaje2=capcom.getCola2().owo();
            }
            }else{
                personaje2=capcom.getCola1().owo();
            }
   }
    
    public void crear(){
                Random rand = new Random();

        int num=rand.nextInt(11);
    }
    
}
