package Classe;


/**
 * Write a description of class Cage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cage
{
    // instance variables - replace the example below with your own
    private Lapin lapin; //fleche unidirectionnel
    private int foin;

    /**
     * Constructor for objects of class Cage
     */
    public Cage(Lapin lapin, int foin)
    {
        // initialise instance variables
        this.lapin = lapin;
        this.foin = foin;
    }
public void setLapin (Lapin lapin){
        this.lapin = lapin;
    }
    public Lapin getLapin(){
    return lapin;
    }
    
    public void setFoin (int foin){
        this.foin = foin;
    }
    public int getFoin(){
    return foin;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void manger(int quantite)
    {
        // put your code here
        this.foin = this.foin - quantite;
        System.out.println (this.foin);
    }
}
