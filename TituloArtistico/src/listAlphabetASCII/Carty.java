package listAlphabetASCII;

import baseStructures.ASCIICharacter;
import baseStructures.ASCIICharacterNotFound;
import baseStructures.ASCIIAlphabet;

/**
 * Abecedario con el stylo Carty modelos ASCII optenidos de
 * https://fsymbols.com/es/generadores/carty
 * 
 * @author j-Xander
 * @version 1.0.0
 * @since 2024/02/24
 * @date 2024/02/23
 */
public class Carty extends ASCIIAlphabet {

	// -------------- Constructor ------------
	/**
	 * Inicializa todos los caracteres con el stilo ASCII Carty ordenados de formas
	 * ascedente segun el valor numerico de cada char en el codigo ASCII.
	 */
	public Carty() {
		this.ASCIIAlphabet = new ASCIICharacter[67];
		this.numberOfRows = 8;

		this.ASCIIAlphabet[0] = new ASCIICharacter('-', """
				░░░░
				░░░░
				░░░░
				╔══╗
				╚══╝
				░░░░
				░░░░
				░░░░""");

		this.ASCIIAlphabet[1] = new ASCIICharacter('.', """
				░░
				░░
				░░
				░░
				░░
				░░
				╔╗
				╚╝""");

		this.ASCIIAlphabet[2] = new ASCIICharacter('0', """
				╔═══╗
				║╔═╗║
				║║║║║
				║║║║║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[3] = new ASCIICharacter('1', """
				░╔╗░
				╔╝║░
				╚╗║░
				░║║░
				╔╝╚╗
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[4] = new ASCIICharacter('2', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				╔═╝╔╝
				║║╚═╗
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[5] = new ASCIICharacter('3', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				╔╗╚╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[6] = new ASCIICharacter('4', """
				╔╗─╔╗
				║║─║║
				║╚═╝║
				╚══╗║
				░░░║║
				░░░╚╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[7] = new ASCIICharacter('5', """
				╔═══╗
				║╔══╝
				║╚══╗
				╚══╗║
				╔══╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[8] = new ASCIICharacter('6', """
				╔═══╗
				║╔══╝
				║╚══╗
				║╔═╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[9] = new ASCIICharacter('7', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				░░║╔╝
				░░║║░
				░░╚╝░
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[10] = new ASCIICharacter('8', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				║╔═╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[11] = new ASCIICharacter('9', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				╚══╗║
				╔══╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[12] = new ASCIICharacter('A', """
				╔═══╗
				║╔═╗║
				║║─║║
				║╚═╝║
				║╔═╗║
				╚╝─╚╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[13] = new ASCIICharacter('B', """
				╔══╗
				║╔╗║
				║╚╝╚╗
				║╔═╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[14] = new ASCIICharacter('C', """
				╔═══╗
				║╔═╗║
				║║─╚╝
				║║─╔╗
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[15] = new ASCIICharacter('D', """
				╔═══╗
				╚╗╔╗║
				░║║║║
				░║║║║
				╔╝╚╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[16] = new ASCIICharacter('E', """
				╔═══╗
				║╔══╝
				║╚══╗
				║╔══╝
				║╚══╗
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[17] = new ASCIICharacter('F', """
				╔═══╗
				║╔══╝
				║╚══╗
				║╔══╝
				║║░░░
				╚╝░░░
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[18] = new ASCIICharacter('G', """
				╔═══╗
				║╔═╗║
				║║─╚╝
				║║╔═╗
				║╚╩═║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[19] = new ASCIICharacter('H', """
				╔╗─╔╗
				║║─║║
				║╚═╝║
				║╔═╗║
				║║─║║
				╚╝─╚╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[20] = new ASCIICharacter('I', """
				╔══╗
				╚╣╠╝
				░║║░
				░║║░
				╔╣╠╗
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[21] = new ASCIICharacter('J', """
				░░╔╗
				░░║║
				░░║║
				╔╗║║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[22] = new ASCIICharacter('K', """
				╔╗╔═╗
				║║║╔╝
				║╚╝╝
				║╔╗║
				║║║╚╗
				╚╝╚═╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[23] = new ASCIICharacter('L', """
				╔╗░░░
				║║░░░
				║║░░░
				║║─╔╗
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[24] = new ASCIICharacter('M', """
				╔═╗╔═╗
				║║╚╝║║
				║╔╗╔╗║
				║║║║║║
				║║║║║║
				╚╝╚╝╚╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[25] = new ASCIICharacter('N', """
				╔═╗─╔╗
				║║╚╗║║
				║╔╗╚╝║
				║║╚╗║║
				║║─║║║
				╚╝─╚═╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[26] = new ASCIICharacter('O', """
				╔═══╗
				║╔═╗║
				║║─║║
				║║─║║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[27] = new ASCIICharacter('P', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				║╔══╝
				║║░░░
				╚╝░░░
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[28] = new ASCIICharacter('Q', """
				╔═══╗
				║╔═╗║
				║║─║║
				║║─║║
				║╚═╝║
				╚══╗║
				░░░╚╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[29] = new ASCIICharacter('R', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				║╔╗╔╝
				║║║╚╗
				╚╝╚═╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[30] = new ASCIICharacter('S', """
				╔═══╗
				║╔═╗║
				║╚══╗
				╚══╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[31] = new ASCIICharacter('T', """
				╔════╗
				║╔╗╔╗║
				╚╝║║╚╝
				░░║║░░
				░░║║░░
				░░╚╝░░
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[32] = new ASCIICharacter('U', """
				╔╗─╔╗
				║║─║║
				║║─║║
				║║─║║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[33] = new ASCIICharacter('V', """
				╔╗──╔╗
				║╚╗╔╝║
				╚╗║║╔╝
				░║╚╝║░
				░╚╗╔╝░
				░░╚╝░░
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[34] = new ASCIICharacter('W', """
				╔╗╔╗╔╗
				║║║║║║
				║║║║║║
				║╚╝╚╝║
				╚╗╔╗╔╝
				░╚╝╚╝░
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[35] = new ASCIICharacter('X', """
				╔═╗╔═╗
				╚╗╚╝╔╝
				░╚╗╔╝░
				░╔╝╚╗░
				╔╝╔╗╚╗
				╚═╝╚═╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[36] = new ASCIICharacter('Y', """
				╔╗──╔╗
				║╚╗╔╝║
				╚╗╚╝╔╝
				░╚╗╔╝░
				░░║║░░
				░░╚╝░░
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[37] = new ASCIICharacter('Z', """
				╔════╗
				╚══╗═║
				░░╔╝╔╝
				░╔╝╔╝░
				╔╝═╚═╗
				╚════╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[38] = new ASCIICharacter('_', """
				░░░░
				░░░░
				░░░░
				░░░░
				╔══╗
				╚══╝
				░░░░
				░░░░
				""");

		this.ASCIIAlphabet[39] = new ASCIICharacter('a', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╔╗║
				╚╝╚╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[40] = new ASCIICharacter('b', """
				╔╗░░
				║║░░
				║╚═╗
				║╔╗║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[41] = new ASCIICharacter('c', """
				░░░░
				░░░░
				╔══╗
				║╔═╝
				║╚═╗
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[42] = new ASCIICharacter('d', """
				░░╔╗
				░░║║
				╔═╝║
				║╔╗║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[43] = new ASCIICharacter('e', """
				░░░░
				░░░░
				╔══╗
				║║═╣
				║║═╣
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[44] = new ASCIICharacter('f', """
				░╔═╗
				░║╔╝
				╔╝╚╗
				╚╗╔╝
				░║║░
				░╚╝░
				░░░░
				░░░░""");

		this.ASCIIAlphabet[45] = new ASCIICharacter('g', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				╚═╗║
				╔═╝║
				╚══╝""");

		this.ASCIIAlphabet[46] = new ASCIICharacter('h', """
				╔╗░░
				║║░░
				║╚═╗
				║╔╗║
				║║║║
				╚╝╚╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[47] = new ASCIICharacter('i', """
				░░
				░░
				╔╗
				╠╣
				║║
				╚╝
				░░
				░░""");

		this.ASCIIAlphabet[48] = new ASCIICharacter('j', """
				░░░
				░╔╗
				░╚╝
				░╔╗
				░║║
				░║║
				╔╝║
				╚═╝""");

		this.ASCIIAlphabet[49] = new ASCIICharacter('k', """
				╔╗░░
				║║░░
				║║╔╗
				║╚╝╝
				║╔╗╗
				╚╝╚╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[50] = new ASCIICharacter('l', """
				╔╗░
				║║░
				║║░
				║║░
				║╚╗
				╚═╝
				░░░
				░░░""");

		this.ASCIIAlphabet[51] = new ASCIICharacter('M', """
				╔═╗╔═╗
				║║╚╝║║
				║╔╗╔╗║
				║║║║║║
				║║║║║║
				╚╝╚╝╚╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[52] = new ASCIICharacter('n', """
				░░░░
				░░░░
				╔═╗░
				║╔╗╗
				║║║║
				╚╝╚╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[53] = new ASCIICharacter('o', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[54] = new ASCIICharacter('p', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				║╔═╝
				║║░░
				╚╝░░
				""");

		this.ASCIIAlphabet[55] = new ASCIICharacter('q', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				╚═╗║
				░░║║
				░░╚╝""");

		this.ASCIIAlphabet[56] = new ASCIICharacter('r', """
				░░░
				░░░
				╔═╗
				║╔╝
				║║░
				╚╝░
				░░░
				░░░""");

		this.ASCIIAlphabet[57] = new ASCIICharacter('s', """
				░░░░
				░░░░
				╔══╗
				║══╣
				╠══║
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[58] = new ASCIICharacter('t', """
				░╔╗░
				╔╝╚╗
				╚╗╔╝
				░║║░
				░║╚╗
				░╚═╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[59] = new ASCIICharacter('u', """
				░░░░
				░░░░
				╔╗╔╗
				║║║║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[60] = new ASCIICharacter('v', """
				░░░░
				░░░░
				╔╗╔╗
				║╚╝║
				╚╗╔╝
				░╚╝░
				░░░░
				░░░░""");

		this.ASCIIAlphabet[61] = new ASCIICharacter('w', """
				░░░░░░
				░░░░░░
				╔╗╔╗╔╗
				║╚╝╚╝║
				╚╗╔╗╔╝
				░╚╝╚╝░
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[62] = new ASCIICharacter('x', """
				░░░░
				░░░░
				╔╗╔╗
				╚╬╬╝
				╔╬╬╗
				╚╝╚╝
				░░░░
				░░░░""");

		this.ASCIIAlphabet[63] = new ASCIICharacter('y', """
				░░░░░
				░░░░░
				╔╗─╔╗
				║║─║║
				║╚═╝║
				╚═╗╔╝
				╔═╝║░
				╚══╝░""");

		this.ASCIIAlphabet[64] = new ASCIICharacter('z', """
				░░░░░
				░░░░░
				╔═══╗
				╠══║║
				║║══╣
				╚═══╝
				░░░░░
				░░░░░""");

		this.ASCIIAlphabet[65] = new ASCIICharacter('Ñ', """
				╔═╗─╔╗
				║║╚╗║║
				║╔╗╚╝║
				║║╚╗║║
				║║─║║║
				╚╝─╚═╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[66] = new ASCIICharacter('ñ', """
				░░░░
				░══░
				╔═╗░
				║╔╗╗
				║║║║
				╚╝╚╝
				░░░░
				░░░░""");
	}

	/**
	 * Combierte el texto enviado en arte ASCII
	 * 
	 * @version 1.1.0
	 */
	@Override
	public StringBuilder sortASCIISrrays(String Texto) {
		String[][] ContainerArrayCharacter = ArrayASCIICharacter(Texto);
		String[] ArrayLine = new String[this.numberOfRows];

		for (int Line = 0; Line < this.numberOfRows; Line++) {
			String aux = ContainerArrayCharacter[0][Line];
			StringBuilder concatenateLines = new StringBuilder(String.format("%s", aux.substring(0, aux.length() - 1)));
			for (int Lette = 1; Lette < ContainerArrayCharacter.length; Lette++) {
				String LetraActual = ContainerArrayCharacter[Lette][Line];
				char last = aux.charAt(aux.length() - 1);
				char first = LetraActual.charAt(0);

				concatenateLines.append(this.UnionOfEnds(last, first));

				if (Lette < ContainerArrayCharacter.length - 1)
					concatenateLines.append(LetraActual.substring(1, LetraActual.length() - 1));
				else
					concatenateLines.append(LetraActual.substring(1));

				aux = LetraActual;
			}
			ArrayLine[Line] = concatenateLines.toString();
		}

		return this.removeSpaces(ArrayLine);
	}

	/**
	 * Permite remover todos los espacios al final de las lineas y sustitulle los
	 * espacios intermedios por lineas.
	 * 
	 * @param letters un arreglo el cual contendra las lineas que queremos modificar
	 * @return Un StrinBuilder con todos los datos separados por lineas eliminado los espacios
	 *         y saltos de linea innecesarios.
	 */
	private StringBuilder removeSpaces(String[] letters) {
		StringBuilder Container = new StringBuilder("```\n");

		for (int i = 0; i < letters.length; i++) {
			String Linea = letters[i];
			int contador = 0;
			boolean bandera = false;
			for (int index = 0; index < Linea.length(); index++) {
				if (Linea.charAt(index) == '░') {
					contador++;
				} else {
					while (contador > 0) {
						Container.append('─');
						contador--;
					}
					Container.append(Linea.charAt(index));
					bandera = true;
				}
			}
			if (bandera)
				Container.append("\n");
		}
		Container.append("```\n");

		return Container;
	}

	/**
	 * Verifica la union de una letra con atra comprando el final de la primera con
	 * el final de la segunda y determina mediante casos el simbolo de union;
	 * 
	 * @param last  ultimo caraster de la linea
	 * @param first primer caraster le la linea
	 * @return retorn el elemento que se forma al juntar los dos carasteres.
	 */
	private char UnionOfEnds(char last, char first) {
		if (last == first) {
			return first;
		} else if (last == '░') {
			return first;
		} else if (first == '░') {
			return last;
		} else {
			if (last == '║') {
				if (first == '╔' || first == '╚' || first == '╠') {
					return '╠';
				}
			} else if (last == '╗') {
				if (first == '║') {
					return '╣';
				} else if (first == '╔') {
					return '╦';
				} else if (first == '╚') {
					return '╬';
				}
			} else if (last == '╝') {
				if (first == '╚') {
					return '╩';
				} else if (first == '║') {
					return '╣';
				} else if (first == '╔') {
					return '╬';
				}
			} else if (last == '╣') {
				if (first == '╔' || first == '╚') {
					return '╬';
				} else if (first == '║') {
					return '╣';
				}
			}
		}
		return '?';
	}

	/*
	 * Buscar un caracter en el abecedario en caso de no encontrarlo retornara un
	 * error y dara por finalizado el programa
	 */
	private String[][] ArrayASCIICharacter(String Texto) {
		String[][] Container = new String[Texto.length()][];
		for (int i = 0; i < Texto.length(); i++) {
			try {
				Container[i] = this.searchCharacter(Texto.charAt(i));
			} catch (ASCIICharacterNotFound e) {
				e.printStackTrace();
			}
		}
		return Container;
	}
}
