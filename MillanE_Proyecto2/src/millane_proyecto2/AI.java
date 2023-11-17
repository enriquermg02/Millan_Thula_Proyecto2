/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


/**
 *
 * @author enriq
 */
public class AI extends Thread{
    private int tiempoDeCombate;
    private Semaphore mutex;
    public String status;
    private double winProbability;
    private double drawProbability;
    private double noCombatProbability;
    private int contadorC;
    public int cantidadCombates;
    public Personaje nintendoPersonaje;
    public Personaje capcomPersonaje;
    public String estadoCombate;
    public Personaje ganador;
    public Empresa capcom;
    public Empresa nintendo;
    public Minijuego mini;
    public int cont;
    public int una;
    public int winN;
    public int winC;
    
    public AI(Semaphore mutex,  int tiempoDeCombate, Empresa nintendo, Empresa capcom, Minijuego mini) {
        this.mutex = mutex;
        this.nintendo = nintendo;
        this.capcom = capcom;
        this.status = Valores.waitingStatus;
        this.tiempoDeCombate = tiempoDeCombate;
        this.winProbability = Valores.winProbability;
        this.drawProbability = Valores.drawProbability;
        this.noCombatProbability = Valores.noCombatProbability;
        this.cantidadCombates = 0;
        this.nintendoPersonaje = null;
        this.capcomPersonaje = null;
        this.ganador = null;
        this.mini = mini;
        this.cont=0;
        this.una=0;
        this.winN = 0;
        this.winC = 0;

    }
    
  
        
