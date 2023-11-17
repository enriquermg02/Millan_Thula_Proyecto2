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
    

    Interfaz inter;
     Empresa Nintendo;
     Empresa Capcom;
     AI inteligencia;

    public HilosGui(Interfaz inter,Empresa Nintendo,Empresa Capcom, AI inteligencia) {
         this.inter=inter;
        this.Nintendo = Nintendo;
        this.Capcom = Capcom;
        this.inteligencia = inteligencia;
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
            
            inter.estado.setText(inteligencia.status);
            if (inteligencia.ganador == null) {
            }
            else{
                inter.resultado.setText(inteligencia.ganador.getId());
            }
            inter.rondas.setText(String.valueOf(inteligencia.cantidadCombates));
            inter.ganadasN.setText(String.valueOf(inteligencia.winN));
            inter.ganadasC.setText(String.valueOf(inteligencia.winC));
            inter.idN.setText(inteligencia.nintendoPersonaje.getNombre());
            inter.idC.setText(inteligencia.capcomPersonaje.getNombre());
            updateTime();
            
        }
    }
    
    
    public void updateTime() {
        int timeToProcess = (Integer)inter.tiempo.getValue();
        this.inteligencia.setTiempoDeCombate(timeToProcess);
    }
    
    public void cola(Queue cola,javax.swing.JTextArea AreaTexto){
     
        
        if(cola.isEmpty()){
        
         AreaTexto.setText("");
        }else{
           
           
            AreaTexto.setText(cola.displayQueue());
            
        }
        
    }
    
    
}
