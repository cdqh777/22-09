import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaCircularEst z = new ColaCircularEst();
		System.out.println(z.nroElem());
		
		Libro l1 = new Libro("php", 100);
		Libro l2 = new Libro("html", 50);
		Libro l3 = new Libro("java", 110);
		Libro l4 = new Libro("go", 30);
		Libro l5 = new Libro("JavaScript", 100);
		Libro l6 = new Libro("pyhton", 500);
		
		PilaLibro pl1 = new PilaLibro();
		pl1.adi(l1);
		pl1.adi(l2);
		pl1.adi(l3);
		
		PilaLibro pl2 = new PilaLibro();
		pl2.adi(l4);
		pl2.adi(l5);
		pl2.adi(l6);
		
		PilaLibro pl3 = new PilaLibro();
		pl3.adi(l1);
		pl3.adi(l3);
		pl3.adi(l5);
		
		Estudiante e1 = new Estudiante("Alan Brito", pl1);
		Estudiante e2 = new Estudiante("Esteban Dido", pl2);
		Estudiante e3 = new Estudiante("Isabel Patty", pl3);
		
		z.adi(e1);
		z.adi(e2);
		z.adi(e3);
		
		z.mostrar();
		
		//b)
		System.out.println("\n---------------");
		mostrarLibroEstduiante(z, l3);
		
		
//		z.llenar(10);
//		
//		z.adi(50);
//		z.adi(20);
//		z.adi(30);
//		z.adi(10);
//		z.adi(40);
//		
//		z.mostrar();
//		
//		System.out.println("\nNro de elementos: " + z.nroElem());
//		z.eli();
//		z.eli();
//		System.out.println("\nNro de elementos: " + z.nroElem());
//		z.mostrar();
//		
//
		
	}

	static void mostrarLibroEstduiante(ColaCircularEst z, Libro lib) {
		int ne= z.nroElem();
		for (int i = 1; i <= ne; i++) {
			Estudiante x = z.eli();
			if(buscarLibro(x,lib))
				System.out.println("nombre estudiante: " +x.getNom());
			z.adi(x);
		}
	}
	static boolean buscarLibro(Estudiante e, Libro lib) {
		PilaLibro aux = new PilaLibro();
		boolean sw = false;
		while(!e.getPl().esVacia()) {
			Libro x = e.getPl().eli();
			if(x.getTitulo().equals(lib.getTitulo()) && 
					x.getNroPag() == lib.getNroPag())
				sw = true;
			aux.adi(x);
		}
		e.getPl().vaciar(aux);
		return sw;
	}
}