    public Personaje playRockPaperScissors(Personaje nin, Personaje cap) {
        // Getting input from the user
        JFrame frame = new JFrame();
        this.mini.setVisible(true);
        
        while (true){
                        waitTime();
        int result1 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Nintendo, haz un movimiento!! (piedra(1)/papel(2)/tijeras(3)"));
        int result2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Capcom, haz un movimiento!! (piedra(1)/papel(2)/tijeras(3)"));
        



        // Print results
        if (result1 == result2) {
            detImage(result1, this.mini.derecho);
            detImage(result2, this.mini.izquierdo);
            JOptionPane.showMessageDialog(frame, "Es un empate, juega de nuevo!");  
            
        } else if (playerWins(result1, result2)) {
            detImage(result1, this.mini.derecho);
            detImage(result2, this.mini.izquierdo);
            waitTime();
            JOptionPane.showMessageDialog(frame, "Nintendo Gana!");
            this.winN++;
            this.mini.setVisible(false);
            return nin;

        } else {
            detImage(result1, this.mini.derecho);
            detImage(result2, this.mini.izquierdo);
            waitTime();
            JOptionPane.showMessageDialog(frame, "Capcom Gana!");  
            this.winC++;
            this.mini.setVisible(false);
            return cap;

        }
        }

    }
    public void waitTime(){
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void detImage(int result, javax.swing.JLabel label){
        ImageIcon rockIcon = new ImageIcon(getClass().getResource("/assets/rock.gif"));
        ImageIcon paperIcon = new ImageIcon(getClass().getResource("/assets/paper (1).jpg"));
        ImageIcon scissorIcon = new ImageIcon(getClass().getResource("/assets/scissor (1).jpg"));

        if (result == 1) 
        {
            label.setIcon(rockIcon);
        }
        else if(result == 2){
            label.setIcon(paperIcon);
        }
        else
        {
            label.setIcon(scissorIcon);
        }

    }

    static boolean playerWins(int result1, int result2) {
        if (result1 == 1) {
            return result2 == 3;
        } else if (result1 == 2) {
            return result2 ==1;
        } else {
            return result2==2;
        }
    }
    
    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
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
           
            combat(this.nintendoPersonaje, this.capcomPersonaje);
        }
    }
    
    
    
    public void combat(Personaje nin, Personaje cap){
        if (nintendo != null && capcom != null) {
            try {
                sleep(1);
                mutex.release();
                this.setNintendoPersonaje(nin);
                this.setCapcomPersonaje(cap);
                this.setStatus(Valores.decidingStatus);

                sleep((this.tiempoDeCombate * 1000) - 500) ;
                this.setStatus(Valores.announcingStatus);
                sleep(500); 
                double randomNum = Math.random();
                if (randomNum <= this.winProbability) {
                    Personaje winner = playRockPaperScissors(nin, cap);
                    this.estadoCombate = Valores.win;
                    this.setGanador(winner);
                } else if (randomNum <= this.winProbability + this.getDrawProbability()) {
                    this.estadoCombate = Valores.draw;
                } else {
                    this.estadoCombate = Valores.noCombat;
                }
                this.cantidadCombates++;
                System.out.println(cantidadCombates);
                colasSumar();
                this.setStatus(Valores.waitingStatus);
                cont++;
                una=1;
                System.out.println(cont);
                sleep(500); 
                mutex.acquire();

            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
    }

    public void colasSumar(){
        nintendo.getCola2().sumar();
        nintendo.getCola3().sumar();
        capcom.getCola2().sumar();
        capcom.getCola3().sumar();
                
    }
    
    /**
     * @return the tiempoDeCombate
     */
    public int getTiempoDeCombate() {
        return tiempoDeCombate;
    }

    /**
     * @param tiempoDeCombate the tiempoDeCombate to set
     */
    public void setTiempoDeCombate(int tiempoDeCombate) {
        this.tiempoDeCombate = tiempoDeCombate;
    }

    /**
     * @return the winProbability
     */
    public double getWinProbability() {
        return winProbability;
    }

    /**
     * @param winProbability the winProbability to set
     */
    public void setWinProbability(double winProbability) {
        this.winProbability = winProbability;
    }

    /**
     * @return the drawProbability
     */
    public double getDrawProbability() {
        return drawProbability;
    }

    /**
     * @param drawProbability the drawProbability to set
     */
    public void setDrawProbability(double drawProbability) {
        this.drawProbability = drawProbability;
    }

    /**
     * @return the noCombatProbability
     */
    public double getNoCombatProbability() {
        return noCombatProbability;
    }

    /**
     * @param noCombatProbability the noCombatProbability to set
     */
    public void setNoCombatProbability(double noCombatProbability) {
        this.noCombatProbability = noCombatProbability;
    }

    /**
     * @return the cantidadCombates
     */
    public int getCantidadCombates() {
        return cantidadCombates;
    }

    /**
     * @param cantidadCombates the cantidadCombates to set
     */
    public void setCantidadCombates(int cantidadCombates) {
        this.cantidadCombates = cantidadCombates;
    }

    /**
     * @return the nintendoPersonaje
     */
    public Personaje getNintendoPersonaje() {
        return nintendoPersonaje;
    }

    /**
     * @param nintendoPersonaje the nintendoPersonaje to set
     */
    public void setNintendoPersonaje(Personaje nintendoPersonaje) {
        this.nintendoPersonaje = nintendoPersonaje;
    }

    /**
     * @return the capcomPersonaje
     */
    public Personaje getCapcomPersonaje() {
        return capcomPersonaje;
    }

    /**
     * @param capcomPersonaje the capcomPersonaje to set
     */
    public void setCapcomPersonaje(Personaje capcomPersonaje) {
        this.capcomPersonaje = capcomPersonaje;
    }

    /**
     * @return the estadoCmbate
     */
    public String getEstadoCombate() {
        return estadoCombate;
    }

    /**
     * @param estadoCombate the estadoCombate to set
     */
    public void setEstadoCombate(String estadoCombate) {
        this.estadoCombate = estadoCombate;
    }

    /**
     * @return the ganador
     */
    public Personaje getGanador() {
        return ganador;
    }

    /**
     * @param ganador the ganador to set
     */
    public void setGanador(Personaje ganador) {
        this.ganador = ganador;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
