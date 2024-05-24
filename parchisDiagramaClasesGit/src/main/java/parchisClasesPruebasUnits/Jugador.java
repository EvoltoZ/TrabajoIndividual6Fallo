/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador {

	private String nombre;
	private Tablero tablero;
	private String color;
	
	public Jugador(String nombre, Tablero tablero, String color ) {
		
		this.nombre = nombre;
		this.tablero = tablero;
		
		this.color = color;
	}
	
	public void tirarDado(Dado d) {
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) {
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() {
		
		boolean[] casillas = tablero.consultarCasillas();
		
		int posicion = 0;
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) {
			
			if (casillas[i]==true) {
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public void moverFicha(int cs) {
		
		int origen = consultarTablero();
		tablero.cambiarFicha(origen, origen+cs);;
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
