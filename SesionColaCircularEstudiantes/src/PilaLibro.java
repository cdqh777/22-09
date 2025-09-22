
public class PilaLibro extends VectorLibro{
	private int tope;
	
	public PilaLibro() {
		tope = -1;
	}
	public boolean esVacia() {
		if(tope == -1)
			return true;
		return false;
	}
	public boolean esLlena() {
		if(tope == MAX-1)
			return true;
		return false;
	}
	public void adi(Libro z) {
		if(!esLlena()) {
			tope++;
			v[tope] = z;
		}else
			System.out.println("Pila llena");
	}
	public Libro eli() {
		Libro x;
		if(!esVacia()) {
			x = v[tope];
			tope--;
			return x;
		}else {
			System.out.println("Pila Vacia");
			return null;
		}
	}
	public void mostrar() {
		PilaLibro aux = new PilaLibro();
		while(!esVacia()) {
			Libro x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
	public void vaciar(PilaLibro aux) {
		while(!aux.esVacia())
			adi(aux.eli());
	}
}
