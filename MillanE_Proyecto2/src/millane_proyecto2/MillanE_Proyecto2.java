/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millane_proyecto2;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author enriq
 */
public class MillanE_Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
         Semaphore mutex= new Semaphore(1);
        Empresa Nintendo= new Empresa();
        
        Empresa Capcom= new Empresa();
        Minijuego mini = new Minijuego();
        Nintendo.llenarBDD("Nintendo");
        Capcom.llenarBDD("Capcom");
        AI inteligencia = new AI(mutex, 1, Nintendo, Capcom, mini );
        Administrador admin= new Administrador(mutex,Nintendo,Capcom,inteligencia);
        Interfaz inter= new Interfaz(Nintendo,Capcom,mutex,admin);
        inter.setVisible(true);   
        admin.start();
        inteligencia.start();
       
        HilosGui gui= new HilosGui(inter,Nintendo, Capcom, inteligencia);
        gui.start();
        
         
         
    }
    
}
