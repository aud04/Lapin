package Classe;

public class Lapinou {
	
	private Lapin maman;
	private int age;
	private String prenom;
	
	
	public Lapinou(Lapin maman, int age, String prenom) {
		super();
		this.maman = maman;
		this.age = age;
		this.prenom = prenom;
	}


	public Lapin getMaman() {
		return maman;
	}


	public void setMaman(Lapin maman) {
		this.maman = maman;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	


}
