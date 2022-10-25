import java.util.Iterator;

public class Seleccionador {

	public static void main(String[] args) {
		EquipoA equipoA = new EquipoA();
		EquipoB equipoB = new EquipoB();
		
		seleccionar(equipoA.iterator());
		seleccionar(equipoB.iterator());
	}

	private static void seleccionar(Iterator<String> iterator) {
		
		System.out.println(" ----------- ");
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		System.out.println(" ----------- ");
		
	}

}
