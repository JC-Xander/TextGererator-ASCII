package baseStructures;
/**
 * Clase para indicar una excepción al no encontrar un caracter en el abecedario
 */
public class ASCIICharacterNotFound extends Exception {
	private static final long serialVersionUID = 1L;

	public ASCIICharacterNotFound(String Message) {
		super(Message);
	}
}
