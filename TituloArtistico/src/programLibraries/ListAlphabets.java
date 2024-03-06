package programLibraries;

import baseStructures.ASCIIAlphabet;
import listAlphabetASCII.*;

/**
 * Permite inicializar un tipo de abecedario mediante el enum creado.
 * 
 * @version 1.0.0
 * @author JC-Xander
 * @since 2024/02/10
 * @date 2024/02/20
 */
enum ListAlphabets{
	A3D(new Ascii3D()),   // Abecedario con estilo 3D.
	A2D(new Ascii2D()),   // Abecedario con estilo 2D.
	CARTY(new Carty());   // Sbecedario con estilo Carty.
	
	private final ASCIIAlphabet abc;
	
	ListAlphabets(Ascii3D ascii3d) {
		 this.abc = ascii3d;
	}

	ListAlphabets(Ascii2D ascii2d) {
		this.abc = ascii2d;
	}

	private ListAlphabets(Carty carty) {
		this.abc = carty;
	}
	
	public ASCIIAlphabet getAbecedario() {
		return this.abc;
	}
}
