import java.util.Iterator;

public class EquipoB implements Iterable<String> {
	
	private String[] jugadores;
	
	public EquipoB() {
		
		super();
		jugadores = new String[5];
		
	}
	
	public String[] getJugadores() {
		
		jugadores[0] = "Medina Bello";
		jugadores[1] = "Enzo Francescoli";
		jugadores[2] = "Saviola";
		jugadores[3] = "Berti";
		jugadores[4] = "Hernan Diaz";
		
		return jugadores;
	}

	@Override
	public Iterator<String> iterator() {
		return new IteradorEquipoB(getJugadores());
	}
}
