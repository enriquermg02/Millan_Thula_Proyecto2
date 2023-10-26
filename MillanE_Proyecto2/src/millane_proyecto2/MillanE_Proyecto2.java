/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millane_proyecto2;

import java.util.Random;

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
        System.out.println(abilities);
        
        
        Personaje enrique= new Personaje(3,"Naruto");
        
        System.out.println(enrique.isAbilitiesQuality());
        System.out.println(enrique.isHpQuality());
    }
    
}
