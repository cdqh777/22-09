
public class Libro {
	private String titulo;
	private int nroPag;
	
	public Libro(String titulo, int nroPag) {
		this.titulo = titulo;
		this.nroPag = nroPag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNroPag() {
		return nroPag;
	}

	public void setNroPag(int nroPag) {
		this.nroPag = nroPag;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", nroPag=" + nroPag + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
}
