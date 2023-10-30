/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enriq
 */
public class AI extends Thread{

    
    private Semaphore mutex;
    private Semaphore mutex2;
    private int contadorC;

    public AI(Semaphore mutex, Semaphore mutex2, int contadorC) {
        this.mutex = mutex;
        this.mutex2 = mutex2;
        this.contadorC = contadorC;
    }
    
    
    
    
    
    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Semaphore getMutex2() {
        return mutex2;
    }

    public void setMutex2(Semaphore mutex2) {
        this.mutex2 = mutex2;
    }

    public int getContadorC() {
        return contadorC;
    }

    //SO PRIMERO
    public void setContadorC(int contadorC) {
        this.contadorC = contadorC;
    }

    @Override
    public void run() {
        while(true) {
           
            combat();
        }
    }
    
    
    
    public void combat(){
        try {
            sleep(1);
            mutex.release();
            
            //hola
            System.out.println("2");
            System.out.println("otra vaina ");
            System.out.println("agarro el que me dio el otro loco");
            mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
