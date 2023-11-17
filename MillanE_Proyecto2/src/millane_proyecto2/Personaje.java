/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

import java.util.Random;

/**
 *
 * @author leste
 */
public class Personaje {
    private int idNumber;
    private int priority;  
    public int contador; //inanicion
    private String nameGames;  //nombre de juego 
    private String Nombre;
    private char idLetter;  //Id que se va a desplegar en la UI
    
    private boolean abilitiesQuality;
    private boolean hpQuality;
    private boolean forceQuality;
    private boolean agilityQuality;
    private int individualQualityCounter;
    
    private int randomNumber;
    private int designator;
    
    
    public Personaje(int counterPersonajes,String Nombre, String nameGames) {
        this.idNumber = counterPersonajes;
        this.Nombre=Nombre;
        this.idLetter = nameGames.charAt(0);
        this.priority = 0;
        this.contador = 0;
        this.abilitiesQuality = false;
        this.hpQuality = false;
        this.forceQuality = false;
        this.agilityQuality = false;
        this.individualQualityCounter = 0;
       
        designation();
    }
    
    
    
    
    
    public String getId() {
        String result = this.Nombre + (String.valueOf(this.idNumber));
        return result;
    }
    
    public void printPersonajeId() {
        System.out.println(this.getId());
    }

    /**
     * @return the idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * @return the nameGames
     */
    public String getNameGames() {
        return nameGames;
    }

    /**
     * @param nameGames the nameGames to set
     */
    public void setNameGames(String nameGames) {
        this.nameGames = nameGames;
    }

    /**
     * @return the idLetter
     */
    public char getIdLetter() {
        return idLetter;
    }

    /**
     * @param idLetter the idLetter to set
     */
    public void setIdLetter(char idLetter) {
        this.idLetter = idLetter;
    }

    /**
     * @return the abilitiesQuality
     */
    public boolean isAbilitiesQuality() {
        return abilitiesQuality;
    }

    /**
     * @param abilitiesQuality the abilitiesQuality to set
     */
    public void setAbilitiesQuality(boolean abilitiesQuality) {
        this.abilitiesQuality = abilitiesQuality;
    }

    /**
     * @return the hpQuality
     */
    public boolean isHpQuality() {
        return hpQuality;
    }

    /**
     * @param hpQuality the hpQuality to set
     */
    public void setHpQuality(boolean hpQuality) {
        this.hpQuality = hpQuality;
    }

    /**
     * @return the forceQuality
     */
    public boolean isForceQuality() {
        return forceQuality;
    }

    /**
     * @param forceQuality the forceQuality to set
     */
    public void setForceQuality(boolean forceQuality) {
        this.forceQuality = forceQuality;
    }

    /**
     * @return the agilityQuality
     */
    public boolean isAgilityQuality() {
        return agilityQuality;
    }

    /**
     * @param agilityQuality the agilityQuality to set
     */
    public void setAgilityQuality(boolean agilityQuality) {
        this.agilityQuality = agilityQuality;
    }

    /**
     * @return the individualQualityCounter
     */
    public int getIndividualQualityCounter() {
        return individualQualityCounter;
    }

    /**
     * @param individualQualityCounter the individualQualityCounter to set
     */
    public void setIndividualQualityCounter(int individualQualityCounter) {
        this.individualQualityCounter = individualQualityCounter;
    }

    /**
     * @return the randomNumber
     */
    public int getRandomNumber() {
        return randomNumber;
    }

    /**
     * @param randomNumber the randomNumber to set
     */
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDesignator() {
        return designator;
    }

    public void setDesignator(int designator) {
        this.designator = designator;
    }
  
    
    public void designation(){
        Random rand = new Random();
        
        int abilities = rand.nextInt(101);
        int hp = rand.nextInt(101);
        int force = rand.nextInt(101);
        int agility = rand.nextInt(101);
        
        
        if (abilities>=40){//6
            this.abilitiesQuality=true;
            priority++;
        }
        if (hp>=30){//7
            this.hpQuality=true;
            priority++;
        }
        if (force>=50){//5
            this.forceQuality=true;
            priority++;
        }
        if (agility>=60){//4
            this.agilityQuality=true;
            priority++;
        }
        
      
    }
    
    
    
    
    
    
}
