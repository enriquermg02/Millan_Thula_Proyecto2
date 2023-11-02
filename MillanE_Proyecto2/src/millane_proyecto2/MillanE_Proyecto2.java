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
        Random rand = new Random();
        
        int abilities = rand.nextInt(11);
     
      
//        
//        Personaje enrique= new Personaje(3,"Naruto");
//        Personaje mateo = new Personaje(4,"holi");
//        
        Interfaz inter= new Interfaz();
        inter.setVisible(true);
        Semaphore mutex1= new Semaphore(1);
       
//        Semaphore mutex2= new Semaphore(1);
//        Administrador admin= new Administrador(mutex1);
        AI ERMG= new AI(mutex1, 0);
//        ERMG.playRockPaperScissors(enrique, mateo);
//        admin.start();
        ERMG.start();
    }
    
}
