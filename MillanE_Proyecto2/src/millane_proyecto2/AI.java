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

/**
 *
 * @author enriq
 */
public class AI extends Thread{
    private int tiempoDeCombate;
    private Semaphore mutex;
    private Semaphore mutex2;
    private double winProbability;
    private double drawProbability;
    private double noCombatProbability;
    private int contadorC;
    private int cantidadCombates;
    private Personaje nintendoPersonaje;
    private Personaje capcomPersonaje;
    private String estadoCombate;
    private Personaje ganador;

    public AI(Semaphore mutex, Semaphore mutex2, int tiempoDeCombate) {
        this.mutex = mutex;
        this.mutex2 = mutex2;
        this.tiempoDeCombate = tiempoDeCombate;
        this.winProbability = Valores.winProbability;
        this.drawProbability = Valores.drawProbability;
        this.noCombatProbability = Valores.noCombatProbability;
        this.cantidadCombates = 0;
        this.nintendoPersonaje = null;
        this.capcomPersonaje = null;
        this.ganador = null;

    }
    
  
        
    public Personaje playRockPaperScissors(Personaje nintendo, Personaje capcom) {
        // Getting input from the user
        System.out.println("Make a move! (rock/paper/scissors)");
        JFrame frame = new JFrame();
        
        while (true){
        int result1 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Haz un movimiento!! (piedra(1)/papel(2)/tijeras(3)"));
        int result2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Haz un movimiento!! (piedra(1)/papel(2)/tijeras(3)"));
        



        // Print results
        if (result1 == result2) {
            JOptionPane.showMessageDialog(frame, "Es un empate, juega de nuevo!");
        } else if (playerWins(result1, result2)) {
            System.out.println("Nintendo gana!");
            return nintendo;

        } else {
            System.out.println("Capcom gana!");
            return capcom;

        }
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

//    @Override
//    public void run() {
//        while(true) {
//           
//            combat();
//        }
//    }
    
    
    
    public void combat(Personaje nintendo, Personaje capcom){
        if (nintendo != null && capcom != null) {
            try {
                sleep(1);
                mutex.release();
                this.setNintendoPersonaje(nintendo);
                this.setCapcomPersonaje(capcom);
                this.setEstadoCombate(Valores.decidingStatus);

                sleep((this.tiempoDeCombate * 1000) - 500) ;
                this.setEstadoCombate(Valores.announcingStatus);
                sleep(500); 
                double randomNum = Math.random();
                if (randomNum <= this.winProbability) {
                    Personaje winner = playRockPaperScissors(nintendo, capcom);
                    this.estadoCombate = Valores.win;
                    this.setGanador(winner);
                } else if (randomNum <= this.winProbability + this.getDrawProbability()) {
                    this.estadoCombate = Valores.draw;
                } else {
                    this.estadoCombate = Valores.noCombat;
                }
                this.cantidadCombates++;
                this.setEstadoCombate(Valores.waitingStatus);
                sleep(500); 
                mutex.acquire();

            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
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
    
}
