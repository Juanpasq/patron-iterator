import java.util.Iterator;

public class IteradorEquipoB implements Iterator <String> {


		private int pos = 0;
		private String[] jugadores;
		
		public IteradorEquipoB (String[] jugadores) {
			
			super();
			this.jugadores = jugadores;
		}

		@Override
		public boolean hasNext() {
			return pos+1 <= jugadores.length && jugadores[pos] != null;
		}

		@Override
		public String next() {
			String jugador = jugadores[pos];
			pos++;
			return jugador;
		}
	
}
