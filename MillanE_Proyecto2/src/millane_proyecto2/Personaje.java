/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package millane_proyecto2;

/**
 *
 * @author leste
 */
public class Personaje {
    private int idNumber;
    private int priority;  
    private int contador; //inanicion
    private String nameGames;  //nombre de juego mamaguevo millan
    private char idLetter;  //Id que se va a desplegar en la UI
    
    private boolean abilitiesQuality;
    private boolean hpQuality;
    private boolean forceQuality;
    private boolean agilityQuality;
    private int individualQualityCounter;
    
    private int randomNumber;
    
    public Personaje(int counterPersonajes, String nameGames) {
        this.idNumber = counterPersonajes;
        this.idLetter = nameGames.charAt(0);
        this.priority = 0;
        this.contador = 0;
        this.abilitiesQuality = false;
        this.hpQuality = false;
        this.forceQuality = false;
        this.agilityQuality = false;
        this.individualQualityCounter = 0;
        
    }
    
    public String getId() {
        String result = this.idLetter + (String.valueOf(this.idNumber));
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
}
