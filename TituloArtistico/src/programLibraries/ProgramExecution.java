package programLibraries;

import java.text.Normalizer;
import baseStructures.ASCIIAlphabet;

/**
 * Clase encargada de inicializar el {@link ASCIIAlphabet} con un fuente en especifica
 * y mandar el la cadena con el texto que queremos convertir.
 * @author J-Xander
 * @version 1.0.0
 * @since 24/02/22
 * @date 24/02/27
 */
public class ProgramExecution {

	private StringBuilder txt;
	public ASCIIAlphabet abc;

	//--------------- Constructor ------------
	public ProgramExecution(String proyecName, ListAlphabets opcion) {
		abc = opcion.getAbecedario();
		txt = abc.sortASCIISrrays(proyecName);
	}

	/**
	 * Devuelve Una cadena con el TextoASCII.
	 */
	@Override
	public String toString() {
		return txt.toString();
	}
	

	/*
	 * Elimina los acentos de una cadena de texto.
	 */
	public static String quitarAcentos(String input) {
		return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}
	
	// ----------------- MAIN --------------------
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("No se a resivido ningun parametro\n");
			System.exit(0);
		}

		ProgramExecution readme;

		args[0] = quitarAcentos(args[0]);

		if (args.length == 1) {
			readme = new ProgramExecution(args[0].toUpperCase(), ListAlphabets.A3D);
		} else {
			switch (args[1]) {
			case "2": {
				readme = new ProgramExecution(args[0].toUpperCase(), ListAlphabets.A2D);
				break;
			}
			case "3": {
				readme = new ProgramExecution(args[0], ListAlphabets.CARTY);
				break;
			}
			default:
				readme = new ProgramExecution(args[0].toUpperCase(), ListAlphabets.A3D);
			}
		}
		System.out.println(readme);
	}
}