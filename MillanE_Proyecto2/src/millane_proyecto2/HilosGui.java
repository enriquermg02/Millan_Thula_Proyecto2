/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

import javax.swing.JTextField;

/**
 *
 * @author enriq
 */
public class HilosGui extends Thread{
    
   
//     javax.swing.JTextField AreaTextoC2;
//     javax.swing.JTextField AreaTextoC3;
//     javax.swing.JTextField AreaTextoC4;
//     javax.swing.JTextField AreaTextoZ1;
//     javax.swing.JTextField AreaTextoZ2;
//     javax.swing.JTextField AreaTextoZ3;
//     javax.swing.JTextField AreaTextoZ4;
    Interfaz inter;
     Empresa Nintendo;
     Empresa Capcom;

    public HilosGui(Interfaz inter,Empresa Nintendo,Empresa Capcom) {
//        this.AreaTextoC1 = AreaTextoC1;
//        this.AreaTextoC2 = AreaTextoC2;
//        this.AreaTextoC3 = AreaTextoC3;
//        this.AreaTextoC4 = AreaTextoC4;
//        this.AreaTextoZ1 = AreaTextoZ1;
//        this.AreaTextoZ2 = AreaTextoZ2;
//        this.AreaTextoZ3 = AreaTextoZ3;
//        this.AreaTextoZ4 = AreaTextoZ4;
         this.inter=inter;
        this.Nintendo = Nintendo;
        this.Capcom = Capcom;
    }
    
    
    
    public void run(){
        while(true) {
           

            cola(Nintendo.getCola1(),inter.getAreaTextoZ1());
            cola(Nintendo.getCola2(),inter.getAreaTextoZ2());
            cola(Nintendo.getCola3(),inter.getAreaTextoZ3());
            cola(Nintendo.getCola4(),inter.getAreaTextoZ4());
             cola(Capcom.getCola1(),inter.getAreaTextoC1());
        cola(Capcom.getCola2(),inter.getAreaTextoC2());
        cola(Capcom.getCola3(),inter.getAreaTextoC3());
        cola(Capcom.getCola4(),inter.getAreaTextoC4());
        }
    }
    
    
    public void actu(){
        
//        
        
//        

      
//         AreaTextoC1.setText("erique millam");
//        
//        
        
        
        
        
    }
    
    public void cola(Queue cola,javax.swing.JTextArea AreaTexto){
     
        String prueba= "";
        
        if(cola.isEmpty()){
        
         AreaTexto.setText("");
        }else{
           
           
            AreaTexto.setText(cola.displayQueue());
            
        }
        
    }
    
}
