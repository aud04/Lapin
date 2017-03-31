package Classe;

import java.util.ArrayList;
import java.util.List;


/**
 * Write a description of class Lapin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lapin
{
  private int age;
  private String nom;
  private ArrayList<Lapin> portee;

    /**
     * Constructor for objects of class Lapin
     */
    public Lapin(int age, String nom)
    {
        // initialise instance variables
       this.age = age;
       this.nom = nom;
       this.portee = new ArrayList<>();
    }
    
    public Lapin()
    {
        // initialise instance variables
       this.age = 0;

    }
    
    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
    return age;
    }

    public void setNom (String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String typeAge()
    {
        if (this.age > 1){
            return this.nom + " est un adulte";
     }
    else {
        return this.nom + " est un enfant";
     }
    }
    
    
	public ArrayList<Lapin> getPortee() {
		return portee;
	}

	public void setPortee(ArrayList<Lapin> portee) {
		this.portee = portee;
	}

	public void unePortee (int nbBebe){
		
		for(int i=0;i<nbBebe;i++) {
			this.portee.add(new Lapin());
		}
	}
}