import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EquipoA implements Iterable<String>{

	private List<String> jugadores;
	
	public EquipoA() {
		
		super();
		jugadores = new ArrayList<String>();
		
	}
	
	public List<String> getJugadores(){
		
		jugadores.add("Chiche Soñora");
		jugadores.add("Saturno");
		jugadores.add("Manteca Martinez");
		jugadores.add("Navarro Montoya");
		jugadores.add("Pico");
		
		return jugadores;
	}

	@Override
	public Iterator<String> iterator() {
		
		return new IteradorEquipoA(getJugadores());
	
	}
	
}
