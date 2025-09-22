
public class Estudiante {
	private String nom;
	private PilaLibro pl;
	
	public Estudiante(String nom, PilaLibro pl) {
		this.nom = nom;
		this.pl = pl;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public PilaLibro getPl() {
		return pl;
	}

	public void setPl(PilaLibro pl) {
		this.pl = pl;
	}

	@Override
	public String toString() {
		return "Estudiante [nom=" + nom + "]";
	}

	public void mostrar() {
		System.out.println("\n" + toString());
		pl.mostrar();
	}
	
	
}
