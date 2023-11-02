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
    
     javax.swing.JTextField AreaTextoC1;
     javax.swing.JTextField AreaTextoC2;
     javax.swing.JTextField AreaTextoC3;
     javax.swing.JTextField AreaTextoC4;
     javax.swing.JTextField AreaTextoZ1;
     javax.swing.JTextField AreaTextoZ2;
     javax.swing.JTextField AreaTextoZ3;
     javax.swing.JTextField AreaTextoZ4;
     Empresa Nintendo;
     Empresa Capcom;

    public HilosGui(JTextField AreaTextoC1,Empresa Nintendo,Empresa Capcom) {
        this.AreaTextoC1 = AreaTextoC1;
        this.AreaTextoC2 = AreaTextoC2;
        this.AreaTextoC3 = AreaTextoC3;
        this.AreaTextoC4 = AreaTextoC4;
        this.AreaTextoZ1 = AreaTextoZ1;
        this.AreaTextoZ2 = AreaTextoZ2;
        this.AreaTextoZ3 = AreaTextoZ3;
        this.AreaTextoZ4 = AreaTextoZ4;
        this.Nintendo = Nintendo;
        this.Capcom = Capcom;
    }
    
    
    
    public void run(){
        while(true) {
          AreaTextoC1.setText("erique millam");
//           actu();
//       
        }
    }
    
    
    public void actu(){
        
//        
//        cola(Nintendo.getCola1(),AreaTextoC1);
//        cola(Nintendo.getCola2(),AreaTextoC2);
//        cola(Nintendo.getCola3(),AreaTextoC3);
//        cola(Nintendo.getCola4(),AreaTextoC4);
//        cola(Capcom.getCola1(),AreaTextoZ1);
//        cola(Capcom.getCola2(),AreaTextoZ2);
//        cola(Capcom.getCola3(),AreaTextoZ3);
//        cola(Capcom.getCola4(),AreaTextoZ4);
      
//         AreaTextoC1.setText("erique millam");
//        
//        
        
        
        
        
    }
    
    public void cola(Queue cola,javax.swing.JTextField AreaTexto){
     
        String prueba= "";
        
        if(cola.isEmpty()){
//            AreaTexto.setText("erique millam");
         
        }else{
            System.out.println("rafael");
//            for (int i = 0; i < 3; i++) {       
//                System.out.println("uwu");
//                if (cola.getItems()[i]!=null) {
//                    System.out.println("no null");
////                    
////                    prueba+=cola.getItems()[i].getNombre();
////                    prueba+=" ";
//                    
//                }else{
//                    System.out.println("null");
//                }
//            }
            AreaTexto.setText("erique millam");
            
        }
        
    }
    
}
