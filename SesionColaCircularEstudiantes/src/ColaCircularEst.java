import java.util.Scanner;

public class ColaCircularEst extends ColaEst{
	public ColaCircularEst() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(Estudiante elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Estudiante eli() {
		Estudiante elem;
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
			return elem;
		}else {
			System.out.println("Cola circular vacia!!");
			return null;
		}
	}
	
	public void vaciar(ColaCircularEst z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Intr. numero entero");
//			int elem = lee.nextInt();
//			adi(elem);
//		}
//	}
	public void mostrar() {
		ColaCircularEst aux = new ColaCircularEst();
		while(!esVacia()) {
			Estudiante elem = eli();
			//System.out.print("");
			elem.mostrar();
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
