import java.util.Iterator;
import java.util.List;

//ITERADOR CONCRETO >> INTERFAZ ITERATOR
public class IteradorEquipoA implements Iterator<String> {

	private int pos = 0;
	private List<String> jugadores;
	
	public IteradorEquipoA (List<String> jugadores) {
		
		super();
		this.jugadores = jugadores;
	}

	@Override
	public boolean hasNext() {
		
		return pos+1 <= jugadores.size();
		
	}

	@Override
	public String next() {
		
		String jugador = jugadores.get(pos);
		pos++;
		
		return jugador;
	}	
		
	
}
